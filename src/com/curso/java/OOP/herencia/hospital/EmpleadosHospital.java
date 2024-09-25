package com.curso.java.OOP.herencia.hospital;

public class EmpleadosHospital extends Persona {

	private String turno;

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	@Override
	public void comer() {
		System.out.println("El empleado " + getNombre() + " está comiendo en el comedor.");
	}

	public void fichar() {
		System.out.println("El empleado " + getNombre() + " está fichando.");
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
