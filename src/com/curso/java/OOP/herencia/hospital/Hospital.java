package com.curso.java.OOP.herencia.hospital;

public class Hospital {

	public static void main(String[] args) {

		String nombre;
		Habitacion[] habitaciones = new Habitacion[2];
		Paciente[] salaDeEspera = new Paciente[3];

		Hospital hospital = new Hospital();
		hospital.abrirHospital(hospital, habitaciones, salaDeEspera);

	}

	private void abrirHospital(Hospital hospital, Habitacion[] habitaciones, Paciente[] salaDeEspera) {

		Habitacion hab1 = new Habitacion(1, null);
		Habitacion hab2 = new Habitacion(2, null);
		habitaciones[0] = hab1;
		habitaciones[1] = hab2;

		Paciente paciente1 = new Paciente("pac1", 20, null);
		Paciente paciente2 = new Paciente("pac2", 40, null);
		Paciente paciente3 = new Paciente("pac3", 60, null);

		salaDeEspera[0] = paciente1;
		salaDeEspera[1] = paciente2;
		salaDeEspera[2] = paciente3;

		Enfermero enfermero1 = new Enfermero("Enfer1", 25, "Mañana", 0);

		Doctor doc1 = new Doctor("Doc", 45, "Mañana", "Traumatología");

		fichar(enfermero1, doc1);
		comerTodos(salaDeEspera, enfermero1, doc1);
		atenderPac(habitaciones, salaDeEspera, enfermero1, doc1);

	}

	private static void fichar(Enfermero enfermero1, Doctor doc1) {
		enfermero1.fichar();
		doc1.fichar();
	}

	private void comerTodos(Paciente[] salaDeEspera, Enfermero enfermero1, Doctor doc1) {

		enfermero1.comer();
		doc1.comer();

		for (Paciente paciente : salaDeEspera) {
			paciente.comer();
		}
	}

	private void atenderPac(Habitacion[] habitaciones, Paciente[] salaDeEspera, Enfermero enfermero1, Doctor doc1) {

		for (int i = 0; i < salaDeEspera.length; i++) {

			if (doc1.diagnosticarPaciente(salaDeEspera[i])) {
				// paciente enfermo -- remove from sala?
				Enfermo enfermo = new Enfermo(salaDeEspera[i].getNombre(), salaDeEspera[i].getEdad(), "Fractura");

				if (habitaciones != null) {
					habitaciones[i] = new Habitacion(i, enfermo);

				} else {
					System.out.println("No hay suficientes habitaciones...");
				}
			} else {
				System.out.println("El paciente se va a casa...");
			}

		}

	}
}
