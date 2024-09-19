package com.curso.java.strings;

/*
 * Encontrar la palabra más larga: Identifica la palabra más larga en el texto.
 * Encontrar la palabra que mas se repite en el texto
 * Invertir las palabras: Invierte cada palabra en el texto manteniendo el orden original de las palabras.
 * 
 */
public class StringsTwo {

	public static void main(String[] args) {

		String textoCrudo = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		String texto = textoCrudo.trim();

		String maximo = "";
		String temp = "";
		texto = texto.replace(',', ' ');
		texto = texto.replace('.', ' ');

		// System.out.println(texto);

		for (int i = 0; i < texto.length(); i++) {
			temp += texto.charAt(i);
			if (texto.charAt(i) == ' ') {
				if (temp.length() > maximo.length()) {
					maximo = temp;
					temp = "";

				}

			}
		}

		System.out.println(maximo);

	}

}
