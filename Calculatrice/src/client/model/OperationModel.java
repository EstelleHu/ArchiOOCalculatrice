package client.model;
import java.io.Serializable;

import server.operation.Operation;

import java.io.Serializable;

public class OperationModel implements Serializable {
	
	private float a;
	private float b;
	private int errorCode;
	private String status;
	private String operande;
	float result;
	


	public String getStatus() {
		return status;
	}


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



	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}

	public int getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "OperationModel [a=" + a + ", b=" + b +  ", errorCode=" + errorCode + ", status="
				+ status + ", operande=" + operande + ", result=" + result + "]";
	}
	
	
}


