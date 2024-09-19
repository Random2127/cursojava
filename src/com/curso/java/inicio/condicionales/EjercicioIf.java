package com.curso.java.inicio.condicionales;

public class EjercicioIf {

	public static void main(String[] args) {

		String asignatura = "Matematicas";
		String nombreAlumno = "Victor";
		int nota = 3;

		String notaLetra = "";

		if (nota < 0 || nota > 10) {
			System.out.println("Nota no válida. Revísela antes de proseguir");
		} else {

			if (nota >= 9) {
				notaLetra = "Sobresaliente";
			} else if (nota > 7 && nota <= 8) {
				notaLetra = "Notable";
			} else if (nota >= 5 && nota <= 7) {
				notaLetra = "Aprobado";
			} else {
				notaLetra = "Suspenso";
			}

			
			//if (notaLtra!=""){}  else will give the error.  this is a different approach 
			
			System.out.println(
					"El alumno " + nombreAlumno + " ha logrado un " + notaLetra + " en la asignatura de " + asignatura);

		}

	}

}
