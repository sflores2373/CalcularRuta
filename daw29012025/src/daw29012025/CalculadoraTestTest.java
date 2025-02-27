package daw29012025;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestTest {

	@Test
	void testSumar() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(11, calculadora.sumar(5,6));
	}
	
	@Test
	void testSumaNull() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(0, calculadora.sumar(null,6));
	}
	
	@Test
	void testSumaNull2() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(0, calculadora.sumar(6,null));
	}

	@Test
	void testRestar() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(0, calculadora.restar(6,3));
	}
	
	@Test
	void testRestarNull() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(0, calculadora.restar(6,null));
	}

	@Test
	void testMultiplicar() {
		CalculadoraTest calculadora = new CalculadoraTest();
		assertEquals(0, calculadora.restar(6,null));
		fail("Not yet implemented");
	}

}
