package test.server.operation;

import static org.junit.Assert.*;

import org.junit.Test;

import server.exception.CalculatriceException;
import server.operation.Addition;
import server.operation.Division;

public class AdditionTest {

	@Test
	public void checkAddition() throws CalculatriceException {
		Addition addition = new Addition();
		Float resultat = addition.calculer(Float.valueOf(10), Float.valueOf(2));
		assertEquals(resultat, Float.valueOf(12));
	}

}
