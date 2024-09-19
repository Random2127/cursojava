package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class PintarMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("1. Pintar cuadrado");
			System.out.println("2. Validar email");
			System.out.println("3. Crear alumno");
			System.out.println("4. Salir");

			switch (opcion) {
			case 1:
				System.out.println("Opción 1");
				break;
			case 2:
				System.out.println("Opción 2");
				break;
			case 3:
				System.out.println("Opción 3");
			}
			System.out.println("\nElija una opcion");
			opcion = Integer.parseInt(sc.nextLine());

		} while (opcion != 4);
		System.out.println("Adios!");

	}

}
