package com.curso.java.carrera.caballos;

public class Caballo {

	private int id;
	private String nombre;
	private int edad;
	private double velocidad;
	private double peso;
	private double distanciaTotal;

	public Caballo(int dorsal, String nombre, int edad, double velocidad, double peso) {
		super();
		this.id = dorsal;
		this.nombre = nombre;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
		this.distanciaTotal = 0;
	}

	public void correr() {
		distanciaTotal += velocidad * ((Math.random() * ((20 - 1) + 1)) + 1) - peso * 0.1 - edad * 0.15;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getDistanciaTotal() {
		return distanciaTotal;
	}

	public void setDistanciaTotal(double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}

}
