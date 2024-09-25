package com.curso.java.OOP.herencia.hospital;

public class Paciente extends Persona {

	private String[] sintomas;

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}

	@Override
	public void comer() {
		System.out.println("El paciente " + getNombre() + " está comiendo en la cafetería.");

	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

}
