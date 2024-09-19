package com.curso.java.OOP;

public class Cine {

	public static void main(String[] args) {

		Persona per1 = new Persona("Mortadelo", "Moreno", 45, "11111A");
		Persona per2 = new Persona("Filemon", "PI", 60, "22222B");
		Persona per3 = new Persona("Doctor", "Bacterio", 67, "333333C");
		Persona per4 = new Persona("Ofelia", "Michelínez", 35, "44444D");

		System.out.println(per1.toString());
		per2.correr();

	}

}
