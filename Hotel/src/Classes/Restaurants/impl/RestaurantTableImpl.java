/**
 */
package Classes.Restaurants.impl;

import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Restaurants.impl.RestaurantTableImpl#getTableNumber <em>Table Number</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.RestaurantTableImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestaurantTableImpl extends MinimalEObjectImpl.Container implements RestaurantTable {
	/**
	 * The default value of the '{@link #getTableNumber() <em>Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableNumber() <em>Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNumber()
	 * @generated
	 * @ordered
	 */
	protected String tableNumber = TABLE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSeats = NUMBER_OF_SEATS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantsPackage.Literals.RESTAURANT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableNumber() {
		return tableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNumber(String newTableNumber) {
		String oldTableNumber = tableNumber;
		tableNumber = newTableNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT_TABLE__TABLE_NUMBER, oldTableNumber, tableNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeats(int newNumberOfSeats) {
		int oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESTAURANT_TABLE__NUMBER_OF_SEATS, oldNumberOfSeats, numberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT_TABLE__TABLE_NUMBER:
				return getTableNumber();
			case RestaurantsPackage.RESTAURANT_TABLE__NUMBER_OF_SEATS:
				return getNumberOfSeats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantsPackage.RESTAURANT_TABLE__TABLE_NUMBER:
				setTableNumber((String)newValue);
				return;
			case RestaurantsPackage.RESTAURANT_TABLE__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
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
			case RestaurantsPackage.RESTAURANT_TABLE__TABLE_NUMBER:
				setTableNumber(TABLE_NUMBER_EDEFAULT);
				return;
			case RestaurantsPackage.RESTAURANT_TABLE__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
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
			case RestaurantsPackage.RESTAURANT_TABLE__TABLE_NUMBER:
				return TABLE_NUMBER_EDEFAULT == null ? tableNumber != null : !TABLE_NUMBER_EDEFAULT.equals(tableNumber);
			case RestaurantsPackage.RESTAURANT_TABLE__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (tableNumber: ");
		result.append(tableNumber);
		result.append(", numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(')');
		return result.toString();
	}

} //RestaurantTableImpl
