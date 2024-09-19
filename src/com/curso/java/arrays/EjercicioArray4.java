package com.curso.java.arrays;

import java.util.Scanner;

//+ Definir array bidimensional de enteros de 2x3
//+ Dar los valores de cada posición de una en una
//+ Mostrar todos los datos en formato matriz con dos for anidados

public class EjercicioArray4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos una matriz 2x3
		int[][] numeros = new int[2][3];

		// Solicitamos valores
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Introduce el valor de la columna: ");
				numeros[i][j] = Integer.parseInt(sc.nextLine());

			}
		}

		// imprimimos valores en filas
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();

		}
	}

}
