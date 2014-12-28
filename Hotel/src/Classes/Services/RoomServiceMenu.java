/**
 */
package Classes.Services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import Classes.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Service Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Services.RoomServiceMenu#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceMenu#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Services.ServicesPackage#getRoomServiceMenu()
 * @model
 * @generated
 */
public interface RoomServiceMenu extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Classes.Services.ServicesPackage#getRoomServiceMenu_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceMenu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see Classes.Services.ServicesPackage#getRoomServiceMenu_Items()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addItem(String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeItem(String itemID) throws InvalidIDException;

} // RoomServiceMenu
