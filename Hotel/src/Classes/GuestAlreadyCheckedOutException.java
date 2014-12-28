package Classes;

public class GuestAlreadyCheckedOutException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7454200016487095898L;

	public GuestAlreadyCheckedOutException() {
	}

	public GuestAlreadyCheckedOutException(String message) {
		super(message);
	}

	public GuestAlreadyCheckedOutException(Throwable cause) {
		super(cause);
	}

	public GuestAlreadyCheckedOutException(String message, Throwable cause) {
		super(message, cause);
	}
}
