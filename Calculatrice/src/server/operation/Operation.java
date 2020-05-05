package server.operation;

public abstract class Operation {
	private double x;
	private double y;

	public abstract float calculer(float x, float y);

	public Operation() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;

	}

}
