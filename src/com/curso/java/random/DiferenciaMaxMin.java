package com.curso.java.random;

/*
 * Create a function that takes an array and returns the difference between the biggest and smallest numbers.
 *  
 */
public class DiferenciaMaxMin {

	public static void main(String[] args) {

		int[] lista = { 23, 354, 456, 56, 32, 87, 12, 567, 78 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < lista.length; i++) {

			if (max < lista[i]) {
				max = lista[i];
			}
			if (min > lista[i]) {
				min = lista[i];
			}
		}

		int diff = max - min;

		System.out.println("Max: " + max + "\nMin: " + min + "\ndiff: " + diff);

	}

}
