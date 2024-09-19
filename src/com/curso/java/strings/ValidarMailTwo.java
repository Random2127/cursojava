package com.curso.java.strings;

import java.util.Scanner;

public class ValidarMailTwo {

	public static void main(String[] args) {
		String emailCrudo = "  asdasd@as.dasd.easdasdasdsad   ";
		// String email = emailCrudo.trim();
		String subMail;
		String subMail2;

		Scanner sc = new Scanner(System.in);

		int valid;
		int contador;

		do {
			valid = 0;
			contador = 0;

			System.out.println("Introduzca su email: \n");
			String email = sc.nextLine();

			// Comprobamos que no hay blancos
			if (email.contains(" ")) {
				System.out.println("Este email contiene espacios en blanco no válidos.");
			} else {
				System.out.println("Este email no contiene espacios en blanco...OK");
				valid++;
			}

			// Comprobamos que sólo hay una arroba

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					contador++;
				}
			}
			if (contador == 1) {
				System.out.println("Este mail contiene arroba '@'...OK");
				valid++;
			} else {
				System.out.println("Este mail no contiene una arroba.");
			}

			if (valid != 2) {
				System.out.println("Mail no válido.");
			} else {

				// Al menos un punto tras la arroba
				int posArroba = email.indexOf("@");
				if (posArroba != -1) {
					subMail = email.substring(posArroba + 1);
					int posPunto = subMail.indexOf(".");
					if (posPunto > 0) {
						System.out.println("El mail cumple con un punto o más tras la arroba...OK");
						valid++;
					} else {
						System.out.println("El mail no cumple con un punto tras la arroba.");
					}

					// Desde @ hasta . >2

					if (posPunto > 2) {
						System.out.println("Distancia válida entre @ y punto ...OK");
						valid++;
					} else {
						System.out.println("Distancia no válida entre @ y punto.");
					}
				}

				// Tras último punto entre 2 y 5 char
				int lastPunto = email.lastIndexOf(".");
				if (lastPunto != -1) {
					subMail = email.substring(lastPunto + 1);

					int largo = subMail.length();
					if (largo >= 2 && largo <= 5) {
						System.out.println("La longitud de la extension es válida...OK");
						valid++;
					} else {
						System.out.println("La longitud de la extension no es válida.");
					}
				} else {
					System.out.println("El mail no contiene un punto válido.");
				}
			}
		} while (valid != 5);

		System.out.println("\nEmail creado correctamente. ");
	}

}
