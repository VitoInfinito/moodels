/**
 */
package Classes.Bookables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.RoomLocation#getFloor <em>Floor</em>}</li>
 *   <li>{@link Classes.Bookables.RoomLocation#getAddtionalInfo <em>Addtional Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getRoomLocation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Room Location'"
 * @generated
 */
public interface RoomLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' attribute.
	 * @see #setFloor(int)
	 * @see Classes.Bookables.BookablesPackage#getRoomLocation_Floor()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getFloor();

	/**
	 * Sets the value of the '{@link Classes.Bookables.RoomLocation#getFloor <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' attribute.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(int value);

	/**
	 * Returns the value of the '<em><b>Addtional Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addtional Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addtional Info</em>' attribute.
	 * @see #setAddtionalInfo(String)
	 * @see Classes.Bookables.BookablesPackage#getRoomLocation_AddtionalInfo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddtionalInfo();

	/**
	 * Sets the value of the '{@link Classes.Bookables.RoomLocation#getAddtionalInfo <em>Addtional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addtional Info</em>' attribute.
	 * @see #getAddtionalInfo()
	 * @generated
	 */
	void setAddtionalInfo(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setInfo();

} // RoomLocation
