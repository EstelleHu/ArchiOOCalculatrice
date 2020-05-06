package test.server.operation;

import static org.junit.Assert.*;

import org.junit.Test;

import server.exception.CalculatriceException;
import server.operation.Multiplication;
import server.operation.Soustraction;

public class MultiplicationTest {

	@Test
	public void checkMultiplication() throws CalculatriceException {
		Multiplication multiplication = new Multiplication();
		Float resultat = multiplication.calculer(Float.valueOf(10), Float.valueOf(2));
		assertEquals(resultat, Float.valueOf(20));
	}

}
