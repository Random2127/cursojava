package com.curso.java.random;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// piedra>tijera>papel>
		Scanner sc = new Scanner(System.in);
		String opcion;
		int opcionNum = 0;

		int min = 1;
		int max = 3;

		
		// Unfinished. Wrong looping
		
		
		do {
			int randomNum = (int) (Math.random() * (max - min + 1)) + min;

			System.out.println("Elige piedra(P), papel(L) o tijera(T)");
			opcion = sc.nextLine();

			while (opcionNum == randomNum) {
				System.out.println("Empate, elige de nuevo.");
				opcion = sc.nextLine();
			}

			if (opcion.equalsIgnoreCase("p")) {
				opcionNum = 1;
			} else if (opcion.equalsIgnoreCase("l")) {
				opcionNum = 2;
			} else if (opcion.equalsIgnoreCase("t")) {
				opcionNum = 3;
			} else {
				System.out.println("Esa opción no es válida. Intetalo de nuevo");
			}

			if (opcionNum == 1 && randomNum == 3 || opcionNum == 2 && randomNum == 1
					|| opcionNum == 3 && randomNum == 2) {
				System.out.println("You win!");
			} else {
				System.out.println("I win");
			}
			System.out.println("Quieres jugar de nuevo? (S) o presiona cualquier tecla para salir.");
			opcion = sc.nextLine();
		} while (opcion.equalsIgnoreCase("s"));
	}

}
