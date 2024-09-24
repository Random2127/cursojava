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
		// Los métodos no se heredan por la variable en la que están
		// Podemos hacer un casting de la clase para forzarlo
		// CASTING two versions
		Vaca vacaMuge = (Vaca) vaca2;
		// ((Vaca2)vaca2).mugir(); a different way
		vacaMuge.mugir();
		System.out.println(vaca2.toString());

		// Podemos hacer cast en ambas direcciones?
		//
		Animal ani1 = new Animal("4444", "Ani1", 200);
		ani1.comer();
		Vaca vacaNew = (Vaca) ani1;
		vacaNew.comer();

	}

}
