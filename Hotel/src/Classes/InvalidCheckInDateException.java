package Classes;

public class InvalidCheckInDateException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1161596545936479160L;

	public InvalidCheckInDateException() {
	}

	public InvalidCheckInDateException(String message) {
		super(message);
	}

	public InvalidCheckInDateException(Throwable cause) {
		super(cause);
	}

	public InvalidCheckInDateException(String message, Throwable cause) {
		super(message, cause);
	}
}
