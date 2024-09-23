package com.curso.java.OOP.herencia.zoo;

public class Vaca extends Animal {
	private String tipo;

	public Vaca(String id, String nombre, double peso, String tipo) {
		super(id, nombre, peso);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mugir() {
		System.out.println("La vaca " + this.getNombre() + " está mugiendo.");
	}

	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getPeso()="
				+ getPeso() + "]";
	}
	
}
