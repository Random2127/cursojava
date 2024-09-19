package com.curso.java.inicio.condicionales;

public class EjercicioLlamada {

	public static void main(String[] args) {

		double duracion = 6;
		double precio = 0;
		double precioFinal = 0;

		String dia = "Domingo";
		int turno = 0;

		// determinamos el valor de la llamada sumada por rango
		if (duracion > 10) {
			precio += (duracion - 10) * 0.5;
			duracion = 10;
		}
		if (duracion > 8) {
			precio += (duracion - 8) * 0.7;
			duracion = 8;
		}
		if (duracion > 5) {
			precio += (duracion - 5) * 0.8;
			duracion = 5;
		}
		if (duracion > 0) {
			precio += duracion * 1.0;

		}

		// Usamos sumatoria para calcular porcentuales de dia y turnos
		if (dia == "Domingo") {
			precioFinal += precio + precio * 0.03;
		} else if (turno >= 6 && turno < 12) {
			precioFinal += precio + precio * 0.15;
		} else if (turno >= 12 && turno < 23) {
			precioFinal += precio + precio * 0.10;
		} else {
			precioFinal += precio - precio * 0.10;
		}

		System.out.println("El precio de su llamada es de " + precioFinal);

	}

}
