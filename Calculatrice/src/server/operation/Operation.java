package server.operation;

import server.exception.CalculatriceException;

public abstract class Operation {
	private double x;
	private double y;

	public abstract float calculer(float x, float y) throws CalculatriceException;

	public Operation() {
		super();
	}




}
