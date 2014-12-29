/**
 */
package Classes.Restaurants;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Menu</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class RestaurantMenu implements Serializable {
	private static final long serialVersionUID = -1614951910564542891L;

	private final Logger logger = LoggerFactory.getLogger(RestaurantMenu.class);
	
	private String name;
	private List<String> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantMenu() {
		super();
		items = new ArrayList<String>();
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
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void addItem(String itemID) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void removeItem(String itemID) throws InvalidIDException {
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
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", items: ");
		result.append(items);
		result.append(')');
		return result.toString();
	}

} //RestaurantMenuImpl
