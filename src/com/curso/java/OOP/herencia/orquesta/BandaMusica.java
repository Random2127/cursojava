package com.curso.java.OOP.herencia.orquesta;

public class BandaMusica {

	public static void main(String[] args) {

		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto(banda);

	}

	private void empezarConcierto(BandaMusica banda) {

		Guitarra guitarra1 = new Guitarra("guitarra", "cuerda", false, 6);
		GuitarraElectrica guitarraElec1 = new GuitarraElectrica("Electric", "cuerda", false, 6, 40);
		Piano piano1 = new Piano("Piano", "Cuerda percutida", false, 7, "Cola");
		Tambor tambor1 = new Tambor("Tambor", "Percusion", false, "Cuero");

		Instrumento[] instrument = { guitarra1, guitarraElec1, piano1, tambor1 };

		afinarInstrumentos(instrument);
		tocarInstrumentos(instrument);
	}

	private void afinarInstrumentos(Instrumento[] instrument) {
		for (int i = 0; i < instrument.length; i++) {
			instrument[i].afinar();
		}
	}

	private void tocarInstrumentos(Instrumento[] instrument) {
		for (int i = 0; i < instrument.length; i++) {

			if (instrument[i] instanceof Tambor) {
				((Tambor) instrument[i]).aporrear();
			} else {
				instrument[i].tocar();
			}
		}

		for (Instrumento instrumento : instrument) {
			if (instrumento.getTipo().equalsIgnoreCase("cuerda")) {
				System.out.println("(Guitarras) ♪  ♫  ♪");
			} else if (instrumento.getTipo().equalsIgnoreCase("cuerda percutida")) {
				System.out.println("(Teclas sonando♪) ♫ ♪ ♫");
			} else {
				System.out.println("Porron pom pom");
			}
		}

		boolean suenaBien = true;
		for (int i = 0; i < instrument.length; i++) {
			if (!instrument[i].isAfinar()) {
				suenaBien = false;
			}
		}
		if (!suenaBien) {
			System.out.println("La banda suena mal...:'( ");
		}
	}

}
