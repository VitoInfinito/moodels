/**
 */
package Classes.Bookings;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingsFactory implements Serializable {

	private static final long serialVersionUID = 6880183006044578998L;
	
	static BookingsFactory INSTANCE = new BookingsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookingsFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		Booking booking = new Booking();
		return booking;
	}
} //BookingsFactoryImpl
