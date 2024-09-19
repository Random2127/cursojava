package com.curso.java.random;

import java.util.Scanner;

public class RecursiveReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String: ");
		String word = sc.nextLine();

		System.out.println(reverseString(word));
	}

	public static String reverseString(String word) {

		if (word.length() == 0 || word.length() == 1) {
			return word;
		}

		return reverseString(word.substring(1)) + word.charAt(0);
	}
}
