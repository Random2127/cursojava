package com.curso.java.OOP;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String dni;

	
	public Persona(String nombre, String apellido, int edad, String dni) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;

	}

	public void correr() {
		System.out.println("La persona " + this.getNombre() + " está corriendo...");
	}

	public void comer() {
		System.out.println("La persona " + this.getNombre() + " está comiiendo...");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
	}

}
