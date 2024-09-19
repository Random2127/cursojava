package com.curso.java.carrera.caballos;

public class GranPremio {
	private int id;
	private String nombre;
	private String[] Carreras;

	public GranPremio(String nombre, String[] carreras) {
		super();
		this.nombre = nombre;
		Carreras = carreras;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getCarreras() {
		return Carreras;
	}

	public void setCarreras(String[] carreras) {
		Carreras = carreras;
	}

}
