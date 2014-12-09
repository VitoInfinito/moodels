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
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeItemName(String id, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeItemPrice(String id, int price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" expenseDataType="org.eclipse.uml2.types.Integer" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeItemExpense(String id, int expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" expenseDataType="org.eclipse.uml2.types.Integer" expenseRequired="true" expenseOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void addItem(String id, String name, int price, int expense, int stock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	void removeItem(String id);

} // IManageInventory
