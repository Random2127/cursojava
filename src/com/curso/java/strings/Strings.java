package com.curso.java.strings;

public class Strings {

	public static void main(String[] args) {
//		String fich = "fichero.jpg";
//		int position = fich.lastIndexOf(".");
//		System.out.println("Nombre " + fich.substring(0, position));
//		System.out.println("Extension " + fich.substring(position));

		String texto = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";

		// System.out.println("\nTexto sin espacios: ");
		System.out.println(texto.trim().length());

		System.out.println("\nsegundo linea: ");
		int position = texto.indexOf(".");
		System.out.println(texto.substring(position + 1).trim());

		System.out.println("\nComprobamos si tiene la palabra 'Quijote' :");
		if (texto.toLowerCase().contains("quijote")) {
			System.out.println("Si está la palabra Quijote");
		} else {
			System.out.println("La palabra Quijote no está en el texto");
		}

		// doing with variable plus ternary LOOK OUT FOR ? and :
		// (This works the same as if-else)
		// Better not to use
		String respuestaTernario = texto.contains("Quijote") ? "Si" : "No";
		System.out.println("La palabra Quijote está en el texto? " + respuestaTernario);

		System.out.println();
		int numComas = 0;
		for (int i = 0; i < texto.length(); i++) {

			if (texto.charAt(i) == ',') {
				numComas++;
			}
		}
		// Not sure how this works
		System.out.println(texto.split(",").length - 1);
		// splits building an array and length counts total of elements
		// minus 1 turns elements into number of separators
		System.out.println("El texto contiene " + numComas + " comas");

	}

}