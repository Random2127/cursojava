package com.curso.java.utils;

import java.util.Scanner;

public class UtilidadesMatematicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer número a sumar: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el segundo número a sumar: ");
		int num2 = Integer.parseInt(sc.nextLine());
		int resultSuma = suma(num1, num2);
		System.out.println("El resultado de la suma es: " + resultSuma);

		System.out.println("Introduzca el primer operador: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el segundo operador: ");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca la operación a realizar: ");
		String operand = sc.nextLine();

		int operacion = operacion(num1, num2, operand);

		System.out.println("El resultado de la operacion es: " + operacion);

		int[] numeros = { 2, 3, 56, 76, 45, 89 };
		int sumatoria = calcSumatoria(numeros);
		System.out.println("La sumatoria del array es igual a: " + sumatoria);

		int media = calcMedia(numeros);
		System.out.println("La media del array es: " + media);
	}

	private static int suma(int num1, int num2) {
		return num1 + num2;
	}

	private static int operacion(int num1, int num2, String operand) {
		int result = 0;

		if (operand.equals("+")) {
			result = num1 + num2;
		} else if (operand.equals("-")) {
			result = num1 - num2;
		} else if (operand.equals("*")) {
			result = num1 * num2;
		} else if (operand.equals("/")) {
			if (num2 == 0) {
				System.out.println("No se puede dividir por cero. ");
			} else {
				result = num1 / num2;
			}

		}
		return result;
	}

	private static int calcSumatoria(int[] numeros) {
		int total = 0;
		for (int i = 0; i < numeros.length; i++) {
			total += numeros[i];
		}

		return total;
	}

	private static int calcMedia(int[] numeros) {
		return calcSumatoria(numeros) / numeros.length;
	}
}
