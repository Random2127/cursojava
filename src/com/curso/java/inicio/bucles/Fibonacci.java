package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input;
		int n0 = 0;
		int n1 = 1;
		int temp;

		System.out.println("Inserte el número de fibonacci que desea: ");
		// Restamos 2 por los valores iniciales
		input = Integer.parseInt(sc.nextLine()) - 2;

		if (input > 0) {
			System.out.println("Numeros fibonacci: ");
			if (n0 == 0 && n1 == 1) {
				System.out.print(n0 + ", " + n1);
			}

			for (int i = 0; i < input; i++) {

				temp = n1;
				n1 = n0 + n1;
				n0 = temp;

				System.out.print(", " + n1);

			}

		}
		//
				

	}

}
