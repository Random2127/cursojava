package com.curso.java.random;

import java.util.Scanner;

/*saldo =500
 * // Por que numero quieres apostar? (0-36)
        // si es otro numero se vuelve a formular la pregunta

        // Cuanto dinero quieres apostar?
        // Si el importe de la apuesta es > que el saldo disponible por el usuario
        // se notifica y se vuelve a formular la pregunta.

        // De manera aleatoria generar un numero entre 0 y 34

        // si el numero apostado es = al numero aleatoria, se multiplica lo apostado *
        // 36

        // si no lo es, le restamos del saldo la cantidad apostada y se suma

        // Si tiene saldo, le preguntamos; ¿quieres seguir jugando?, si dice que no le
        // indicamos el saldo con el que se va.

        // PARTE DIFICIL
        // Preguntar a que juego quiere jugar (numero, par/impar, "bloques son tres
        // bloques")
        // si la apuesta es par/impar y se gana., se multiplica lo apostado * 2
        // si la apuesta es bloques y se gana, se *5 (1-12, 13-24, 25 - 36)

 */
public class CasinoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo = 500;

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("Bienvenido al casino");
			System.out.println("====================");
			System.out.println("1. Números");
			System.out.println("2. Par o Impar");
			System.out.println("3. Bloques");
			System.out.println("0. Salir");
			System.out.println("Indica que juego de ruleta quieres probar.");
			opcion = Integer.parseInt(sc.nextLine());

			if (saldo <= 0) {
				System.out.println("Ya no te queda más saldo. Ve a currar un poquito ;)");
				break;
			}

			switch (opcion) {
			case 1:
				double apuestaNum = apuesta(sc, saldo);
				saldo = numero(sc, saldo, apuestaNum);
				break;
			case 2:
				double apuestaPar = apuesta(sc, saldo);
				saldo = parImpar(sc, saldo, apuestaPar);
				break;
			case 3:
				double apuestaBloq = apuesta(sc, saldo);
				saldo = bloques(sc, saldo, apuestaBloq);
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no válida. Elige otra vez.\n");
			}

		} while (opcion != 0);
		System.out.println("\nAdios!!	");

	}

	private static int generaRandom() {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 36;
		double numRandom = Math.random();
		int randomNumero = (int) (Math.random() * (max - min + 1)) + min;
		return randomNumero;
	}

	private static double apuesta(Scanner sc, double saldo) {
		double apuesta;
		System.out.println("Cual es tu apuesta?");
		apuesta = Double.parseDouble(sc.nextLine());
		while (apuesta > saldo) {
			System.out.println("Su saldo no es suficiente. Intentelo de nuevo.");
			apuesta = Double.parseDouble(sc.nextLine());
		}
		saldo -= apuesta;
		System.out.println("Apuesta aceptada. Su nuevo saldo es de " + saldo);
		return apuesta;
	}

	private static double numero(Scanner sc, double saldo, double apuesta) {
		int numero;
		System.out.println("A que número quieres apostar? (1 al 36)");
		numero = Integer.parseInt(sc.nextLine());
		while (numero < 0 || numero > 36) {
			System.out.println("Número no válido. Prueba de nuevo");
			numero = Integer.parseInt(sc.nextLine());

		}
		int ruleta = generaRandom();

		if (numero == ruleta) {
			saldo += apuesta * 36;
			System.out.println("Enhorabuena, has ganado!! Tu nuevo saldo es" + saldo);
		} else {
			System.out.println("Has perdido! :( Tu saldo es " + saldo);
		}
		return saldo;
	}

	private static double parImpar(Scanner sc, double saldo, double apuesta) {
		System.out.println(" Apuestas a par o impar (p/i):");
		String eleccion = sc.nextLine().toLowerCase();
		int ruleta = generaRandom();
		boolean esPar = ruleta % 2 == 0;

		if ((eleccion.equals("p") && esPar) || (eleccion.equals("i") && !esPar)) {
			saldo += apuesta * 2;
			System.out.println("Enhorabuena, has ganado!! Tu nuevo saldo es" + saldo);
		} else {
			System.out.println("Has perdido! :( Tu saldo es " + saldo);
		}
		return saldo;
	}

	private static double bloques(Scanner sc, double saldo, double apuesta) {
		int bloque;
		System.out.println("A que bloque quieres apostar?");
		System.out.println("\nBloque 1. (1-12)" + "\nBloque 2. (13-24)" + "\nBloque 3. (25-36)");

		bloque = Integer.parseInt(sc.nextLine());
		while (bloque < 1 || bloque > 3) {
			System.out.println("Número no válido. Prueba de nuevo");
			bloque = Integer.parseInt(sc.nextLine());
		}
		int ruleta = generaRandom();
		boolean gana = (bloque == 1 && ruleta >= 1 && ruleta <= 12) || (bloque == 2 && ruleta >= 13 && ruleta <= 24)
				|| (bloque == 3 && ruleta >= 25 && ruleta <= 36);

		if (gana) {
			saldo += apuesta * 5;
			System.out.println("¡Enhorabuena, has ganado! Tu nuevo saldo es " + saldo);
		} else {
			System.out.println("Has perdido! :( Tu saldo es " + saldo);
		}
		return saldo;
	}

}
