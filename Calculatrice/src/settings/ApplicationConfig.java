package settings;

import java.util.HashMap;
import java.util.Map;

import client.model.OperationModel;
import server.operation.Addition;
import server.operation.Division;
import server.operation.Multiplication;
import server.operation.Operation;
import server.operation.Soustraction;

public class ApplicationConfig {
	static Map<String, Operation> operationByChar = new HashMap<String, Operation>(); 
	
	public static void configuration() {
		operationByChar.put("+", new Addition());
		operationByChar.put("-", new Soustraction());
		operationByChar.put("/", new Division());
		operationByChar.put("*", new Multiplication());
	}
}
