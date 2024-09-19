package com.curso.java.inicio.condicionales;

public class EjercicioLlamadaEasy {

	public static void main(String[] args) {

		// DOuble check

		double duracion = 6;
		double precio = 0;
		double precioFinal = 0;

		String dia = "";
		int turno = 10;

		// determinamos el valor de la llamada sumada por rango
		if (duracion > 10) {
			precio += (duracion - 10) * 0.5;
		}
		if (duracion > 8 && duracion <= 10) {
			precio += 0.7;
		}
		if (duracion > 5 && duracion <= 8) {
			precio += 0.8;
		}
		if (duracion > 0 && duracion <= 5) {
			precio += 1.0;

		}

		// Usamos sumatoria para calcular porcentuales de dia y turnos
		if (dia == "Domingo") {
			precioFinal = precio + precio * 0.3;
		} else if (turno >= 6 && turno < 12) {
			precioFinal = precio + precio * 0.15;
		} else if (turno >= 12 && turno < 23) {
			precioFinal = precio + precio * 0.10;
		} else {
			precioFinal = precio - precio * 0.10;
		}

		System.out.println("El precio de su llamada es de " + precioFinal);

	}

}
