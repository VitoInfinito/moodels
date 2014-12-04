/**
 */
package Classes.Inventory;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Inventory.Inventory#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Inventory.InventoryPackage#getInventory()
 * @model
 * @generated NOT
 */
public interface Inventory extends IManageInventory {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Inventory.ItemType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' map.
	 * @see Classes.Inventory.InventoryPackage#getInventory_ItemType()
	 * @model mapType="Classes.ECoreMapEntries.StringToItemTypeMap<org.eclipse.uml2.types.String, Classes.Inventory.ItemType>" ordered="false"
	 * @generated
	 */
	EMap<String, ItemType> getItemType();

} // Inventory
