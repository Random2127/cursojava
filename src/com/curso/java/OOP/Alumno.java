package com.curso.java.OOP;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellidos;
	private double nota;
	private boolean mayorEdad;

	public Alumno() {

	}

	public Alumno(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	public Alumno(String dni, String nombre, String apellidos, double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}

	public Alumno(String dni, String nombre, String apellidos, double nota, boolean mayorEdad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		this.mayorEdad = mayorEdad;
	}

	public void verNota() {

		if (mayorEdad) {
			if (this.getNota() == 0) {
				System.out.println("El alumno " + this.getNombre() + " no ha estudiado nada");
			} else if (this.getNota() < 5) {
				System.out.println("El alumno " + this.getNombre() + " ha estudiado poco");
			} else if (this.getNota() >= 5 && this.getNota() <= 9) {
				System.out.println("El alumno " + this.getNombre() + " ha estudiado mucho");
			} else if (this.getNota() == 10) {
				System.out.println("El alumno " + this.getNombre() + " es un genio");
			} else {
				System.err.println("Esa nota no es válida. ");
			}
		} else {
			System.out.println("No tienes permisos para ver ver la nota. ");
		}

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	@Override
	public String toString() {
		return "Alumno nombre " + this.getNombre() + " apellidos " + this.getApellidos() + " con DNI " + this.getDni()
				+ " ha obtenido la nota " + this.getNota();
	}

}
