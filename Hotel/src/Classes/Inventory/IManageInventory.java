/**
 */
package Classes.Inventory;


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
public interface IManageInventory extends IInventoryAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeItemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeItemPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeItemExpense();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeItem();

} // IManageInventory
