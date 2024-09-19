package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class ConjeturaCollatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduzca un número: ");
		numero = Integer.parseInt(sc.nextLine());

		while (numero != 1) {
			if (numero % 2 == 0) {

				numero = numero / 2;
				System.out.println(numero);
			} else {

				numero = numero * 3 + 1;
				System.out.println(numero);
			}
		}

	}

}
