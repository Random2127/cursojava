package com.curso.java.inicio.condicionales;

import java.util.Scanner;

public class EvaluacionFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Variables para calculo de notas

		double examAvg = 0;
		double proyectoAvg = 0;
		double participacion = 0;
		double notaFinal;

		// Alumnos
		String alum = "";

		for (int i = 0; i < 2; i++) {
			System.out.println("Introduzca el nombre del alumno");
			alum = sc.nextLine();
			examAvg = notaExamen(examAvg, sc);

			if (examAvg < 50) {
				System.out.println("El alumno " + alum + " no ha superado los exámenes y no recibirá nota.\n");
			} else {
				proyectoAvg = notaProyecto(proyectoAvg, sc);
				participacion = participacion(participacion, sc);
				notaFinal = examAvg * 0.5 + proyectoAvg * 0.4 + participacion * 0.1;

				if (proyectoAvg > 90 && participacion > 70) {
					notaFinal += notaFinal * 0.05;
				} else if (participacion < 30) {
					notaFinal -= notaFinal * 0.1;
				}
				if (notaFinal >= 100) {
					System.out.println("El alumno " + alum + "ha recibido matrícula de honor (Excede los 100 puntos");
				} else {
					System.out.println("El alumno " + alum + "ha sacado una calificación final de: " + notaFinal);
				}

			}
		}
	}

	private static double notaExamen(double examAvg, Scanner sc) {
		double exam1 = 0;
		double exam2 = 0;
		System.out.println("Introduzca la nota del primer examen: ");
		exam1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca la nota del segundo examen: ");
		exam2 = Double.parseDouble(sc.nextLine());
		examAvg = (exam1 + exam2) / 2;
		return examAvg;

	}

	private static double notaProyecto(double proyectoAvg, Scanner sc) {
		double proyecto1 = 0;
		double proyecto2 = 0;
		System.out.println("Introduzca la nota del primer proyecto: ");
		proyecto1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca la nota del segundo proyecto : ");
		proyecto2 = Double.parseDouble(sc.nextLine());
		proyectoAvg = (proyecto1 + proyecto2) / 2;
		return proyectoAvg;

	}

	private static double participacion(double participacion, Scanner sc) {
		System.out.println("Indique la participación del alumno");
		participacion = sc.nextDouble();
		sc.nextLine();
		return participacion;

	}
}
