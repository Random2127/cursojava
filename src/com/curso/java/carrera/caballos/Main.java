package com.curso.java.carrera.caballos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Main llamaMain = new Main();
		//llamaMain.method(); This is the correct way to call methods
		
		Caballo caballos[] = new Caballo[3];
		creaCaballos(caballos);

		Carrera[] carreras = new Carrera[2];
		crearCarreras(caballos, carreras);

		crearGranPremio(carreras);

		Apostante[] jugadores = new Apostante[2];
		crearApostantes(jugadores);

		hacerApuestas(sc, jugadores);
		mostrarCarrera(caballos, carreras);

	}

	private static void creaCaballos(Caballo[] caballos) {
		Caballo jaco1 = new Caballo(1, "Jaco1", 6, 33.0, 310);
		Caballo jaco2 = new Caballo(2, "Jaco2", 8, 36.0, 330);
		Caballo jaco3 = new Caballo(3, "Jaco3", 7, 32.0, 290);

		caballos[0] = jaco1;
		caballos[1] = jaco2;
		caballos[2] = jaco3;
	}

	private static void crearCarreras(Caballo[] caballos, Carrera[] carreras) {

		Carrera carr1 = new Carrera("Primera ", caballos, 1000);
		Carrera carr2 = new Carrera("Segunda ", caballos, 2000);

		carreras[0] = carr1;
		carreras[1] = carr2;
		Caballo ganador1 = carr1.iniciarCarrera();
		System.out.println("Ganador de la " + carr1.getNombre() + " carrera: " + ganador1.getNombre());

		Caballo ganador2 = carr2.iniciarCarrera();
		System.out.println("Ganador de la " + carr2.getNombre() + " carrera: " + ganador2.getNombre());

	}

	private static void crearGranPremio(Carrera[] carreras) {

	}

	private static void mostrarCarrera(Caballo[] caballos, Carrera[] carreras) {

	}

	private static void crearApostantes(Apostante[] jugadores) {
		// Nombre, saldo y apuesta

		Apostante jugador1 = new Apostante("Loser1", 1000, 100);
		Apostante jugador2 = new Apostante("Loser2", 1000, 150);

		jugadores[0] = jugador1;
		jugadores[1] = jugador2;

	}

	private static void hacerApuestas(Scanner sc, Apostante[] jugadores) {
		double apuesta;

		for (int i = 0; i < jugadores.length; i++) {
			apuesta = Double.parseDouble(sc.nextLine());
			jugadores[i].setApuesta(apuesta);

		}

	}
}
