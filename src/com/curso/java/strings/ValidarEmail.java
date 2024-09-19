package com.curso.java.strings;

import java.util.Scanner;

/*
 * Introduce tu email (a partir de un email proporcionado). Vamos a validar si el email es correcto o no. Para ello vamos a pasar las siguientes validaciones
   asdasd@as.dasd.easdasdasdsad   

1. El email solo contiene una @
2. El email no puede contener espacios en blanco 
3. Despues de la @ debe de haber al menos un punto
4. Entre la @ y el primer punto que esté depués tiene que haber una separación de 2 caracteres
5. Después del último punto tiene que haber entre 2 y 5 caracteres

Si no cumple validación se indica por qué


Más complicado
===========================
Si el email es incorrecto preguntarle al usuario por un nuevo email hasta que sea correcto
 */
public class ValidarEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String emailCrudo = "  asdasd@as.dasd.easdasdasdsad   ";
		// String email = emailCrudo.trim();
		String subMail;
		String subMail2;

		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();

		int valid;
		int contador;

		do {

			valid = 0;
			contador = 0;

			System.out.println("Introduzca su email: \n");
			email = sc.nextLine();

			// Comprobamos que no hay blancos
			if (email.contains(" ")) {
				System.out.println("Este email contiene espacios en blanco no válidos");
			} else {
				System.out.println("Este email no contiene espacios en blanco");
				valid++;
			}

			// Comprobamos que sólo hay una arroba

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					contador++;
				}
			}
			if (contador == 1) {
				System.out.println("Este mail contiene arroba '@'");
				valid++;
			} else {
				System.out.println("Este mail no contiene una arroba válida");
			}

			// Al menos un punto tras la arroba
			int posArroba = email.indexOf("@");
			subMail = email.substring(posArroba);
			int posPunto = subMail.indexOf(".");
			if (posPunto > 0) {
				System.out.println("El mail cumple con un punto o más tras la arroba");
				valid++;
			}
			// Desde @ hasta . >2
			subMail2 = subMail.substring(0, posPunto);
			if (subMail.length() > 2) {
				System.out.println("Distancia válida");
				valid++;
			}

			// Tras último punto entre 2 y 5 char

			int lastPunto = email.lastIndexOf(".");
			subMail = email.substring(lastPunto);

			int largo = subMail.length();
			if (largo > 1 && largo <= 5) {
				System.out.println("La longitud de la extension es válida. ");
				valid++;

			}
		} while (valid != 5);
	}

}
