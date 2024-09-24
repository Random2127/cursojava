package com.curso.java.OOP.herencia.orquesta;

public class Instrumento {
	private String nombre;
	private String tipo;
	private boolean afinar;

	public Instrumento(String nombre, String tipo, boolean afinar) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinar = afinar;
	}

	public void afinar() {

		double rand = Math.random();

		if (rand > 0.4) {
			System.out.println("El instrumento " + nombre + " está afinado\n");
			this.afinar = true;
		}
		// this.afinar = Math.random() > 0.4; This will give true

	}

	public void tocar() {
		System.out.println("El instrumento " + nombre + " está tocando.");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAfinar() {
		return afinar;
	}

	public void setAfinar(boolean afinar) {
		this.afinar = afinar;
	}

}
