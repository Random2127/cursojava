package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class PintAsteriskos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		int numero = 0;

		do {
			System.out.println("\nPintamos formitas");
			System.out.println("=================");
			System.out.println("1. Cuadrado");
			System.out.println("2. Cuadrado hueco");
			System.out.println("3. Triangulo");
			System.out.println("4. Triangulo invertido");
			System.out.println("5. Pirámide");
			System.out.println("6. Pirámide invertida");
			System.out.println("7. Rombo");
			System.out.println("8. Rombo vertices");
			System.out.println("0. Salir");
			System.out.println("=================");

			System.out.println("Elige una forma que construir");
			opcion = Integer.parseInt(sc.nextLine());

			if (opcion != 0) {
				System.out.println("Que número de repeticiones?");
				numero = Integer.parseInt(sc.nextLine());
			}

			switch (opcion) {
			case 1:
				cuadrado(numero);
				break;
			case 2:
				cuadradoHueco(numero);
				break;
			case 3:
				triangulo(numero);
				break;
			case 4:
				trianguloInvert(numero);
				break;
			case 5:
				piramide(numero);
				break;
			case 6:
				piramideInvert(numero);
				break;
			case 7:
				rombo(numero);
				break;
			case 8:
				romboVert(numero);
				break;
			case 0:
				break;
			default:
				System.out.println("Esa opción no es válida.");

			}

		} while (opcion != 0);
		System.out.println("Adios!");
	}

	private static void cuadrado(int numero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	private static void cuadradoHueco(int numero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				if (i == 0 || i == numero - 1 || j == 0 || j == numero - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}

	private static void triangulo(int numero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	private static void trianguloInvert(int numero) {
		// TODO Auto-generated method stub
		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

	private static void piramide(int numero) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= numero; i++) {
			for (int j = i; j < numero; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void piramideInvert(int numero) {
		// TODO Auto-generated method stub
		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < numero - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void rombo(int numero) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= numero; i++) {
			for (int j = i; j < numero; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = numero; a > 0; a--) { // 2
			for (int b = 0; b < numero - a; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < (a * 2 - 1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void romboVert(int numero) {
		// TODO Auto-generated method stub // i = 1
		for (int i = 1; i <= numero; i++) {
			for (int j = i; j < numero; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		numero--;
		for (int a = numero; a > 0; a--) { // 2
			for (int b = 0; b <= numero - a; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < (a * 2 - 1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
