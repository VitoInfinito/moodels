/**
 */
package Classes.Restaurants.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToRestaurantMapImpl;
import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsManager;
import Classes.Restaurants.RestaurantsPackage;

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
	public static RestaurantsManagerImpl INSTANCE = new RestaurantsManagerImpl();
	
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
	 * @generated NOT
	 */
	private RestaurantsManagerImpl() {
		super();
		restaurant = new EcoreEMap<String,Restaurant>(ECoreMapEntriesPackage.Literals.STRING_TO_RESTAURANT_MAP, StringToRestaurantMapImpl.class, this, RestaurantsPackage.RESTAURANTS_MANAGER__RESTAURANT);
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Restaurant> getRestaurant() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Helper method to get a restaurant
	 * returns restaurant belonging to restaurantID
	 */
	private Restaurant getRestaurantByID(String restaurantID) {
		return restaurant.get(restaurantID);
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
	 * @generated NOT
	 */
	public List<String> getAvailableTables(Date to, Date from, String restaurantID) {
		List<String> available = new ArrayList<String>();
		List<String> notAvailable = new ArrayList<String>();
		for(Reservation reservation : getRestaurantByID(restaurantID).getReservation().values()) {
			if((reservation.getFrom().compareTo(from) >= 0 && reservation.getFrom().compareTo(to) <= 0)
					|| (reservation.getTo().compareTo(from) >= 0 && reservation.getTo().compareTo(to) <= 0)) {
				for(RestaurantTable table : reservation.getRestaurantTable()) {
					if(!notAvailable.contains(table.getTableNumber())) {
						notAvailable.add(table.getTableNumber());
					}
				}
			}
		}
		
		for(RestaurantTable table : getRestaurantByID(restaurantID).getRestaurantTable().values()) {
			if(!notAvailable.contains(table.getTableNumber())) {
				available.add(table.getTableNumber());
			}
		}
		
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getReservationGuest(String restaurantID, String reservationID) throws IllegalArgumentException, InvalidIDException{		
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
		Restaurant restaurant = getRestaurantByID(restaurantID);
		if(restaurant == null) {
			logger.warn("The Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException();
		}
		
		RestaurantMenu restaurantMenu = restaurant.getMenu();
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
	 * @generated NOT
	 */
	public List<String> searchRestaurants(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		EMap<String, Restaurant> restaurants = getRestaurant();
		
		//Exact Name match
		Restaurant restaurant = restaurants.get(keyword);
		if(restaurant != null) {
			searchResult.add(restaurant.getName());
		}
		
		//Name match somewhat
		Collection<Restaurant> c = restaurants.values();
		for(Restaurant r : c) {
			if(regexPattern.matcher(r.getName()).matches()) {
				searchResult.add(r.getName());
			}
		}
		
		//Some property match exactly
		for(Restaurant r : c) {
			if(r.getMenu().getName().equalsIgnoreCase(keyword)) {
				searchResult.add(r.getName());
			}
		}
		
		//Some property match somewhat
		for(Restaurant r : c) {
			if(regexPattern.matcher(r.getMenu().getName()).matches()) {
				searchResult.add(r.getName());
			}
		}
		
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchRestaurantReservations(String restaurantID, String keyword) {
		
		
		return null;
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}

} //RestaurantsManagerImpl
