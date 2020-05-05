package server.operation;

import calculatrice.utils.ExceptionEnum;
import server.exception.CalculatriceException;

public class Division extends Operation {
	
	
	@Override
	public float calculer(float a, float b) throws CalculatriceException {
		if(b==0) {
			throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(), ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage()); 
		}
		return a/b;
		
	}


}
