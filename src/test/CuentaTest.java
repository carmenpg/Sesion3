package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		fail("Prueba Fallida");
		Cuenta c = new Cuenta();
		assertEquals(200, c.getSaldo());
		
	}

	@Test
	void testSacar() {
		fail("Prueba Fallida");
		Cuenta c = new Cuenta();
		assertEquals(200, c.getSaldo());
	}
}
