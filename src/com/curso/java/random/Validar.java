package com.curso.java.random;

import java.util.Scanner;

public class Validar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is trying to make a method to validate user input

		int number = 0;
		Scanner sc = new Scanner(System.in);

		number = validarInt(number, sc);

		System.out.println("Output: " + number);
	}

	private static int validarInt(int number, Scanner sc) {

		System.out.println("Input a number: ");
		while (!sc.hasNextInt() ) {
			System.out.println("No es un numero. Prueba otra vez");
			sc.next();
		}
	
		return sc.nextInt();
	}

}


// Trying to get absolute values

//&& sc.hasNextInt()>0