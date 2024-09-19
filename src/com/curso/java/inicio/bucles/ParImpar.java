package com.curso.java.inicio.bucles;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0, j = 99; i < 100; i++, j--) {

			if (i % 2 == 0) {
				System.out.println(i + "," + j);
			}

		}
		//

		int a = 0;
		int b = 99;

		while (a < 100) {

			if (a % 2 == 0) {
				System.out.println(a + "," + b);
			}
			a++;
			b--;

		}

	}
	/*
	 * for (int i=2, j=99; i<=100; i+=2,j-=2){
	 * 
	 * sysout(i+ " " + j)
	 * 
	 * for (int i=2; i<=100; i+=2){
	 * 
	 * sysout(i+ " " +(101-i))
	 */

}
