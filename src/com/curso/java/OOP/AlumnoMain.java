package com.curso.java.OOP;

public class AlumnoMain {

	public static void main(String[] args) {

		/*
		 * ("Mortadelo", "Moreno", 45, "11111A"); ("Filemon", "PI", 60, "22222B");
		 * ("Doctor", "Bacterio", 67, "333333C"); ("Ofelia", "Michelínez", 35, "44444D")
		 */

		Alumno per1 = new Alumno();
		Alumno per2 = new Alumno("22222B", "Filemon", "PI");
		Alumno per3 = new Alumno("44444D", "Ofelia", "Michelínez", 7);
		Alumno per4 = new Alumno("333333C", "Doctor", "Bacterio", 10, true);

		per1.setNombre("Mortadelo");
		per1.setApellidos("Moreno");
		per1.setDni("11111A");
		per1.setNota(0);
		per1.setMayorEdad(false);
		per2.setNota(3);
		per2.setMayorEdad(true);
		per3.setMayorEdad(true);

		Alumno[] alumnos = new Alumno[4];

		alumnos[0] = per1;
		alumnos[1] = per2;
		alumnos[2] = per3;
		alumnos[3] = per4;

		for (int i = 0; i < alumnos.length; i++) {

			System.out.println(alumnos[i].toString());
			alumnos[i].verNota();
			System.out.println();
		}

		mostrarNotas(alumnos);

	}

	private static void mostrarNotas(Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i].getNota() >= 5) {
				System.out.println(
						"El alumno " + alumnos[i].getNombre() + " " + alumnos[i].getApellidos() + " ha aprobado");
			}
		}
	}

}
