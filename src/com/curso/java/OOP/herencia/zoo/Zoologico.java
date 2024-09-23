package com.curso.java.OOP.herencia.zoo;

public class Zoologico {

	public static void main(String[] args) {

		Vaca vaca1 = new Vaca("01", "Lola", 300, "Bradford");
		vaca1.comer();
		vaca1.beber();
		vaca1.mugir();

		Animal vaca2 = new Vaca("02", "Paca", 400, "Rudford");
		vaca2.comer();
		vaca2.beber();
		// vaca2.mugir();
		Vaca vacaMuge = (Vaca) vaca2;
		vacaMuge.mugir();
		// ((Vaca2)vaca2).mugir(); a different way
		System.out.println(vaca2.toString());
	}

}
