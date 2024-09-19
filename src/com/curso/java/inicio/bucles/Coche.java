package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int vehicles;
		int velMax = 0;
		System.out.println("indique el número de coches que quiere comparar");
		vehicles = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= vehicles; i++) {
			System.out.println("indique la velicidad del coche " + i);
			int temp = Integer.parseInt(sc.nextLine());

			if (temp > velMax) {
				velMax = temp;
			}

		}
		System.out.println("El coche más rápido tiene una velocidad de " + velMax + " Km/h");

	}

}
