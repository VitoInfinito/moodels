package Classes.Utils;

public class ResponsibleCreditCardNotAddedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1213933340093549279L;

	public ResponsibleCreditCardNotAddedException() {
	}

	public ResponsibleCreditCardNotAddedException(String message) {
		super(message);
	}

	public ResponsibleCreditCardNotAddedException(Throwable cause) {
		super(cause);
	}

	public ResponsibleCreditCardNotAddedException(String message, Throwable cause) {
		super(message, cause);
	}
}
