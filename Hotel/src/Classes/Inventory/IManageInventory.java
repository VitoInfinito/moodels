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
	 * @model idDataType="org.eclipse.uml2.types.Integer" idRequired="true" idOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeItemName(int id, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.Integer" idRequired="true" idOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeItemPrice(int id, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.Integer" idRequired="true" idOrdered="false" expenseDataType="org.eclipse.uml2.types.Integer" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeItemExpense(int id, int expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" expenseDataType="org.eclipse.uml2.types.Integer" expenseRequired="true" expenseOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void addItem(String name, int price, int expense, int stock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.Integer" idRequired="true" idOrdered="false"
	 * @generated
	 */
	void removeItem(int id);

} // IManageInventory
