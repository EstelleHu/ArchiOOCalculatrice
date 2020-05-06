package server.exception;

@SuppressWarnings("serial")
public class CalculatriceException extends Exception {
	private int code;
	private String defaultMessage;
	
	public CalculatriceException() {
		super();
	}
	public CalculatriceException(int code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}
	public int getCode() {
		return code;
	}
	public String getDefaultMessage() {
		return defaultMessage;
	}

	
}
