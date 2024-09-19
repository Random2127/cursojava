package enunciados;

import java.util.Scanner;

//Escribe un programa que pida al usuario una palabra y verifique si la primera 
//letra es una vocal (a, e, i, o, u). Muestra un mensaje indicando si es o no una vocal.
public class VocalInicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra: ");
		String palabra = sc.nextLine().trim().toLowerCase();
		int numLetras = palabra.length();
		System.out.println("La palabra tiene " + numLetras + " letras");

		char inicial = palabra.charAt(0);

		if ("aeiou".indexOf(inicial) != -1) {
			System.out.println("Empieza por vocal");
		} else {
			System.out.println("Empieza por consonante");
		}
	}

}
