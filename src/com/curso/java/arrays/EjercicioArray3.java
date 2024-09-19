package com.curso.java.arrays;

//Pedir cuantos números se van a guardar
//Pedir los valores de cada número
//Mostrar todos los números introducidos
//Reordenar los números de manera inversa en el array
//Mostrar de nuevo todos los números

import java.util.Scanner;

public class EjercicioArray3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamArray;
		int temp;

		System.out.println("Indique el tamaño del array: ");
		tamArray = Integer.parseInt(sc.nextLine());

		int[] numeros = new int[tamArray];
		// IREcogemos valores
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un valor: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		// Imprimimos datos sin modificar
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Invertimos el orden de los valores
		for (int i = 0; i < numeros.length / 2; i++) {
			for (int j = numeros.length - 1; j >= 0; j--) {

				temp = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = temp;

			}
		}
//		Otra manera de invertir orden
//		for (int i = 0, j = numeros.length - 1; i < numeros.length / 2; i++, j--) {
//
//			temp = numeros[i];
//			numeros[i] = numeros[j];
//			numeros[j] = temp;
//		}

		// Imprimimos valores invertidos
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
