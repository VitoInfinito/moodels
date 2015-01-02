/**
 */
package Classes.Inventory;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IManage Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Inventory.InventoryPackage#getIManageInventory()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IManageInventory extends IInventoryAccess {
	
	IManageInventory INSTANCE = Classes.Inventory.InventoryManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>id != null && name != null</i></br></br>
	 * Ensures:</br>
	 * 		if there exists an item <i>item</i> such that <i>item.id == id</i></br>
	 * 			Changes the name of the item</br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeItemName(String id, String name) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>id != null && price != null</i></br></br>
	 * Ensures:</br>
	 * 		if there exists an item <i>item</i> such that <i>item.id == id</i></br>
	 * 			Changes the price of the item</br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeItemPrice(String id, double price) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>id != null && expense != null</i></br></br>
	 * Ensures:</br>
	 * 		if there exists an item <i>item</i> such that <i>item.id == id</i></br>
	 * 			Changes the expense of the item</br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br>
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeItemExpense(String id, double expense) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>name != null && price != null && expense != null && stock != null</i></br></br>
	 * Ensures:</br>
	 * 		Generates a new ID for the new item</br>
	 * 		Creates a new item with the generated ID and sets all attributes</br>
	 * 		Adds item into inventory</br>
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" expenseRequired="true" expenseOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void addItem(String name, double price, double expense, int stock);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>id != null</i></br></br>
	 * Ensures:</br>
	 * 		if there exists an item <i>item</i> such that <i>item.id == id</i></br>
	 * 			<i>item</i> is removed from the inventory</br>
	 * 		otherwise</br>
	 * 			InvalidIDException is thrown</br> 
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	void removeItem(String id) throws InvalidIDException;

} // IManageInventory
