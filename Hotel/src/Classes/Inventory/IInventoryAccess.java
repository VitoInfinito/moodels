/**
 */
package Classes.Inventory;

import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IInventory Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Inventory.InventoryPackage#getIInventoryAccess()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IInventoryAccess extends Serializable {
	
	IInventoryAccess INSTANCE = Classes.Inventory.InventoryManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		id != null</br></br>
	 * Ensures:</br>
	 * 		If there is an inventory item <i>item</i> such that <i>item.id == id && 0 <= stock</i></br>
	 * 			sets <i>item.stock = stock</i></br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void changeItemStock(String id, int stock) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		id != null</br></br>
	 * Ensures:</br>
	 * 		If there is an inventory item <i>item</i> such that <i>item.id == id</i></br>
	 * 			returns <i>item.price</i></br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	double getItemPrice(String id) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		id != null</br></br>
	 * Ensures:</br>
	 * 		If there is an inventory item <i>item</i> such that <i>item.id == id</i></br>
	 * 			returns <i>item.name</i></br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	String getItemName(String id) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		id != null</br></br>
	 * Ensures:</br>
	 * 		If there is an inventory item <i>item</i> such that <i>item.id == id</i></br>
	 * 			returns <i>item.stock</i></br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	int getItemStock(String id) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		id != null</br></br>
	 * Ensures:</br>
	 * 		If there is an inventory item <i>item</i> such that <i>item.id == id</i></br>
	 * 			returns <i>item.expense</i></br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	double getItemExpense(String id) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		returns a non-null list with all the items
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllItemIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 		returns a non-null list of all items matching something in the following order:
	 * 			1. Items with id that exactly matches <i>keyword</i>
	 * 			2. Items with id that has some matching to <i>keyword</i>
	 * 			3. Items with attributes that exactly matches <i>keyword</i>
	 * 			4. Items with attributes that has some matching to <i>keyword</i>
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchItems(String keyword);

} // IInventoryAccess
