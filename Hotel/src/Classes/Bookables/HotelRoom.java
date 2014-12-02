/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.HotelRoom#getCategory <em>Category</em>}</li>
 *   <li>{@link Classes.Bookables.HotelRoom#getNbrBeds <em>Nbr Beds</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getHotelRoom()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Hotel Room'"
 * @generated
 */
public interface HotelRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.Bookables.HotelRoomCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Classes.Bookables.HotelRoomCategory
	 * @see #setCategory(HotelRoomCategory)
	 * @see Classes.Bookables.BookablesPackage#getHotelRoom_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HotelRoomCategory getCategory();

	/**
	 * Sets the value of the '{@link Classes.Bookables.HotelRoom#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Classes.Bookables.HotelRoomCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(HotelRoomCategory value);

	/**
	 * Returns the value of the '<em><b>Nbr Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Beds</em>' attribute.
	 * @see #setNbrBeds(int)
	 * @see Classes.Bookables.BookablesPackage#getHotelRoom_NbrBeds()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNbrBeds();

	/**
	 * Sets the value of the '{@link Classes.Bookables.HotelRoom#getNbrBeds <em>Nbr Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Beds</em>' attribute.
	 * @see #getNbrBeds()
	 * @generated
	 */
	void setNbrBeds(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCategory();

} // HotelRoom
