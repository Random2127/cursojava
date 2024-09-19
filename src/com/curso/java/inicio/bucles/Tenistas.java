package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Tenistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int contador = 0;
		String tenista = "";

		// int ranking = 100;
		int ranking = Integer.MAX_VALUE;
		// We user a wrapper Integer with MAX to assign the max value that an int can
		// have (2147483647)

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el número de tenistas a introducir. ");

		numero = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= numero; i++) {

			System.out.println("Indique el nombre del tenista: ");
			String nombreTmp = sc.nextLine();
			System.out.println("Que posición ocupa en el ranking: ");
			int numeroTmp = Integer.parseInt(sc.nextLine());

			if (numeroTmp <= 10) {
				contador++;
			}
			if (numeroTmp < ranking) {
				ranking = numeroTmp;
				tenista = nombreTmp;

			}

		}
		System.out.println("El mejor tenista es " + tenista + " en el ranking " + ranking);
		System.out.println("Hay " + contador + " tenistas en el top 10");
	}

}
