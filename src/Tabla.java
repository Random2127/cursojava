
public class Tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int num = 3;
		 * 
		 * for (int i = 1; i <= 10; i++) { int multi = num * i; System.out.println(num +
		 * "x" + i + "=" + multi);
		 * 
		 * }
		 */

		double dividendo = 6.0;
		double divisor = 3.0;

		double result = division(dividendo, divisor);
		System.out.println(result);

	}

	public static double division(double dividendo, double divisor) {

		double resultado = 0;
		if (divisor == 0) {
			System.out.println("No puede dividirse por 0");
		} else {
			resultado = dividendo / divisor;

		}
		return resultado;

	}
}
