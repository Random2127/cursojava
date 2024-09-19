package com.curso.java.metodos;

import java.util.Scanner;

public class Metodos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nMétodo longitud palabra");
		System.out.println("Introduzca una palabra: ");
		String word = sc.nextLine();
		// +int longitud = longitud(word);
		System.out.println("El tamaño de la palabra es de " + longitud(word) + " caracteres");

		System.out.println("\nMétodo devolver String ");
		System.out.println("Introduzca una palabra: ");
		String input = sc.nextLine();
		System.out.println("Cuantas veces quiere repetirlo? ");
		int numero = Integer.parseInt(sc.nextLine());
		textoMultiplicado(input, numero);

		System.out.println("\nMétodo tabla multiplicar");
		System.out.println("Introduzca un valor a multiplicar");
		numero = Integer.parseInt(sc.nextLine());
		tablaMultiplicar(numero);

		System.out.println("");

	}

	private static void tablaMultiplicar(int numero) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

	private static void textoMultiplicado(String input, int numero) {

		for (int i = 0; i < numero; i++) {
			System.out.println(input);
		}
	}

	private static int longitud(String word) {
		int longitud = word.length();
		return longitud;

	}

}
