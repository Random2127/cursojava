package com.curso.java.arrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		int temp;

		int[] numeros = { 23, 45, 798, 1, 34, 56 };

		for (int a = 0; a < numeros.length; a++) {
			System.out.println(numeros[a]);
		}

		for (int i = 0; i < numeros.length; i++) {

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[i] > numeros[j]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}

		System.out.println("After sorting: ");
		for (int a = 0; a < numeros.length; a++) {
			System.out.println(numeros[a]);
		}

	}

}
