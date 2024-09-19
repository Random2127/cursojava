package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class TablaMulti {

	public static void main(String[] args) {

		int input;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número de la tabla que desea: ");
		input = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= 10; i++) {

			System.out.println(input + " x " + i + " es igual a " + (input * i));
		}

	}

}
