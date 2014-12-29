package Classes.Utils;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6263721005670504914L;

	public InsufficientFundsException() {
	}

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException(Throwable cause) {
		super(cause);
	}

	public InsufficientFundsException(String message, Throwable cause) {
		super(message, cause);
	}
}
