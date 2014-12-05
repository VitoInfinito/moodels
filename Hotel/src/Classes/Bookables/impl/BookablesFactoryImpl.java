/**
 */
package Classes.Bookables.impl;

import Classes.Bookables.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	public BookablesFactoryImpl() {
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
			case BookablesPackage.ROOM_LOCATION: return createRoomLocation();
			case BookablesPackage.HOSTEL_BED: return createHostelBed();
			case BookablesPackage.HOTEL_ROOM: return createHotelRoom();
			case BookablesPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case BookablesPackage.BOOKABLES_MANAGER: return createBookablesManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BookablesPackage.HOTEL_ROOM_CATEGORY:
				return createHotelRoomCategoryFromString(eDataType, initialValue);
			case BookablesPackage.CONFERENCE_ROOM_CATEGORY:
				return createConferenceRoomCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BookablesPackage.HOTEL_ROOM_CATEGORY:
				return convertHotelRoomCategoryToString(eDataType, instanceValue);
			case BookablesPackage.CONFERENCE_ROOM_CATEGORY:
				return convertConferenceRoomCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookablesManager createBookablesManager() {
		BookablesManagerImpl bookablesManager = new BookablesManagerImpl();
		return bookablesManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomCategory createConferenceRoomCategoryFromString(EDataType eDataType, String initialValue) {
		ConferenceRoomCategory result = ConferenceRoomCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConferenceRoomCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoomCategory createHotelRoomCategoryFromString(EDataType eDataType, String initialValue) {
		HotelRoomCategory result = HotelRoomCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHotelRoomCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookablesPackage getBookablesPackage() {
		return (BookablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookablesPackage getPackage() {
		return BookablesPackage.eINSTANCE;
	}

} //BookablesFactoryImpl
