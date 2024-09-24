package com.curso.java.OOP.herencia.orquesta;

public class GuitarraElectrica extends Guitarra {
	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinar, int numCuerdas, double potencia) {
		super(nombre, tipo, afinar, numCuerdas);
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		System.out.println("La guitarra eléctrica está tocando muy alto");
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
