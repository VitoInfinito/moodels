/**
 */
package Classes.Bookings.impl;

import Classes.Bookings.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
	public BookingsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BookingsPackage.BOOKING: return createBooking();
			case BookingsPackage.BOOKINGS_MANAGER: return createBookingsManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingsManager createBookingsManager() {
		BookingsManagerImpl bookingsManager = new BookingsManagerImpl();
		return bookingsManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingsPackage getBookingsPackage() {
		return (BookingsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookingsPackage getPackage() {
		return BookingsPackage.eINSTANCE;
	}

} //BookingsFactoryImpl
