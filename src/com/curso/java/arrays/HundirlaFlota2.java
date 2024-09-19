package com.curso.java.arrays;

import java.util.Scanner;

public class HundirlaFlota2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] flota = { { 0, 0, 0, 0, 2 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 2, 0, 0, 3, 0 },
				{ 0, 0, 0, 0, 0 }, };

		int columna = 0;
		int fila = 0;
		int counter = 10;
		int hundidos = 0;
		boolean valido = true;

		// Inicio

		do {
			// Mostramos el tablero actualizado

			// çUtilizando char nos permite extender el tablero
			char[] letras = { 'A', 'B', 'C', 'D', 'E' };
			System.out.print("  ");
			for (char let : letras) {
				System.out.print(let + " ");
			}

			// Imprimo el número de la fila y de seguido las fias de la matriz actualizada
			System.out.println();
			for (int i = 0; i < flota.length; i++) {
				System.out.print((i + 1) + " ");

				// LA matriz se actualiza con los dibujos de impaxto '*' o agua'~'
				for (int j = 0; j < flota.length; j++) {

					if (flota[i][j] == -1) {
						System.out.print("* ");
					} else if (flota[i][j] == -2) {
						System.out.print("~ ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();

			}

			System.out.println("\nIntroduce las coordenadas: ");
			System.out.println("Elige una fila (A-E)");
			String letraColumna = sc.nextLine();

			switch (letraColumna.toLowerCase()) {
			case "a":
				columna = 0;
				break;
			case "b":
				columna = 1;
				break;
			case "c":
				columna = 2;
				break;
			case "d":
				columna = 3;
				break;
			case "e":
				columna = 4;
				break;
			}

			System.out.println("Elige una columna: ");
			fila = Integer.parseInt(sc.nextLine()) - 1;

			if (flota[columna][fila] != -1 || flota[columna][fila] != -2) {
				System.out.println("Ya has disparado ahí. ");
				counter--;
			}

			if (flota[columna][fila] == 1) {
				flota[columna][fila] = -1;
				hundidos++;
				// Indica si el barco ha sido completamente hundido
				boolean acorazadoFlota = false;
				// Comprobamos si hay algun otro valor '1' para decidir si el acorazado ha sido
				// completamente hundido
				for (int i = 0; i < flota.length; i++) {
					for (int j = 0; j < flota.length; j++) {
						if (flota[i][j] == 1) {
							acorazadoFlota = true;
							break;
						}
					}
				}

				if (acorazadoFlota) {
					System.out.println("Acorazado tocado!!\n");
				} else {
					System.out.println("Acorazado tocado y hundido!!\n");

				}

			} else if (flota[columna][fila] == 2) {
				System.out.println("Destructor hundido!!\n");
				flota[columna][fila] = -1;
				hundidos++;
			} else if (flota[columna][fila] == 3) {
				System.out.println("Submarino hundido!!\n");
				flota[columna][fila] = -1;
				hundidos++;
			} else {
				System.out.println("Agua!!\n");
				flota[columna][fila] = -2;
				counter--;
			}

			// comprobamos si golpea agua o barco
			// hundidos suma para ganar la partida
//			if (fila == 0 && columna == 4 || fila == 3 && columna == 0) {
//				System.out.println("Destructor hundido!!\n");
//				tablero[fila][columna] = 1;
//				hundidos++;
//			} else if (fila == 1 && columna == 1 || fila == 1 && columna == 2) {
//				System.out.println("Destructor tocado!!\n");
//				tablero[fila][columna] = 1;
//				hundidos++;
//			} else if (fila == 3 && columna == 3) {
//				System.out.println("Submarino hundido!!\n");
//				tablero[fila][columna] = 1;
//				hundidos++;
//			} else {
//				System.out.println("Agua!!\n");
//				tablero[fila][columna] = 1;
//				counter--;
//			}
//
//			if (hundidos == 5) {
//				System.out.println("Has ganado la partida!!!");
//				break;
//			}
//			

			System.out.println("Te quedan " + counter + " oportunidades.\n");

			if (counter == 0) {
				System.out.println("Ya no te quedan más oportunidades :( ");

			}
		} while (counter != 0);
	}

}
