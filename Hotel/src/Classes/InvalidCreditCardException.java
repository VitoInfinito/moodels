/**
 * 
 */
package Classes;

/**
 * @author ekman
 *
 */
public class InvalidCreditCardException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7421813380144937465L;

	public InvalidCreditCardException() {
	}

	public InvalidCreditCardException(String message) {
		super(message);
	}

	public InvalidCreditCardException(Throwable cause) {
		super(cause);
	}

	public InvalidCreditCardException(String message, Throwable cause) {
		super(message, cause);
	}
}
