package com.curso.java.arrays;

//Definir un array de enteros de longitud 3
//Vais a dar los valores de cada posición de una en una
//Mostrar 
//+ Uno por uno
//+ Desde un bucle

public class EjercicioArray1 {

	public static void main(String[] args) {

		int[] numeros = new int[3];
		numeros[0] = 9;
		numeros[1] = 8;
		numeros[2] = 7;

		double media = 0;
		int total = 0;
		for (int i = 0; i < numeros.length; i++) {
			total += numeros[i];
			System.out.println(numeros[i]);
		}
		media = total / 3;
		System.out.println(media);

	}

}
