package test.server.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import client.controller.CalculatriceController;
import client.model.OperationModel;
import client.view.Interface;
import server.controller.Calculate;
import server.exception.CalculatriceException;
import server.operation.Addition;
import server.operation.Operation;
import settings.OperationFactory;

public class CalculateTest {

	@Test
	public void checkOpeTest() throws CalculatriceException {
		Interface view = new Interface();
		CalculatriceController controller = new CalculatriceController(view);
		Operation op = new Addition();
		Calculate c = new Calculate(view);
		Float f = c.checkOpe("+", Float.valueOf(10), Float.valueOf(2));
		assertEquals(f, Float.valueOf(12));
	}
	@Test
	public void checkCalculateOK() throws CalculatriceException {
		OperationModel opModel = new OperationModel("6/3");
		OperationModel result = Calculate.calculate(opModel);
		assertEquals(Float.valueOf(result.getA()), Float.valueOf(6));
		assertEquals(Float.valueOf(result.getB()), Float.valueOf(3));
		assertEquals(result.getErrorCode(), 0);
		assertEquals(result.getStatus(), null);
		assertEquals(result.getOperande(), "/");
		assertEquals(Float.valueOf(result.getResult()), Float.valueOf(2));
		
		opModel = new OperationModel("6+3");
		result = Calculate.calculate(opModel);
		assertEquals(Float.valueOf(result.getA()), Float.valueOf(6));
		assertEquals(Float.valueOf(result.getB()), Float.valueOf(3));
		assertEquals(result.getErrorCode(), 0);
		assertEquals(result.getStatus(), null);
		assertEquals(result.getOperande(), "+");
		assertEquals(Float.valueOf(result.getResult()), Float.valueOf(9));
		
		opModel = new OperationModel("6-3");
		result = Calculate.calculate(opModel);
		assertEquals(Float.valueOf(result.getA()), Float.valueOf(6));
		assertEquals(Float.valueOf(result.getB()), Float.valueOf(3));
		assertEquals(result.getErrorCode(), 0);
		assertEquals(result.getStatus(), null);
		assertEquals(result.getOperande(), "-");
		assertEquals(Float.valueOf(result.getResult()), Float.valueOf(3));
		
		opModel = new OperationModel("6*3");
		result = Calculate.calculate(opModel);
		assertEquals(Float.valueOf(result.getA()), Float.valueOf(6));
		assertEquals(Float.valueOf(result.getB()), Float.valueOf(3));
		assertEquals(result.getErrorCode(), 0);
		assertEquals(result.getStatus(), null);
		assertEquals(result.getOperande(), "*");
		assertEquals(Float.valueOf(result.getResult()), Float.valueOf(18));
		
	}
	@Test
	public void checkCalculateKO() throws CalculatriceException {
		OperationModel opModel = new OperationModel("6/0");
		OperationModel result = Calculate.calculate(opModel);
		assertEquals(Float.valueOf(result.getA()), Float.valueOf(6));
		assertEquals(Float.valueOf(result.getB()), Float.valueOf(0));
		assertEquals(result.getErrorCode(), 1);
		assertEquals(result.getStatus(), "failed");
		assertEquals(result.getOperande(), "/");
		
	}

}
