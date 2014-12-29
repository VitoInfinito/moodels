/**
 */
package Classes.Bookables;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class BookablesFactory implements Serializable {

	private static final long serialVersionUID = -7206774618500268436L;
	
	static BookablesFactory INSTANCE = new BookablesFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookablesFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomLocation createRoomLocation() {
		RoomLocation roomLocation = new RoomLocation();
		return roomLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostelBed createHostelBed() {
		HostelBed hostelBed = new HostelBed();
		return hostelBed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoom conferenceRoom = new ConferenceRoom();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoom createHotelRoom() {
		HotelRoom hotelRoom = new HotelRoom();
		return hotelRoom;
	}
} //BookablesFactoryImpl
