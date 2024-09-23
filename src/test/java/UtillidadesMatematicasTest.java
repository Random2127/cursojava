package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.curso.java.utils.UtilidadesMatematicas;

public class UtillidadesMatematicasTest {

	@Test
	public void testSuma() {

		int resultado = UtilidadesMatematicas.suma(2, 3);

		assertEquals(5, resultado);
		// Expected and the outcome
	}

	@Test
	public void testOperacion() {

		int result = UtilidadesMatematicas.operacion(2, 5, "*");
		assertEquals(10, result);

	}

	@Test
	public void testOperacion2() {

		double result = UtilidadesMatematicas.operacion(10, 5, "*");
		// assertEquals(50, result); when crossed out is deprecated so change
		assertEquals(50, result, 0);
	}
	
}
