package com.curso.java.random;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 3, 57, 7, 65, 12, 73, 45 };

		int temp;
		boolean cambio;

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + ", ");
		}

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {

				// encontramos que b>a temp =a; a =b;
				if (numeros[j] > numeros[j + 1]) {
					temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}

		}
		System.out.println();
		for (int a = 0; a < numeros.length; a++) {

			System.out.print(numeros[a] + ", ");
		}
	}
}
