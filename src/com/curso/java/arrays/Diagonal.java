package com.curso.java.arrays;

public class Diagonal {

	public static void main(String[] args) {
		int[][] numeros = new int[4][4];
		int counter = 1;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = counter;
				counter++;
			}
		}

		for (int[] lis : numeros) {
			for (int numero : lis) {
				System.out.print(numero + "  ");
			}
			System.out.println();
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + "   ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

}
