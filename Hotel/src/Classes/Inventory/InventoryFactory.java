/**
 */
package Classes.Inventory;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class InventoryFactory implements Serializable {

	private static final long serialVersionUID = -7883657084649839953L;
	
	static InventoryFactory INSTANCE = new InventoryFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InventoryFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		Item item = new Item();
		return item;
	}
} //InventoryFactoryImpl
