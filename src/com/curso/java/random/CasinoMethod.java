package com.curso.java.random;

import java.util.Scanner;

public class CasinoMethod {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int saldo = 500;
		int apuesta;
		int numeroUser;
		String opcion = "";
		do {
			System.out.println("BIENVENIDO AL CASINO!!");
			System.out.println("======================");
			System.out.println("Tu saldo se de: " + saldo + "€");

			System.out.println("Cuanto quieres apostar?");
			apuesta = Integer.parseInt(sc.nextLine());

			// comprobamos fondos
			while (saldo < apuesta) {
				System.out.println("No tienes tanto dinero. Prueba de nuevo.");
				apuesta = Integer.parseInt(sc.nextLine());
			}
			saldo -= apuesta; // Reajustamos saldo

			// comprobamos validez de rango
			System.out.println("A que número quieres apostar? (1 al 36)");
			numeroUser = Integer.parseInt(sc.nextLine());
			while (numeroUser < 0 || numeroUser > 37) {
				System.out.println("Número fuera de rango. Elige de nuevo.");
				numeroUser = Integer.parseInt(sc.nextLine());
			}

			System.out.println("Has apostado al número " + numeroUser);

			int min = 0;
			int max = 36;
			int random = (int) (Math.random() * (max - min + 1));
			//int random = (int) (Math.random() * (max - min + 1)) + min;

			if (numeroUser == random) {

				System.out.println("Enhorabuena!!!\n Has ganado" + apuesta * 36);
			} else {
				System.out.println("Has perdido!! :(");
			}
			if (saldo <= 0) {
				System.out.println("Has perdido todo tu dinero. Vete a currar un poquito anda!");
				opcion = "n";
			} else {
				System.out.println("Quieres jugar de nuevo? (S/N)");
				opcion = sc.nextLine();
				if (opcion.equalsIgnoreCase("n")) {
					System.out.println("Lamentamos que te vayas. Tu saldo restante es " + saldo);
				}
			}

		} while (opcion.equalsIgnoreCase("s"));

	}

}
