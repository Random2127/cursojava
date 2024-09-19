package com.curso.java.random;

/*
 * Equality of 3 Values
 * Create a function that takes three integer arguments (a, b, c) 
 * and returns the amount of integers which are of equal value.
 * Examples
 * equal(3, 4, 3) ➞ 2
 * equal(1, 1, 1) ➞ 3
 * equal(3, 4, 1) ➞ 0
 * Notes
 * Your function must return 0, 2 or 3. *   
 */

public class EqualsThree {

	public static void main(String[] args) {

		int a = 2, b = 2, c = 2;

		System.out.println(equalsThree(a, b, c));
	}

	private static int equalsThree(int a, int b, int c) {
		int contador = 0;

		if (a == b || a == c) {
			contador = 2;
		}
		if (b == c) {
			contador++;
		}
		return contador;

	}
}
