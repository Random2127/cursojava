package com.curso.java.inicio.condicionales;

public class CondicionalesIf {

	public static void main(String[] args) {

		int numero = 0;

		System.out.println("INICIO");

		if (!(numero > 10)) {
			System.out.println("El número es mayor de 10");
		} else if (numero >= 0 && numero < 5) {
			System.out.println("El número está entre cero y cinco");

		} else if (numero >= 5) {
			System.out.println("El númerop está entre 5 y 10");

		} else {
			System.out.println("El número es menor de 0");
		}
		if (numero != 10) {
			System.out.println("El número no es 10");
		}

		System.out.println("FIN");
	}

}
