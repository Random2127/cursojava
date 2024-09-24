package com.curso.java.OOP.herencia.orquesta;

public class Piano extends Instrumento {

	private int numOctavas;
	private String tipoPiano;

	public Piano(String nombre, String tipo, boolean afinar, int numOctavas, String tipoPiano) {
		super(nombre, tipo, afinar);
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}

	@Override
	public void afinar() {
		System.out.println("Afinando el piano..");
		super.afinar();

	}

	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

}
