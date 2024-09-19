package com.curso.java.arrays;

//+ Definir array bidimensional de enteros de 2x3
//+ Dar los valores de cada posición de una en una
//+ Mostrar todos los datos en formato matriz con dos for anidados

//+ Hacer los mismo con 2 foreach

import java.util.Scanner;

public class EjercicioArray4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[2][3];

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Introduce el valor de la columna: ");
				numeros[i][j] = Integer.parseInt(sc.nextLine());

			}
		}

		for (int[] fila : numeros) {

			for (int j : fila) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

}
