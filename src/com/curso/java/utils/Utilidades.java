package com.curso.java.utils;

import java.util.Scanner;

public class Utilidades {

	public static int pideDatoNumerico(String pregunta) {
		System.out.println(pregunta);
		Scanner sc = new Scanner(System.in);
		int numero = Integer.parseInt(sc.nextLine());
		return numero;
	}

	public static String pideDatoString(String pregunta) {
		System.out.println(pregunta);
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		return words;
	}

//	String[] menu = { "aaa", "bbb", "ccc" };
//	Utilidades.pintaMenu(menu);

	public static void pintaMenu(String[] menu) {

		System.out.println();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + ". " + menu[i]);
		}
	}

//	public static String[] creaMenu() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Cuantos puntos quieres poner?");
//		int num = Integer.parseInt(sc.nextLine());
//		String[] menu = new String[num];
//		for (int i = 0; i < num; i++) {
//			System.out.println("Introduce el titulo " + (i + 1) + " del menú: ");
//			menu[i] = sc.nextLine();
//		}
//		return menu;
//	}

}
