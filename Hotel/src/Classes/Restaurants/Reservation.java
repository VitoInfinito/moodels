/**
 */
package Classes.Restaurants;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class Reservation implements Serializable {
	private static final long serialVersionUID = -5059876696465110928L;
	private final Logger logger = LoggerFactory.getLogger(Reservation.class);
	private String id;
	private String reservedBy;
	private List<RestaurantTable> restaurantTables;
	private LocalDateTime from;
	private LocalDateTime to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservation() {
		super();
		restaurantTables = new ArrayList<RestaurantTable>();
	}
	
	public List<RestaurantTable> getTables() {
		return restaurantTables;
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
		id = newId;
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
		reservedBy = newReservedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(LocalDateTime newFrom) {
		from = newFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(LocalDateTime newTo) {
		to = newTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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

	public void addTable(RestaurantTable table) {
		if (!restaurantTables.contains(table)) {
			restaurantTables.add(table);
		} else {
			logger.warn("The table {} is already added to the reservation.", table);
			throw new IllegalArgumentException();
		}
	}

	public void changeTables(List<RestaurantTable> tables) {
		restaurantTables.clear();
		restaurantTables.addAll(tables);
	}

} //ReservationImpl
