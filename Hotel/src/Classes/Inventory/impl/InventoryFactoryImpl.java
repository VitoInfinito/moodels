/**
 */
package Classes.Inventory.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Inventory.InventoryFactory;
import Classes.Inventory.InventoryManager;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.Item;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InventoryFactoryImpl extends EFactoryImpl implements InventoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InventoryFactory init() {
		try {
			InventoryFactory theInventoryFactory = (InventoryFactory)EPackage.Registry.INSTANCE.getEFactory(InventoryPackage.eNS_URI);
			if (theInventoryFactory != null) {
				return theInventoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InventoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InventoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}
} //InventoryFactoryImpl
