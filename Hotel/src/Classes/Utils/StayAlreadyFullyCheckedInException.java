package Classes.Utils;

public class StayAlreadyFullyCheckedInException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8218095166064401103L;

	public StayAlreadyFullyCheckedInException() {
	}

	public StayAlreadyFullyCheckedInException(String message) {
		super(message);
	}

	public StayAlreadyFullyCheckedInException(Throwable cause) {
		super(cause);
	}

	public StayAlreadyFullyCheckedInException(String message, Throwable cause) {
		super(message, cause);
	}
}
