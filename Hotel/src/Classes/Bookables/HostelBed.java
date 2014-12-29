/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostel Bed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class HostelBed extends Bookable{
	private static final long serialVersionUID = 1809433189973858143L;
	
	private HotelRoom room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostelBed() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoom getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(HotelRoom newRoom) {
		room = newRoom;
	}
} //HostelBedImpl
