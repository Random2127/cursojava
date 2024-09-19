package enunciados;

import java.util.Scanner;

//Escribe un programa que pida al usuario una frase y cuente cuántas palabras hay en esa frase. 
//Puedes asumir que las palabras están separadas por un solo espacio.

public class CuentaPalabras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine().trim();
		frase = frase.trim();

		// Contamos palabras
		int cuentaPalabras = frase.split("\\s+").length;
		System.out.println("El número de palabras es: " + cuentaPalabras);

		// invertimos orden de frase
		String[] singleWords = frase.split("\\s+");
		String[] reverseWords = new String[cuentaPalabras];

		for (int i = 0; i < singleWords.length; i++) {

			reverseWords[i] = singleWords[singleWords.length - 1 - i];
		}

		System.out.println(String.join(" ", reverseWords));

	}

}
