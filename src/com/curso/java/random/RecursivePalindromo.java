package com.curso.java.random;

/*
 *  Write a Java recursive method to check if a given string is a palindrome.
 */
import java.util.Scanner;

public class RecursivePalindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String: ");
		String word = sc.nextLine();

		System.out.println(esPalindromo(word));
	}

	public static boolean esPalindromo(String word) {
		char primChar = word.charAt(0);
		char ultimoChar = word.charAt(word.length() - 1);

		if (word.length() <= 1) {
			return true;
		}

		if (primChar != ultimoChar) {
			return false;
		}

		String restoSubstring = word.substring(1, word.length() - 1);
		return esPalindromo(restoSubstring);
	}

}
