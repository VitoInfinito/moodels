/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.ConferenceRoom#getCategory <em>Category</em>}</li>
 *   <li>{@link Classes.Bookables.ConferenceRoom#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getConferenceRoom()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Conference Room'"
 * @generated
 */
public interface ConferenceRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.Bookables.ConferenceRoomCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Classes.Bookables.ConferenceRoomCategory
	 * @see #setCategory(ConferenceRoomCategory)
	 * @see Classes.Bookables.BookablesPackage#getConferenceRoom_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConferenceRoomCategory getCategory();

	/**
	 * Sets the value of the '{@link Classes.Bookables.ConferenceRoom#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Classes.Bookables.ConferenceRoomCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ConferenceRoomCategory value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see Classes.Bookables.BookablesPackage#getConferenceRoom_Capacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link Classes.Bookables.ConferenceRoom#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCategory();

} // ConferenceRoom
