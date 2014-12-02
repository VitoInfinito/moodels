/**
 */
package Classes.Restaurants.impl;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Restaurants.impl.RestaurantImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.RestaurantImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.RestaurantImpl#getRestaurantTable <em>Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.RestaurantImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestaurantImpl extends MinimalEObjectImpl.Container implements Restaurant {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservation;

	/**
	 * The cached value of the '{@link #getRestaurantTable() <em>Restaurant Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurantTable()
	 * @generated
	 * @ordered
	 */
	protected RestaurantTable restaurantTable;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected RestaurantMenu menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantsPackage.Literals.RESTAURANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservation() {
		if (reservation == null) {
			reservation = new EObjectResolvingEList<Reservation>(Reservation.class, this, RestaurantsPackage.RESTAURANT__RESERVATION);
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTable getRestaurantTable() {
		if (restaurantTable != null && restaurantTable.eIsProxy()) {
			InternalEObject oldRestaurantTable = (InternalEObject)restaurantTable;
			restaurantTable = (RestaurantTable)eResolveProxy(oldRestaurantTable);
			if (restaurantTable != oldRestaurantTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE, oldRestaurantTable, restaurantTable));
			}
		}
		return restaurantTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTable basicGetRestaurantTable() {
		return restaurantTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestaurantTable(RestaurantTable newRestaurantTable) {
		RestaurantTable oldRestaurantTable = restaurantTable;
		restaurantTable = newRestaurantTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE, oldRestaurantTable, restaurantTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMenu getMenu() {
		if (menu != null && menu.eIsProxy()) {
			InternalEObject oldMenu = (InternalEObject)menu;
			menu = (RestaurantMenu)eResolveProxy(oldMenu);
			if (menu != oldMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestaurantsPackage.RESTAURANT__MENU, oldMenu, menu));
			}
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMenu basicGetMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(RestaurantMenu newMenu) {
		RestaurantMenu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllTables() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllReservations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				return getName();
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				return getReservation();
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				if (resolve) return getRestaurantTable();
				return basicGetRestaurantTable();
			case RestaurantsPackage.RESTAURANT__MENU:
				if (resolve) return getMenu();
				return basicGetMenu();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				setName((String)newValue);
				return;
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				getReservation().clear();
				getReservation().addAll((Collection<? extends Reservation>)newValue);
				return;
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				setRestaurantTable((RestaurantTable)newValue);
				return;
			case RestaurantsPackage.RESTAURANT__MENU:
				setMenu((RestaurantMenu)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				getReservation().clear();
				return;
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				setRestaurantTable((RestaurantTable)null);
				return;
			case RestaurantsPackage.RESTAURANT__MENU:
				setMenu((RestaurantMenu)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				return reservation != null && !reservation.isEmpty();
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				return restaurantTable != null;
			case RestaurantsPackage.RESTAURANT__MENU:
				return menu != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RestaurantsPackage.RESTAURANT___SET_NAME:
				setName();
				return null;
			case RestaurantsPackage.RESTAURANT___ADD_RESERVATION:
				addReservation();
				return null;
			case RestaurantsPackage.RESTAURANT___GET_ALL_TABLES:
				getAllTables();
				return null;
			case RestaurantsPackage.RESTAURANT___GET_ALL_RESERVATIONS:
				getAllReservations();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //RestaurantImpl
