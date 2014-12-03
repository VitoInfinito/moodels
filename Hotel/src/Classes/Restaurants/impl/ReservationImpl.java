/**
 */
package Classes.Restaurants.impl;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsPackage;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Restaurants.impl.ReservationImpl#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.ReservationImpl#getReservedBy <em>Reserved By</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.ReservationImpl#getRestaurantTable <em>Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.ReservationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link Classes.Restaurants.impl.ReservationImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedBy() <em>Reserved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservedBy() <em>Reserved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedBy()
	 * @generated
	 * @ordered
	 */
	protected String reservedBy = RESERVED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestaurantTable() <em>Restaurant Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurantTable()
	 * @generated
	 * @ordered
	 */
	protected EList<RestaurantTable> restaurantTable;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantsPackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESERVATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReservedBy() {
		return reservedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedBy(String newReservedBy) {
		String oldReservedBy = reservedBy;
		reservedBy = newReservedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESERVATION__RESERVED_BY, oldReservedBy, reservedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestaurantTable> getRestaurantTable() {
		if (restaurantTable == null) {
			restaurantTable = new EObjectResolvingEList<RestaurantTable>(RestaurantTable.class, this, RestaurantsPackage.RESERVATION__RESTAURANT_TABLE);
		}
		return restaurantTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESERVATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantsPackage.RESERVATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantsPackage.RESERVATION__ID:
				return getId();
			case RestaurantsPackage.RESERVATION__RESERVED_BY:
				return getReservedBy();
			case RestaurantsPackage.RESERVATION__RESTAURANT_TABLE:
				return getRestaurantTable();
			case RestaurantsPackage.RESERVATION__FROM:
				return getFrom();
			case RestaurantsPackage.RESERVATION__TO:
				return getTo();
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
			case RestaurantsPackage.RESERVATION__ID:
				setId((Integer)newValue);
				return;
			case RestaurantsPackage.RESERVATION__RESERVED_BY:
				setReservedBy((String)newValue);
				return;
			case RestaurantsPackage.RESERVATION__RESTAURANT_TABLE:
				getRestaurantTable().clear();
				getRestaurantTable().addAll((Collection<? extends RestaurantTable>)newValue);
				return;
			case RestaurantsPackage.RESERVATION__FROM:
				setFrom((Date)newValue);
				return;
			case RestaurantsPackage.RESERVATION__TO:
				setTo((Date)newValue);
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
			case RestaurantsPackage.RESERVATION__ID:
				setId(ID_EDEFAULT);
				return;
			case RestaurantsPackage.RESERVATION__RESERVED_BY:
				setReservedBy(RESERVED_BY_EDEFAULT);
				return;
			case RestaurantsPackage.RESERVATION__RESTAURANT_TABLE:
				getRestaurantTable().clear();
				return;
			case RestaurantsPackage.RESERVATION__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case RestaurantsPackage.RESERVATION__TO:
				setTo(TO_EDEFAULT);
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
			case RestaurantsPackage.RESERVATION__ID:
				return id != ID_EDEFAULT;
			case RestaurantsPackage.RESERVATION__RESERVED_BY:
				return RESERVED_BY_EDEFAULT == null ? reservedBy != null : !RESERVED_BY_EDEFAULT.equals(reservedBy);
			case RestaurantsPackage.RESERVATION__RESTAURANT_TABLE:
				return restaurantTable != null && !restaurantTable.isEmpty();
			case RestaurantsPackage.RESERVATION__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case RestaurantsPackage.RESERVATION__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", reservedBy: ");
		result.append(reservedBy);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
