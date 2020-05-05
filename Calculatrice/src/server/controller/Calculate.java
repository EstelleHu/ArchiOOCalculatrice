package server.controller;


import client.controller.CalculatriceController;
import client.model.OperationModel;
import client.view.Interface;
import server.exception.CalculatriceException;
import server.operation.Operation;
import settings.OperationFactory;

public class Calculate {
	
	private static Interface view;
	private static Operation model;
	private static CalculatriceController controller;
	
	public Calculate(Interface view) {
		super();
		this.view = view;
	}
	
	public static float checkOpe(String ope, float a, float b) throws CalculatriceException {
		
		model = OperationFactory.initOpe(ope);
		
		return(model.calculer(a, b));
	}

	public static OperationModel calculate(OperationModel operation) throws CalculatriceException {
		operation.setResult(Calculate.checkOpe(operation.getOperande(), operation.getA(),operation.getB()));
		return operation;
		
		
		  
	}



	
	
}
