package settings;

import client.model.OperationModel;
import server.operation.Operation;

public class OperationFactory {
	public static Operation initOpe(String ope) {
		ApplicationConfig.configuration();
		
		return ApplicationConfig.operationByChar.get(ope);
		
	}
 
}
