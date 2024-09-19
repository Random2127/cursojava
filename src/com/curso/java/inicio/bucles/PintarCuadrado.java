package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class PintarCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pntamos un cuadrado macizo de *

		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("Elige un número: ");
		opcion = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < opcion; i++) {//fila

			for (int j = 0; j < opcion; j++) {//columna
				System.out.print("* ");

			}
			System.out.println(" ");
		}
	}

}
