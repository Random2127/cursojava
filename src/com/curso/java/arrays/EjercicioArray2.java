package com.curso.java.arrays;

//Definir un array de nombres de alumnos de longitud (se pregunta). 
//Mostrar solo aquellos alumnos que contengan una a en el nombre
//Longitud de un array se puede sabe con length

import java.util.Scanner;

public class EjercicioArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Indique el tamaño del array: ");
		num = Integer.parseInt(sc.nextLine());

		String[] nombre = new String[num];

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduzca un nombre: ");
			nombre[i] = sc.nextLine();
		}

		System.out.println("Los alumnos introducidos son que contienen 'A o a' son: ");

		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i].toLowerCase().contains("a"))
				System.out.println(nombre[i]);
		}

	}

}
