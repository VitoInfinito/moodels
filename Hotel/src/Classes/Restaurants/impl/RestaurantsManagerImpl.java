/**
 */
package Classes.Restaurants.impl;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToRestaurantMapImpl;
import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantsManager;
import Classes.Restaurants.RestaurantsPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Restaurants.impl.RestaurantsManagerImpl#getRestaurant <em>Restaurant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestaurantsManagerImpl extends MinimalEObjectImpl.Container implements RestaurantsManager {
	private final Logger logger = LoggerFactory.getLogger(RestaurantsManagerImpl.class);

	
	/**
	 * The cached value of the '{@link #getRestaurant() <em>Restaurant</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurant()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Restaurant> restaurant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantsManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantsPackage.Literals.RESTAURANTS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Restaurant> getRestaurant() {
		if (restaurant == null) {
			restaurant = new EcoreEMap<String,Restaurant>(ECoreMapEntriesPackage.Literals.STRING_TO_RESTAURANT_MAP, StringToRestaurantMapImpl.class, this, RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT);
		}
		return restaurant;
	}
	
	/**
	 * Helper method to get a restaurant
	 * returns restaurant belonging to restaurantID
	 */
	private Restaurant getRestaurantByID(String restaurantID) {
		return getRestaurant().get(restaurantID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getRestaurantReservations(String restaurantID) {
		return restaurantID != null ? new ArrayList<String>(getRestaurantByID(restaurantID).getReservation().keySet()) : new ArrayList<String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getRestaurantTables(String restaurantID) {
		return new ArrayList<String>(getRestaurantByID(restaurantID).getRestaurantTable().keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRestaurantTableNumberOfSeats(String restaurantID, String tableNbr) {		
		return getRestaurantByID(restaurantID).getRestaurantTable().get(tableNbr).getNumberOfSeats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableTables(Date to, Date from) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getReservationGuest(String restaurantID, String reservationID) throws IllegalArgumentException, InvalidIDException{
		if(restaurantID == null || reservationID == null) {
			logger.warn("The id of one or more parameters were null");
			throw new IllegalArgumentException("ID was null");
		}
		
		Reservation reservation = getRestaurantByID(restaurantID).getReservation().get(reservationID);
		if(reservation == null) {
			logger.warn("Reservation with ID {} could not be found. Invalid ID", reservationID);
			throw new InvalidIDException();
		}
		
		return reservation.getReservedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRestaurantMenuName(String restaurantID) {
		if(restaurantID == null) {
			logger.warn("The id of restaurant was null");
			throw new IllegalArgumentException("ID was null");
		}
		
		RestaurantMenu restaurantMenu = getRestaurantByID(restaurantID).getMenu();
		
		if(restaurantMenu == null) {
			logger.warn("Menu belonging to Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException();
		}
		
		return restaurantMenu.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllRestaurantNames() {
		return new ArrayList<String>(getRestaurant().keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRestaurants(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRestaurantReservations(String restaurantID, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRestaurantTables(String restaurantID, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeReservation(String restaurantID, EList<String> tables, String guestID, Date to, Date from) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelReservation(String restaurantID, String reservationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeReservedTables(String restaurantID, String reservationID, EList<String> tables) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableTablesByNbrGuests(Date to, Date from, int nbrGuests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRestaurantMenuItems(String restaurantID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReservationFromTime(String restaurantID, String reservationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReservationToTime(String restaurantID, String reservationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRestaurant(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRestaurant(String restaurantID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRestaurantTable(String restaurantID, int nbrSeats, String tableNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRestaurantTable(String restaurantID, String tableNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRestaurantName(String restaurantID, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeTableNumberOfSeats(String restaurantID, String tableNbr, int nbrSeats) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMenuItem(String restaurantID, String itemID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeMenuItem(String restaurantID, String itemID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeMenuName(String restaurantID, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeTableNumber(String restaurantID, String oldTableNbr, String newTableNbr) {
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
			case RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT:
				return ((InternalEList<?>)getRestaurant()).basicRemove(otherEnd, msgs);
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
			case RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT:
				if (coreType) return getRestaurant();
				else return getRestaurant().map();
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
			case RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT:
				((EStructuralFeature.Setting)getRestaurant()).set(newValue);
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
			case RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT:
				getRestaurant().clear();
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
			case RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT:
				return restaurant != null && !restaurant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESTAURANT_RESERVATIONS__STRING:
				return getRestaurantReservations((String)arguments.get(0));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESTAURANT_TABLES__STRING:
				return getRestaurantTables((String)arguments.get(0));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING:
				return getRestaurantTableNumberOfSeats((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_AVAILABLE_TABLES__DATE_DATE:
				return getAvailableTables((Date)arguments.get(0), (Date)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESERVATION_GUEST__STRING_STRING:
				return getReservationGuest((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESTAURANT_MENU_NAME__STRING:
				return getRestaurantMenuName((String)arguments.get(0));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_ALL_RESTAURANT_NAMES:
				return getAllRestaurantNames();
			case RestaurantsPackage.RESTAURANTS_MANAGER___SEARCH_RESTAURANTS__STRING:
				return searchRestaurants((String)arguments.get(0));
			case RestaurantsPackage.RESTAURANTS_MANAGER___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING:
				return searchRestaurantReservations((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___SEARCH_RESTAURANT_TABLES__STRING_STRING:
				return searchRestaurantTables((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE:
				makeReservation((String)arguments.get(0), (EList<String>)arguments.get(1), (String)arguments.get(2), (Date)arguments.get(3), (Date)arguments.get(4));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CANCEL_RESERVATION__STRING_STRING:
				cancelReservation((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST:
				changeReservedTables((String)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__DATE_DATE_INT:
				return getAvailableTablesByNbrGuests((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESTAURANT_MENU_ITEMS__STRING:
				return getRestaurantMenuItems((String)arguments.get(0));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESERVATION_FROM_TIME__STRING_STRING:
				return getReservationFromTime((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___GET_RESERVATION_TO_TIME__STRING_STRING:
				return getReservationToTime((String)arguments.get(0), (String)arguments.get(1));
			case RestaurantsPackage.RESTAURANTS_MANAGER___ADD_RESTAURANT__STRING:
				addRestaurant((String)arguments.get(0));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___REMOVE_RESTAURANT__STRING:
				removeRestaurant((String)arguments.get(0));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___ADD_RESTAURANT_TABLE__STRING_INT_STRING:
				addRestaurantTable((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___REMOVE_RESTAURANT_TABLE__STRING_STRING:
				removeRestaurantTable((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CHANGE_RESTAURANT_NAME__STRING_STRING:
				changeRestaurantName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT:
				changeTableNumberOfSeats((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___ADD_MENU_ITEM__STRING_STRING:
				addMenuItem((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___REMOVE_MENU_ITEM__STRING_STRING:
				removeMenuItem((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CHANGE_MENU_NAME__STRING_STRING:
				changeMenuName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RestaurantsPackage.RESTAURANTS_MANAGER___CHANGE_TABLE_NUMBER__STRING_STRING_STRING:
				changeTableNumber((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RestaurantsManagerImpl
