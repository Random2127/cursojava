package com.curso.java.OOP.Cinema;

import java.util.Scanner;

public class MainCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Butacas[][] asientos = new Butacas[4][4];

		Sala sala1 = new Sala(1, "LOTR1", asientos);
		Sala sala2 = new Sala(2, "LOTR2", asientos);
		Sala sala3 = new Sala(2, "LOTR3", asientos);

		Sala[] salas = new Sala[3];
		salas[0] = sala1;
		salas[1] = sala2;
		salas[2] = sala3;

		Espectador cli1 = new Espectador("Mortadelo", "111A");
		Espectador cli2 = new Espectador("Filemon", "222B");
		Espectador cli3 = new Espectador("Ofelia", "333C");

		Espectador[] espectadores = new Espectador[3];
		espectadores[0] = cli1;
		espectadores[1] = cli2;
		espectadores[2] = cli3;

		// Comprobamos si hay entradas suficientes
		int entradas = 0;
		boolean asientoLibre = true;
		while (asientoLibre) {
			entradas = entradas(espectadores, salas, sc);
			int contador = numeroAsientos(entradas, asientos);
			if (contador > entradas) {
				asientoLibre = false;
				break;
			}
			System.out.println("No hay asientos suficientes.");
		}

		// Elegimos pelicula y mostramos asientos
		elegirPeli(entradas, salas, sc);
	}

	private static void elegirPeli(int entradas, Sala[] salas, Scanner sc) {
		// TODO Auto-generated method stub
		for (int i = 0; i < salas.length; i++) {
			System.out.println(i + 1 + " " + salas[i].getTituloPelicula());
		}
		System.out.println("Qué película quiere ver? ");

	}

	private static int entradas(Espectador[] espectadores, Sala[] salas, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Cuantas entradas quiere? ");
		int entradas = Integer.parseInt(sc.nextLine());
		return entradas;
	}

	private static int numeroAsientos(int entradas, Butacas[][] asientos) {
		// TODO Auto-generated method stub
		int contador = 0;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos.length; j++) {
				// System.out.print(asientos[i][j] + " ");
				// Todos los asientos son null
				if (asientos[i][j] == null) {
					contador++;
				}
			}
			System.out.println();
		}
		return contador;

	}

}
