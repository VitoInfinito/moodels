/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Bookables.BookablesFactory;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;
import Classes.Bookables.ConferenceRoom;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HostelBed;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.RoomLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookablesFactoryImpl extends EFactoryImpl implements BookablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookablesFactory init() {
		try {
			BookablesFactory theBookablesFactory = (BookablesFactory)EPackage.Registry.INSTANCE.getEFactory(BookablesPackage.eNS_URI);
			if (theBookablesFactory != null) {
				return theBookablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookablesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomLocation createRoomLocation() {
		RoomLocationImpl roomLocation = new RoomLocationImpl();
		return roomLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostelBed createHostelBed() {
		HostelBedImpl hostelBed = new HostelBedImpl();
		return hostelBed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoomImpl conferenceRoom = new ConferenceRoomImpl();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoom createHotelRoom() {
		HotelRoomImpl hotelRoom = new HotelRoomImpl();
		return hotelRoom;
	}
} //BookablesFactoryImpl
