/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostel Bed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.HostelBed#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getHostelBed()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Hostel Bed'"
 * @generated
 */
public interface HostelBed extends Bookable {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(HotelRoom)
	 * @see Classes.Bookables.BookablesPackage#getHostelBed_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HotelRoom getRoom();

	/**
	 * Sets the value of the '{@link Classes.Bookables.HostelBed#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(HotelRoom value);

} // HostelBed
