/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
abstract class Room extends Bookable {
	
	private static final long serialVersionUID = -3607253283034644663L;
	
	private RoomLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Room() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(RoomLocation newLocation) {
		location = newLocation;
	}
} //RoomImpl
