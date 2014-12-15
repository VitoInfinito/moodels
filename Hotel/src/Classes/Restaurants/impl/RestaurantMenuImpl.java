/**
 */
package Classes.Restaurants.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Customers.impl.CustomerImpl;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Menu</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantMenuImpl extends MinimalEObjectImpl.Container implements RestaurantMenu {
	private final Logger logger = LoggerFactory.getLogger(CustomerImpl.class);
	
	private String name;
	private EList<String> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantMenuImpl() {
		super();
		items = new EDataTypeUniqueEList<String>(String.class, this, RestaurantsPackage.RESTAURANT_MENU__ITEMS);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT_MENU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addItem(String itemID) {
		if(!items.contains(itemID)) {
			items.add(itemID);
		} else {
			logger.warn("An item with itemID {} is already added to the menu.", itemID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeItem(String itemID) {
		if(items.contains(itemID)) {
			items.remove(itemID);
		} else {
			logger.warn("An item with itemID {} could not be found.", itemID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", items: ");
		result.append(items);
		result.append(')');
		return result.toString();
	}

} //RestaurantMenuImpl
