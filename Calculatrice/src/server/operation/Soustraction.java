package server.operation;

import client.model.OperationModel;

public class Soustraction extends Operation {
	@Override
	public float calculer(float a, float b) {
		return a-b;
	}
}
