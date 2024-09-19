package com.curso.java.arrays;

public class MatrizA3D {

	public static void main(String[] args) {
		int[][][] numbers = new int[4][5][7];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("i");
			for (int j = 0; j < numbers.length; j++) {
				System.out.print("j");
				for (int k = 0; k < numbers.length; k++) {
					System.out.print("k");
					numbers[i][j][k] = k;
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int[][] fila1 : numbers) {
			for (int[] fila2 : fila1) {
				for (int fila3 : fila2) {
					System.out.print(fila3 + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

//		No podemos utilizar iteradores con "Array"
//		Iterator<Integer> itr = numbers.literator();
//		while(itr.hasNext()) {
//			
//		}
	}

}
