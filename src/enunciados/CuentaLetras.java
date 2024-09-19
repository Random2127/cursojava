package enunciados;

import java.util.Scanner;

//Escribe un programa que solicite al usuario que introduzca una palabra y 
//luego muestre cuántas letras tiene esa palabra (sin contar espacios).

public class CuentaLetras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra: ");
		String palabra = sc.nextLine().trim();

		int numLetras = palabra.length();
		System.out.println("La palabra tiene " + numLetras + " letras");

	}

}
