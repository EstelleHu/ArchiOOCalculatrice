package client.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import client.model.OperationModel;
import client.service.RequeteCalculatrice;
import client.view.Interface;
import server.exception.CalculatriceException;
import server.operation.Operation;
import settings.OperationFactory;

public class CalculatriceController {
	
	private Interface view;
	private Operation model;
	
	public CalculatriceController(Interface interf) {
		super();
		this.view = interf;
	}

	public void checkOperation(String ope,float a, float b) throws CalculatriceException {
		model = OperationFactory.initOpe(ope);
		
		view.afficherResultat(model.calculer(a,b));
	}
	


}
	
	

