package com.curso.java.inicio.condicionales;

/*
 * 
+Exámenes: hay dos exámenes, cada uno con un peso del 30% de la nota final.
+Proyectos: hay dos proyectos, cada uno con un peso del 20% de la nota final.
+Participación: la participación en clase tiene un peso del 10% de la nota final.


Si la nota media de los exámenes es inferior a 50, el estudiante falla automáticamente.
Si la nota media de los proyectos es superior a 90 y la participación es mayor a 70, se añade un 5% a la nota final.
Si la participación es inferior a 30, se resta un 10% de la nota final.
Tarea:

Escribe un programa en Java que:

Solicite las calificaciones de los exámenes, los proyectos y la participación de tres estudiantes.
Calcule la nota final basada en los pesos indicados.
Aplique las reglas adicionales para modificar la nota final.
Determine si el estudiante pasa o falla el curso basado en la nota final ajustada.
Imprima la nota final y el estado (pasa/falla) del estudiante.
 */
import java.util.Scanner;

public class Evaluacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variables para calculo de notas
		double exam1 = 0;
		double exam2 = 0;
		double examAvg = 0;

		double proyecto1 = 0;
		double proyecto2 = 0;
		double proyectoAvg = 0;

		double participacion = 0;
		double notaFinal;

		// Alumnos
		String alum1;
		String alum2;

		System.out.println("\nIntroduzca el nombre del alumno");
		alum1 = sc.nextLine();

		// Solicitamos notas de examenes y calculamos media
		System.out.println("Introduzca la nota del primer examen: ");
		exam1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundo examen: ");
		exam2 = sc.nextDouble();
		

		// Pedimos notas de proyectos y calculamos media
		System.out.println("Introduzca la nota del primer proyecto: ");
		proyecto1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundo proyecto : ");
		proyecto2 = sc.nextDouble();
		proyectoAvg = (proyecto1 + proyecto2) / 2;

		// Solicitamos participación
		System.out.println("Indique la participación del alumno");
		participacion = sc.nextDouble();

		// Calculamos media total
		notaFinal = examAvg * 0.5 + proyectoAvg * 0.4 + participacion * 0.1;

		// Definimos condiciones para la modificacion de las notas
		if (examAvg < 50) {
			System.out.println("\nEl alumno " + alum1 + " no ha superado la nota mínima de aprobado.");
		} else {
			if (proyectoAvg > 90 && participacion > 70) {
				notaFinal = notaFinal + notaFinal * 0.05;
			}
			if (participacion < 30) {
				notaFinal = notaFinal - notaFinal * 0.1;
			}

			if (notaFinal >= 100) {
				System.out.println("El alumno ha recibido matrícula de honor");
			} else {
				System.out.println("El alumno " + alum1 + "ha sacado una calificación final de: " + notaFinal);
			}
		}

		// ALUMNO2
		//

		System.out.println("\nIntroduzca el nombre del alumno");
		alum2 = sc.nextLine();

		// Solicitamos notas de examenes y calculamos media
		System.out.println("Introduzca la nota del primer examen: ");
		exam1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundo examen: ");
		exam2 = sc.nextDouble();
		examAvg = (exam1 + exam2) / 2;

		// Pedimos notas de proyectos y calculamos media
		System.out.println("Introduzca la nota del primer proyecto: ");
		proyecto1 = sc.nextDouble();
		System.out.println("Introduzca la nota del segundo proyecto : ");
		proyecto2 = sc.nextDouble();
		proyectoAvg = (proyecto1 + proyecto2) / 2;

		// Solicitamos participación
		System.out.println("Indique la participación del alumno");
		participacion = sc.nextDouble();

		// Calculamos mediua total
		notaFinal = examAvg * 0.5 + proyectoAvg * 0.4 + participacion * 0.1;

		// Definimos condiciones para la modificacion de las notas
		if (examAvg < 50) {
			System.out.println("\nEl alumno " + alum1 + " no ha superado la nota mínima de aprobado.");
		} else {
			if (proyectoAvg > 90 && participacion > 70) {
				notaFinal = notaFinal + notaFinal * 0.05;
			}
			if (participacion < 30) {
				notaFinal = notaFinal - notaFinal * 0.1;
			}
			if (notaFinal >= 100) {
				System.out.println("El alumno ha recibido matrícula de honor");
			} else {
				System.out.println("El alumno " + alum1 + "ha sacado una calificación final de: " + notaFinal);
			}

			System.out.println("El alumno " + alum2 + "ha sacado una calificación final de: " + notaFinal);
		}
	}

}
