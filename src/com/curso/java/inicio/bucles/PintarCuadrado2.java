package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class PintarCuadrado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pintamos un cuadrado hueco de *

		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("Elige un número: ");
		opcion = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < opcion; i++) {
			for (int j = 0; j < opcion; j++) {
				if (i == 0 || i == opcion - 1 || j == 0 || j == opcion - 1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

}
