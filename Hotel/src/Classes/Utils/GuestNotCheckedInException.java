package Classes.Utils;

public class GuestNotCheckedInException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6827210459640007356L;

	public GuestNotCheckedInException() {
	}

	public GuestNotCheckedInException(String message) {
		super(message);
	}

	public GuestNotCheckedInException(Throwable cause) {
		super(cause);
	}

	public GuestNotCheckedInException(String message, Throwable cause) {
		super(message, cause);
	}
}
