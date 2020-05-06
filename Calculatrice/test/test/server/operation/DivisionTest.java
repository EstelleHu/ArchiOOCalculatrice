package test.server.operation;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import server.exception.CalculatriceException;
import server.operation.Division;

public class DivisionTest {

	@Test
	public void checkDivisionOK() throws CalculatriceException {
		Division division = new Division();
		Float resultat = division.calculer(Float.valueOf(10), Float.valueOf(2));
		assertEquals(resultat, Float.valueOf(5));
	}
	@Test(expected = CalculatriceException.class)
	public void CheckDivisionKO() throws CalculatriceException {
		Division division = new Division();
		Float resultat = division.calculer(Float.valueOf(10), Float.valueOf(0));
	}
 
}
