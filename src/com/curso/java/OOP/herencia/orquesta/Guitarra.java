package com.curso.java.OOP.herencia.orquesta;

public class Guitarra extends Instrumento {

	private int numCuerdas;

	public Guitarra(String nombre, String tipo, boolean afinar, int numCuerdas) {
		super(nombre, tipo, afinar);
		this.numCuerdas = numCuerdas;
	}

	public void afinar() {	
		System.out.println("La guitarra se está afinando..");
		super.afinar();
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

}
