package com.curso.java.utils;

import java.util.Random;
import java.util.Scanner;

public class CarreraCaballos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos caballos van a competir? ");
		int numeroCaballos = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el nombre de " + numeroCaballos + " caballos.");
		String[] nombreCaballos = new String[numeroCaballos];

		for (int i = 0; i < numeroCaballos; i++) {
			System.out.println("introduce el nombre del caballo" + i + 1);
			nombreCaballos[i] = sc.nextLine();
		}
		// numeroCaballos como length
		int[] runCaballos = new int[5];
		int meta = 100;
		boolean llegarMeta = false;
		Random random = new Random();

		while (!llegarMeta) {
			for (int i = 0; i < runCaballos.length; i++) {
				runCaballos[i] += random.nextInt(10) + 1;
				if (runCaballos[i] >= meta) {
					llegarMeta = true;
					System.out.println("El caballo " + i + " ha llegado a " + meta);

				}

			}
		}

	}

}
