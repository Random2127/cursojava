package com.curso.java.arrays;

import java.util.Scanner;

public class EjercicioArray5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[4][4];

		// solicitamos valores
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Introduce el valor de la columna: ");
				numeros[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		System.out.println("Imprimimos lista: ");
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				if (i == j) {
					System.out.print(numeros[i][j] + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		

	}

}
