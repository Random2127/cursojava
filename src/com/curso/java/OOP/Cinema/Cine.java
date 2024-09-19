package com.curso.java.OOP.Cinema;

public class Cine {
	private String nombre;
	private int salas;
	public Cine(String nombre, int salas) {
		super();
		this.nombre = nombre;
		this.salas = salas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalas() {
		return salas;
	}

	public void setSalas(int salas) {
		this.salas = salas;
	}

}
