package server.operation;

import client.model.OperationModel;

public class Addition extends Operation {
	
	
	@Override
	public float calculer(float a, float b) {
		return a+b;
	}


}
