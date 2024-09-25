package com.curso.java.OOP.herencia.hospital;

public class Enfermo extends Persona {

	private String enfermedad;

	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}

	@Override
	public void comer() {
		System.out.println("El enfermo " + getNombre() + " está comiendo en la habitación.");
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

}
