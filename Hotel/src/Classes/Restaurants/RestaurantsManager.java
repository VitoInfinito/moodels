/**
 */
package Classes.Restaurants;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class RestaurantsManager implements IRestaurantsManage {
	private static final long serialVersionUID = 3861415362026551929L;
	private final Logger logger = LoggerFactory.getLogger(RestaurantsManager.class);
	public static RestaurantsManager INSTANCE = new RestaurantsManager();

	private HashMap<String, Restaurant> restaurant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private RestaurantsManager() {
		super();
		restaurant = new HashMap<String,Restaurant>();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getRestaurantReservations(String restaurantID) throws InvalidIDException {
		return getRestaurantByID(restaurantID).getReservationIDs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getRestaurantTables(String restaurantID) throws InvalidIDException {
		return getRestaurantByID(restaurantID).getRestaurantTableIDs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public int getRestaurantTableNumberOfSeats(String restaurantID, String tableNbr) throws InvalidIDException {		
		return getRestaurantByID(restaurantID).getTableNumberOfSeats(tableNbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getAvailableTables(LocalDateTime to, LocalDateTime from, String restaurantID) throws InvalidIDException {
		return getRestaurantByID(restaurantID).getAvailableTables( to, from);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getReservationGuest(String restaurantID, String reservationID) throws InvalidIDException {		
		return getReservationByID(restaurantID, reservationID).getReservedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getRestaurantMenuName(String restaurantID) throws InvalidIDException {
		Restaurant rest = getRestaurantByID(restaurantID);
		
		RestaurantMenu restaurantMenu = rest.getMenu();
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
		return new ArrayList<String>(restaurant.keySet());
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
		
		//Exact Name match
		Restaurant rest = restaurant.get(keyword);
		if(rest != null) {
			searchResult.add(rest.getName());
		}
		
		//Name match somewhat
		Collection<Restaurant> c = restaurant.values();
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> searchRestaurantReservations(String restaurantID, String keyword) throws InvalidIDException {
		return getRestaurantByID(restaurantID).searchReservations(keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> searchRestaurantTables(String restaurantID, String keyword) throws InvalidIDException {
		return getRestaurantByID(restaurantID).searchTables(keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void makeReservation(String restaurantID, List<String> tables, String guestID, LocalDateTime to, LocalDateTime from) throws InvalidIDException {
		getRestaurantByID(restaurantID).addReservation(tables, guestID, to, from);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void cancelReservation(String restaurantID, String reservationID) throws InvalidIDException {
		getRestaurantByID(restaurantID).cancelReservation(reservationID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeReservedTables(String restaurantID, String reservationID, List<String> tables) throws InvalidIDException {
		getRestaurantByID(restaurantID).changeReservedTables(reservationID, tables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getAvailableTablesByNbrGuests(String restaurantID, LocalDateTime to, LocalDateTime from, int nbrGuests) throws InvalidIDException {
		return getRestaurantByID(restaurantID).getAvailableTablesByNbrGuests(to, from, nbrGuests);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getRestaurantMenuItems(String restaurantID) throws InvalidIDException {
		return new ArrayList<String>(getRestaurantByID(restaurantID).getMenu().getItems());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getReservationFromTime(String restaurantID, String reservationID) throws InvalidIDException {
		return getReservationByID(restaurantID, reservationID).getFrom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getReservationToTime(String restaurantID, String reservationID) throws InvalidIDException {
		return getReservationByID(restaurantID, reservationID).getTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> searchRestaurantReservationsWithTime(String restaurantID, String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException {
		return getRestaurantByID(restaurantID).searchReservationsWithTime(keyword, from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRestaurant(String name) throws InvalidIDException {
		if(restaurant.containsKey(name)) {
			logger.warn("The restaurant name already exists");
			throw new InvalidIDException("Name ID already exists");
		}
		
		Restaurant rest = RestaurantsFactory.INSTANCE.createRestaurant();

		restaurant.put(name, rest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRestaurant(String restaurantID) throws InvalidIDException{
		Restaurant rest = restaurant.remove(restaurantID);
		if(rest == null) {
			logger.warn("The Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException("Restaurant ID do not exist");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRestaurantTable(String restaurantID, int nbrSeats, String tableNbr) throws InvalidIDException{
		Restaurant rest = getRestaurantByID(restaurantID);
		rest.addTable(tableNbr,nbrSeats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRestaurantTable(String restaurantID, String tableNbr) throws InvalidIDException{
		Restaurant rest = getRestaurantByID(restaurantID);
		rest.removeTable(tableNbr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRestaurantName(String restaurantID, String name) throws InvalidIDException{
		if(restaurant.containsKey(name)) {
			logger.warn("The Restaurant name already exists");
			throw new InvalidIDException("Restaurant name already exists");
		} else if (!restaurant.containsKey(restaurantID)) {
			logger.warn("A restaurant with id {} could not be found.", restaurantID);
			throw new InvalidIDException();
		}
		
		Restaurant rest = restaurant.remove(restaurantID);
		restaurant.put(name, rest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeTableNumberOfSeats(String restaurantID, String tableNbr, int nbrSeats) throws InvalidIDException{
		Restaurant rest = getRestaurantByID(restaurantID);
		rest.changeTableNumberOfSeats(tableNbr, nbrSeats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addMenuItem(String restaurantID, String itemID) throws InvalidIDException{	
		getRestaurantByID(restaurantID).getMenu().addItem(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeMenuItem(String restaurantID, String itemID) throws InvalidIDException{
		getRestaurantByID(restaurantID).getMenu().removeItem(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeMenuName(String restaurantID, String name) throws InvalidIDException{
		getRestaurantByID(restaurantID).getMenu().setName(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeTableNumber(String restaurantID, String oldTableNbr, String newTableNbr) throws InvalidIDException {
		Restaurant rest = getRestaurantByID(restaurantID);
		rest.changeTableNumber(oldTableNbr, newTableNbr);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getReservationTables(String restaurantID, String reservationID) throws InvalidIDException {
		List<String> tables = new ArrayList<String>();
		
		for (RestaurantTable t : getRestaurantByID(restaurantID).getReservation(reservationID).getTables()) {
			tables.add(t.getTableNumber());
		}
		
		return tables;
	}

	/**
	 * Helper method to get a restaurant
	 * returns restaurant belonging to restaurantID
	 */
	private Restaurant getRestaurantByID(String restaurantID) throws InvalidIDException{
		Restaurant rest = restaurant.get(restaurantID);
		if(rest == null) {
			logger.warn("The Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException();
		}
		return rest;
	}
	
	/**
	 * Helper method to get a reservation
	 * @param restaurantID
	 * @param reservationID
	 * @return
	 */
	private Reservation getReservationByID(String restaurantID, String reservationID) throws InvalidIDException{
		Reservation reservation = getRestaurantByID(restaurantID).getReservation(reservationID);
		if(reservation == null) {
			logger.warn("The Reservation with ID {} could not be found. Invalid ID", reservationID);
			throw new InvalidIDException();
		}
		return reservation;
	}
} //RestaurantsManagerImpl
