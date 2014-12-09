/**
 */
package Classes.Inventory;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Inventory.InventoryManager#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Inventory.InventoryPackage#getInventoryManager()
 * @model
 * @generated
 */
public interface InventoryManager extends IManageInventory {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link Classes.Inventory.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see Classes.Inventory.InventoryPackage#getInventoryManager_Items()
	 * @model ordered="false"
	 * @generated NOT
	 */
	List<Item> getItems();

} // InventoryManager
