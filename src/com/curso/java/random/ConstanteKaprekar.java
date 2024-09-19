package com.curso.java.random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConstanteKaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean valid = false;
		int resultado = 0;

		while (!valid) {
			System.out.println("Introduce 4 digitos: ");
			input = sc.nextLine();

			valid = longitud(input);
			if (!valid) {
				System.out.println("\nEl número introducido no es válido. Inténtalo de nuevo.");
			}
		}

		resultado = kapre(input);
		while (resultado != 6174) {
			System.out.println("Seguimos el bucle...");
			input = Integer.toString(resultado);
			resultado = kapre(input);
		}
		System.out.println("Hemos llegado al número " + resultado + "!!!");
	}

	// System.out.println(resultado);
	// check for left zeros

	private static int kapre(String input) {
		String ascString = "";
		String desString = "";
		int alto;
		int bajo;
		// input turned into and array of characters and sorted
		char[] numAsc = input.toCharArray();
		Arrays.sort(numAsc);

		// turn charArray to a String
		ascString = new String(numAsc);
		// loop que cambia String de orden
		for (int i = ascString.length() - 1; i >= 0; i--) {
			desString += ascString.charAt(i);
		}
		// COnvertimos a numeros
		bajo = Integer.parseInt(ascString);
		alto = Integer.parseInt(desString);
		int resultado = alto - bajo;
		// imprimimos resultado y lo devolvemos para seguir o no loop
		System.out.println("\nOperamos: " + alto + " - " + bajo + " es igual a " + resultado);
		return resultado;

	}

	private static boolean longitud(String input) {
		// TODO Auto-generated method stub
		if (input.length() != 4) {
			return false;
		}
		Set<Character> charSet = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			charSet.add(input.charAt(i));
		}
		return charSet.size() > 1;

	}

}
