package client.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import client.model.OperationModel;
import client.service.RequeteCalculatrice;
import client.view.Interface;
import server.operation.Operation;
import settings.OperationFactory;

public class CalculatriceController {
	
	private Interface view;
	private Operation model;
	
	public CalculatriceController(Interface interf) {
		super();
		this.view = interf;
	}

	public void checkOperation(String ope,float a, float b) {
		model = OperationFactory.initOpe(ope);
		
		view.afficherResultat(model.calculer(a,b));
	}
	
	public Interface getInterf() {
		return view;
	}
	
	public void setInterf(Interface interf) {
		this.view = interf;
	}

}
	
	

