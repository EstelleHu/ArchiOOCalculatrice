package client.model;
import java.io.Serializable;

import server.operation.Operation;

import java.io.Serializable;

public class OperationModel implements Serializable {
	
	private float a;
	private float b;
	Operation ope;
	int errorCode;
	public Operation getOpe() {
		return ope;
	}

	public void setOpe(Operation ope) {
		this.ope = ope;
	}
	String operande;
	float result;
	public OperationModel(String operation) {
		String regex = "(\\+|\\-|\\*|\\/)";
		String[] tokens = operation.split(regex);
		this.a = Float.parseFloat(tokens[0]);
		this.b = Float.parseFloat(tokens[1]);
		for(int i=0; i<operation.length();i++){
			if(operation.charAt(i)=='+') {
				this.operande = "+";
			} else if(operation.charAt(i)=='-') {
				this.operande = "-";
			}else if(operation.charAt(i)=='/') {
				this.operande = "/";
			}else if(operation.charAt(i)=='*'){
				this.operande = "*";
			}
		}
		this.result = 0;
	}
	
	public String getOperande() {
		return operande;
	}

	public void setOperande(String operande) {
		this.operande = operande;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public int getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}


