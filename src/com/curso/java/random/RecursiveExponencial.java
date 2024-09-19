package com.curso.java.random;

/*
 * Write a Java recursive method to calculate the exponentiation of a 
 * number (base) raised to a power (exponent).
 */
import java.util.Scanner;

public class RecursiveExponencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an int: ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("Enter an exponential: ");
		int expo = Integer.parseInt(sc.nextLine());

		System.out.println("Result: " + recursiveExpo(number, expo));
	}

	private static int recursiveExpo(int number, int expo) {
		if (expo == 0) {
			return 1;
		}
		return number * recursiveExpo(number, expo - 1);

	}
}
