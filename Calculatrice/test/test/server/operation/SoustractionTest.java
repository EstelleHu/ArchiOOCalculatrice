package test.server.operation;

import static org.junit.Assert.*;

import org.junit.Test;

import server.exception.CalculatriceException;
import server.operation.Addition;
import server.operation.Soustraction;

public class SoustractionTest {

	@Test
	public void checkSoustraction() throws CalculatriceException {
		Soustraction soustraction = new Soustraction();
		Float resultat = soustraction.calculer(Float.valueOf(10), Float.valueOf(2));
		assertEquals(resultat, Float.valueOf(8));
	}

}
