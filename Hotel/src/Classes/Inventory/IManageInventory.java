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
	
	IManageInventory INSTANCE = Classes.Inventory.impl.InventoryManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeItemName(String id, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeItemPrice(String id, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeItemExpense(String id, double expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" expenseRequired="true" expenseOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void addItem(String name, double price, double expense, int stock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	void removeItem(String id);

} // IManageInventory
