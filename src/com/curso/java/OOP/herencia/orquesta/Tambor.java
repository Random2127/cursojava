package com.curso.java.OOP.herencia.orquesta;

public class Tambor extends Instrumento {

	private String material;

	public Tambor(String nombre, String tipo, boolean afinar, String material) {
		super(nombre, tipo, afinar);
		this.material = material;
	}

	@Override
	public void afinar() {
		super.afinar();
		this.setAfinar(true);
	}

	public void aporrear() {
		System.out.println("El tambor está siendo aporreado..\n");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
