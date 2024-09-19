package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class EjercicioEstaciones {

	public static void main(String[] args) {

		String mes = "";
		String estacion = "";
		String mesMinus = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el mes que desee: ");

		mes = sc.nextLine();
		mesMinus = mes.toLowerCase();

		if (mesMinus.equals("enero") || mesMinus.equals("febrero") || mesMinus.equals("marzo")) {
			estacion = "Invierno";
		} else if (mesMinus.equals("abril") || mesMinus.equals("mayo") || mesMinus.equals("junio")) {
			estacion = "Primavera";
		} else if (mesMinus.equals("julio") || mesMinus.equals("agosto") || mesMinus.equals("septiembre")) {
			estacion = "Verano";
		} else if (mesMinus.equals("octubre") || mesMinus.equals("noviembre") || mesMinus.equals("diciembre")) {
			estacion = "Otoño";
		}

		if (estacion.equals("")) {
			System.out.println(mes + " No es un mes válido.");
		} else {
			System.out.println("El " + mes + " pertenece a la estación de " + estacion);
		}
	}
}
