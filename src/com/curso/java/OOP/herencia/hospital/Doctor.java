package com.curso.java.OOP.herencia.hospital;

public class Doctor extends EmpleadosHospital {

	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public boolean diagnosticarPaciente(Paciente paciente) {

		if (Math.random() * 10 + 1 > 8) {
			return true;
		} else {
			return false;
		}
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
