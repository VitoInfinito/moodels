/**
 */
package Classes.Restaurants.impl;

import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToReservationMapImpl;
import Classes.ECoreMapEntries.impl.StringToRestaurantTableMapImpl;
import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Reservation> reservation;

	/**
	 * The cached value of the '{@link #getRestaurantTable() <em>Restaurant Table</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurantTable()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, RestaurantTable> restaurantTable;

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
	 * @generated NOT
	 */
	public EMap<String, Reservation> getReservation() {
		if (reservation == null) {
			reservation = new EcoreEMap<String,Reservation>(ECoreMapEntriesPackage.Literals.STRING_TO_RESERVATION_MAP, StringToReservationMapImpl.class, this, RestaurantsPackage.RESTAURANT__RESERVATION);
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, RestaurantTable> getRestaurantTable() {
		if (restaurantTable == null) {
			restaurantTable = new EcoreEMap<String,RestaurantTable>(ECoreMapEntriesPackage.Literals.STRING_TO_RESTAURANT_TABLE_MAP, StringToRestaurantTableMapImpl.class, this, RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE);
		}
		return restaurantTable;
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
	public void addReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				return ((InternalEList<?>)getReservation()).basicRemove(otherEnd, msgs);
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				return ((InternalEList<?>)getRestaurantTable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				return getName();
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				if (coreType) return getReservation();
				else return getReservation().map();
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				if (coreType) return getRestaurantTable();
				else return getRestaurantTable().map();
			case RestaurantsPackage.RESTAURANT__MENU:
				if (resolve) return getMenu();
				return basicGetMenu();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				setName((String)newValue);
				return;
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				((EStructuralFeature.Setting)getReservation()).set(newValue);
				return;
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				((EStructuralFeature.Setting)getRestaurantTable()).set(newValue);
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
	 * @generated NOT
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
				getRestaurantTable().clear();
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
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantsPackage.RESTAURANT__RESERVATION:
				return reservation != null && !reservation.isEmpty();
			case RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE:
				return restaurantTable != null && !restaurantTable.isEmpty();
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
			case RestaurantsPackage.RESTAURANT___ADD_RESERVATION:
				addReservation();
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
