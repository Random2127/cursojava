package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class EstacionesSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String estacion = "";
		String mes = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el mes que desee: ");

		mes = sc.nextLine();

		switch (mes.toLowerCase()) {
		case "enero", "febrero", "marzo":
			estacion = "invierno";
			break;
		case "abril", "mayo", "junio":
			estacion = "primavera";
			break;
		case "julio", "agosto", "septiembre":
			estacion = "verano";
			break;
		case "octubre", "noviembre", "diciembre":
			estacion = "otoño";
			break;
		default:
			System.out.println("El mes introducido no es válido.");
			break;
		}
		
		//neesitamos controlar este sysout
		System.out.println("El mes indicado es de " + estacion);

	}

}
