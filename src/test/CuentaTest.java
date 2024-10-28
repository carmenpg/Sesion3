package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import pkg.Cuenta;

class CuentaTest {
	
	private static Cuenta cuenta, cuenta1, cuenta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("23311", "Carmen", 200);
		cuenta1 = new Cuenta("12345", "Ismael", 100);
		cuenta2 = new Cuenta("67890", "Elena", 0);
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
	@DisplayName("Ingresar dinero")
	void testIngresar() {
		double ingreso = 2500;
		double saldoactual = cuenta.getSaldo();
		cuenta.ingresar(ingreso);
		saldoactual += ingreso;
		assertEquals(saldoactual, cuenta.getSaldo());
		
	}

	@Test
	@DisplayName("Sacar dinero")
	void testSacar() {
		double retirar = 500;
		double saldoactual = cuenta.getSaldo();
		cuenta.sacar(retirar);
		saldoactual -= retirar;
		assertEquals(saldoactual, cuenta.getSaldo());
	}
	
	@DisplayName("Test Sesion3")
	void testMovimiento(TestInfo info) {
		System.out.println("Ejecutando prueba: " + info.getTestMethod().get().getName());
		assertTrue(cuenta1.sacar(200));
		assertTrue(cuenta2.sacar(350));
		cuenta1.ingresar(100);
		assertFalse(cuenta2.sacar(200));
		assertTrue(cuenta2.sacar(150));
		assertTrue(cuenta1.sacar(200));
		cuenta2.ingresar(50);
		assertFalse(cuenta2.sacar(100));
		System.out.println(cuenta1.toString() + cuenta2.toString());
	}
}
