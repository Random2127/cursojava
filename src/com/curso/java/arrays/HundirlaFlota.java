package com.curso.java.arrays;

import java.util.Scanner;

public class HundirlaFlota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] flota = { { 0, 0, 0, 0, 2 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 2, 0, 0, 3, 0 },
				{ 0, 0, 0, 0, 0 }, };
		int[][] tablero = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, };

		int fila = 0;
		int columna = 0;
		int counter = 10;
		int hundidos = 0;

		// Inicio

		do {
			// Mostramos el tablero actualizado
			for (int i = 0; i < tablero.length; i++) {

				for (int j = 0; j < tablero.length; j++) {
					System.out.print(tablero[i][j] + " ");
				}
				System.out.println();

			}

			System.out.println("\nIntroduce las coordenadas: ");
			System.out.println("Elige una fila (A-E)");
			String letraFila = sc.nextLine();

			switch (letraFila.toLowerCase()) {
			case "a":
				fila = 0;
				break;
			case "b":
				fila = 1;
				break;
			case "c":
				fila = 2;
				break;
			case "d":
				fila = 3;
				break;
			case "e":
				fila = 4;
				break;
			}

			System.out.println("Elige una columna: ");
			columna = Integer.parseInt(sc.nextLine()) - 1;

			// comprobamos si golpea agua o barco
			// hundidos suma para ganar la partida
			if (fila == 0 && columna == 4 || fila == 3 && columna == 0) {
				System.out.println("Destructor hundido!!\n");
				tablero[fila][columna] = 1;
				hundidos++;
			} else if (fila == 1 && columna == 1 || fila == 1 && columna == 2) {
				System.out.println("Destructor tocado!!\n");
				tablero[fila][columna] = 1;
				hundidos++;
			} else if (fila == 3 && columna == 3) {
				System.out.println("Submarino hundido!!\n");
				tablero[fila][columna] = 1;
				hundidos++;
			} else {
				System.out.println("Agua!!\n");
				tablero[fila][columna] = 1;
				counter--;
			}

			if (hundidos == 5) {
				System.out.println("Has ganado la partida!!!");
				break;
			}
			

			System.out.println("Te quedan " + counter + " oportunidades.\n");

			if (counter == 0) {
				System.out.println("Ya no te quedan más oportunidades :( ");

			}
		} while (counter != 0);

	}

}
