package com.curso.java.OOP.escaparate;

public class Escaparate {

	public static void main(String[] args) {

		// crear maniquies

		Boton botPant = new Boton("Redondo", "Dorado", "Mediano");
		Boton[] botones = new Boton[6];

		for (int i = 0; i < botones.length; i++) {
			botones[i] = new Boton("Ovalada", "Blanco", "Pequeño");

		}

		Pantalon pantalon = new Pantalon("Azul", "Grande", 24.50, botPant);
		Camisa camisa = new Camisa("Burdeos", "Grande", 19.90, botones);
		Vestido vestido = new Vestido("Naranja-negro", "Pequeña", 26.90);

		Maniqui mani1 = new Maniqui(1, pantalon, camisa);
		Maniqui mani2 = new Maniqui(2, vestido);

		System.out.println("Mostramos escaparate inicial: ");
		mostrarEscaparate(mani1, mani2);

		System.out.println("Desvestimos los maniquies00 1 y 2 y les cambiamos de ropa. ");
		mani1.desvestir();
		mani1.vestir(vestido);
		mani2.desvestir();
		mani2.vestir(camisa, pantalon);

		System.out.println("Mostramos escaparate tras cambio: ");
		mostrarEscaparate(mani1, mani2);
		mostrarPrecio(mani1, mani2);
	}

	private static void mostrarEscaparate(Maniqui mani1, Maniqui mani2) {

		if (mani1.getCamisa() == null) {
			System.out.println("El maniquí 1 lleva un vestido " + mani1.getVestido().getColor());

		} else {
			System.out.println("El maniquí 1 lleva un pantalon " + mani1.getPantalon().getColor() + " y una camisa "
					+ mani1.getCamisa().getColor());
		}
		if (mani2.getCamisa() == null) {
			System.out.println("El maniquí 2 lleva un vestido " + mani2.getVestido().getColor());
		} else {
			System.out.println("El maniquí 2 lleva un pantalon " + mani2.getPantalon().getColor() + " y una camisa "
					+ mani2.getCamisa().getColor());
		}
	}

	private static void mostrarPrecio(Maniqui mani1, Maniqui mani2) {
		double total = 0;
		if (mani1.getCamisa() == null) {
			total += mani1.getVestido().getPrecio();

		} else {
			total += mani1.getCamisa().getPrecio();
			total += mani1.getPantalon().getPrecio();
		}
		System.out.println("El precio total es de " + total + " €");

		total = 0; // reseteamos precio
		if (mani2.getCamisa() == null) {
			total += mani2.getVestido().getPrecio();

		} else {
			total += mani2.getCamisa().getPrecio();
			total += mani2.getPantalon().getPrecio();
		}
		System.out.println("El precio total es de " + total + " €");
	}

}
