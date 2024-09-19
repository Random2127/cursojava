package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class EstacionesSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mes = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el mes que desee: ");

		mes = sc.nextLine();

		switch (mes.toLowerCase()) {
		case "enero":

		case "febrero":

		case "marzo":
			System.out.println("El mes indicado es de invierno");
			break;
		case "abril":

		case "mayo":

		case "junio":
			System.out.println("El mes indicado es de primavera");
			break;
		case "julio":

		case "agosto":

		case "septiembre":
			System.out.println("El mes indicado es de verano");
			break;
		case "octubre":

		case "noviembre":

		case "diciembre":
			System.out.println("El mes indicado es de otoño");
			break;
		default:
			System.out.println("El mes introducido no es válido.");
		}

	}

}
