package com.curso.java.OOP.herencia.hospital;

public class Enfermero extends EmpleadosHospital {
	private int planta;

	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public void atenderPaciente() {

	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
}
