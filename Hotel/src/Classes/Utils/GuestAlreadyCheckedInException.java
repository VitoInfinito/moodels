package Classes.Utils;

public class GuestAlreadyCheckedInException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8165161165748362865L;

	public GuestAlreadyCheckedInException() {
	}

	public GuestAlreadyCheckedInException(String message) {
		super(message);
	}

	public GuestAlreadyCheckedInException(Throwable cause) {
		super(cause);
	}

	public GuestAlreadyCheckedInException(String message, Throwable cause) {
		super(message, cause);
	}
}
