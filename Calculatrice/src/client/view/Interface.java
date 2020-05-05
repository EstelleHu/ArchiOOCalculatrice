package client.view;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import client.controller.CalculatriceController;
import client.model.OperationModel;
import client.service.RequeteCalculatrice;
import server.operation.Addition;
import server.operation.Operation;

public class Interface {
	
	private CalculatriceController controller;
	private static Scanner scanner = new Scanner (System.in);
	
	public void afficher() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		String ope;
		System.out.println("opération :");
		ope = scanner.nextLine();
		OperationModel operationMod = new OperationModel(ope);
		System.out.println("résultat : "+RequeteCalculatrice.call(operationMod).getResult());
		
	}
	
	public void afficherResultat(float res) {
		System.out.println("Résultat de votre opération : "+res);
	}
	
	public void setController(CalculatriceController controller) {
		this.controller = controller;
	} 
	
}
