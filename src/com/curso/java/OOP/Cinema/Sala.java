package com.curso.java.OOP.Cinema;

public class Sala {
	private int numero;
	private String tituloPelicula;
	private Butacas[][] butacas;

	public Sala(int numero, String tituloPelicula, Butacas[][] butacas) {
		super();
		this.numero = numero;
		this.tituloPelicula = tituloPelicula;
		this.butacas = butacas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public Butacas[][] getButacas() {
		return butacas;
	}

	public void setButacas(Butacas[][] butacas) {
		this.butacas = butacas;
	}

}
