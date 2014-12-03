/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.Room#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getRoom()
 * @model abstract="true"
 * @generated
 */
public interface Room extends Bookable {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(RoomLocation)
	 * @see Classes.Bookables.BookablesPackage#getRoom_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomLocation getLocation();

	/**
	 * Sets the value of the '{@link Classes.Bookables.Room#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(RoomLocation value);

} // Room
