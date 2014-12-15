/**
 */
package Classes.Bookings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Bookings.Booking;
import Classes.Bookings.BookingsFactory;
import Classes.Bookings.BookingsManager;
import Classes.Bookings.BookingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingsFactoryImpl extends EFactoryImpl implements BookingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingsFactory init() {
		try {
			BookingsFactory theBookingsFactory = (BookingsFactory)EPackage.Registry.INSTANCE.getEFactory(BookingsPackage.eNS_URI);
			if (theBookingsFactory != null) {
				return theBookingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookingsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}
} //BookingsFactoryImpl
