package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Tablas1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("\nTabla del " + i + ":");

			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}

			// Damos la opcion de continuar mostrando tablas
			System.out.println("Quiere mostrar la siguiente tabla? (S/N)");
			String opcion = sc.nextLine();
			if (opcion.equalsIgnoreCase("n")) {
				break;
				//We can assign i=11 
			}
		}
	}

}
