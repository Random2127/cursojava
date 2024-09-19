package com.curso.java.carrera.caballos;

public class Carrera {

	private int id;
	private String nombre;
	private Caballo[] caballos;
	private double distancia;

	public Carrera(String nombre, Caballo[] caballos, double distancia) {
		super();
		this.nombre = nombre;
		this.caballos = caballos;
		this.distancia = distancia;
	}

	public Caballo iniciarCarrera() {
		boolean carreraEnCurso = true;
		Caballo ganador = null;

		while (carreraEnCurso) {
			for (Caballo caballo : caballos) {
				caballo.correr();

				if (caballo.getDistanciaTotal() >= distancia) {
					carreraEnCurso = false;
					ganador = caballo;
					break;
				}
			}
		}
		return ganador;
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

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}
