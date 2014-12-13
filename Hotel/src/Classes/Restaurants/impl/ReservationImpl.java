/**
 */
package Classes.Restaurants.impl;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsPackage;

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
	private final Logger logger = LoggerFactory.getLogger(ReservationImpl.class);
	private String id;
	private String reservedBy;
	private EList<RestaurantTable> restaurantTable;
	private Date from;
	private Date to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
		restaurantTable = new EObjectResolvingEList<RestaurantTable>(RestaurantTable.class, this, RestaurantsPackage.RESERVATION__RESTAURANT_TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
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

	@Override
	public void addTable(RestaurantTable table) {
		if (!restaurantTable.contains(table)) {
			restaurantTable.add(table);
		} else {
			logger.warn("The table {} is already added to the reservation.", table);
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void changeTables(List<RestaurantTable> tables) {
		restaurantTable.clear();
		restaurantTable.addAll(tables);
	}

} //ReservationImpl
