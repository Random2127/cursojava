package com.curso.java.OOP.escaparate;

public class Maniqui {

	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public void desvestir() {
		setCamisa(null);
		setPantalon(null);
		setVestido(null);

		System.out.println("El maniquí está desnudo.");
	}

	public void vestir(Camisa camisa, Pantalon pantalon) {
		setCamisa(camisa);
		setPantalon(pantalon);
		System.out.println(
				"Vestimos el maniquí con un pantalón  " + getPantalon().getColor() + " y una camisa " + getCamisa().getColor());
	}

	public void vestir(Vestido vestido) {
		setVestido(vestido);
		System.out.println("Vestimos el maniquí con un vestido " + getVestido().getColor());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

}
