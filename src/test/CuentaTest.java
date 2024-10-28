package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	private static Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(200);
		assertEquals(200, cuenta.getSaldo());
		
	}

	@Test
	void testSacar() {
		cuenta.sacar(200);
		assertEquals(-200, cuenta.getSaldo());
	}
}
