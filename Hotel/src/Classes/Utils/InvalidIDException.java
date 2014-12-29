/**
 * 
 */
package Classes.Utils;

/**
 * @author Daniel
 * 
 */
public final class InvalidIDException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5284985658345766643L;

	public InvalidIDException() {
	}

	public InvalidIDException(String message) {
		super(message);
	}

	public InvalidIDException(Throwable cause) {
		super(cause);
	}

	public InvalidIDException(String message, Throwable cause) {
		super(message, cause);
	}
}
