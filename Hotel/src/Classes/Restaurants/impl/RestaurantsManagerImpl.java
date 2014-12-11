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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
import Classes.Restaurants.RestaurantsFactory;
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
	private static int counterID = 0;
	
	/**
	 * Helper method for making id's to reservation
	 * @return
	 */
	private String generateReservationID(){
		return String.format("res%06d", counterID++);
	}
	
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
	 * Helper method to check if string can be parsedInt
	 * @param str
	 * @return
	 */
	private boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    Integer.parseInt(str);
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
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
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//public EMap<String, Restaurant> getRestaurant() {
		//throw new UnsupportedOperationException();
	//}
	
	/**
	 * Helper method to get a restaurant
	 * returns restaurant belonging to restaurantID
	 */
	private Restaurant getRestaurantByID(String restaurantID) {
		Restaurant rest = restaurant.get(restaurantID);
		if(rest == null) {
			logger.warn("The Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException();
		}
		return rest;
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
	 * @generated NOT
	 */
	public List<String> searchRestaurantReservations(String restaurantID, String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		Restaurant rest = getRestaurantByID(restaurantID);
		
		EMap<String, Reservation> reservations = rest.getReservation();
		
		//Exact ID match
		Reservation reservation = reservations.get(keyword);
		if(reservation != null) {
			searchResult.add(reservation.getId());
		}
		
		//ID match somewhat
		Collection<Reservation> c = reservations.values();
		for(Reservation r : c) {
			if(regexPattern.matcher(r.getId()).matches()) {
				searchResult.add(r.getId());
			}
		}
		
		//Some property match exactly
		for(Reservation r : c) {
			if(r.getReservedBy().equalsIgnoreCase(keyword)) {
				searchResult.add(r.getId());
			}
		}
		
		//Some property match somewhat
		for(Reservation r : c) {
			if(regexPattern.matcher(r.getReservedBy()).matches()) {
				searchResult.add(r.getId());
			}
		}
		
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchRestaurantTables(String restaurantID, String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		Restaurant rest = getRestaurantByID(restaurantID);
		
		EMap<String, RestaurantTable> tables = rest.getRestaurantTable();
		
		//Exact ID match
		RestaurantTable table = tables.get(keyword);
		if(table != null) {
			searchResult.add(table.getTableNumber());
		}
		
		//ID match somewhat
		Collection<RestaurantTable> c = tables.values();
		for(RestaurantTable r : c) {
			if(regexPattern.matcher(r.getTableNumber()).matches()) {
				searchResult.add(r.getTableNumber());
			}
		}
		
		//Some property match exactly
		if(isNumeric(keyword)) {
			for(RestaurantTable r : c) {
				if(r.getNumberOfSeats() == Integer.parseInt(keyword)) {
					searchResult.add(r.getTableNumber());
				}
			}
		}
		
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void makeReservation(String restaurantID, EList<String> tables, String guestID, Date to, Date from) {
		Reservation reservation = RestaurantsFactory.eINSTANCE.createReservation();
		
		reservation.setId(generateReservationID());
		reservation.setReservedBy(guestID);
		reservation.setFrom(from);
		reservation.setTo(to);
		
		EMap<String, RestaurantTable> restTables = restaurant.get(restaurantID).getRestaurantTable();
		for(String table : tables) {
			reservation.getRestaurantTable().add(restTables.get(table));
		}
		
		restaurant.get(restaurantID).getReservation().put(reservation.getId(), reservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void makeReservation(String restaurantID, List<String> tables, String guestID, Date to, Date from) {
		Reservation reservation = RestaurantsFactory.eINSTANCE.createReservation();
		
		reservation.setId(generateReservationID());
		reservation.setReservedBy(guestID);
		reservation.setFrom(from);
		reservation.setTo(to);
		
		EMap<String, RestaurantTable> restTables = restaurant.get(restaurantID).getRestaurantTable();
		for(String table : tables) {
			reservation.getRestaurantTable().add(restTables.get(table));
		}
		
		restaurant.get(restaurantID).getReservation().put(reservation.getId(), reservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void cancelReservation(String restaurantID, String reservationID) {
		Restaurant rest = getRestaurantByID(restaurantID);
		Reservation reservation = rest.getReservation().removeKey(reservationID);
		if(reservation == null) {
			logger.warn("The Reservation with ID {} could not be found. Invalid ID", reservationID);
			throw new InvalidIDException();
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeReservedTables(String restaurantID, String reservationID, EList<String> tables) {
		Restaurant rest = restaurant.get(restaurantID);
		if(rest == null) {
			logger.warn("The Restaurant with ID {} could not be found. Invalid ID", restaurantID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableTablesByNbrGuests(String restaurantID, Date to, Date from, int nbrGuests) {
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
	 * @generated NOT
	 */
	public List<String> searchRestaurantReservationsWithTime(String restaurantID, String keyword, Date from, Date to) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		Restaurant rest = getRestaurantByID(restaurantID);
		EMap<String, Reservation> reservations = rest.getReservation();
		
		//Exact ID match
		Reservation reservation = reservations.get(keyword);
		if(reservation != null) {
			searchResult.add(reservation.getId());
		}
		
		//ID match somewhat
		Collection<Reservation> c = reservations.values();
		for(Reservation r : c) {
			if(regexPattern.matcher(r.getId()).matches()) {
				searchResult.add(r.getId());
			}
		}
		
		//Time match exactly
		for(Reservation r : c) {
			if(r.getFrom().compareTo(from) == 0 && r.getTo().compareTo(to) == 0) {
				searchResult.add(r.getId());
			}
		}
		
		//Some property match exactly
		for(Reservation r : c) {
			if(r.getReservedBy().equalsIgnoreCase(keyword)) {
				searchResult.add(r.getId());
			}
		}
		
		//Some property match somewhat
		for(Reservation r : c) {
			if(regexPattern.matcher(r.getReservedBy()).matches()) {
				searchResult.add(r.getId());
			}
		}
		
		//Some Time match somewhat
		for(Reservation r : c) {
			//TODO Implement replacement of date
			/*if(r.getFrom()) {
				searchResult.add(r.getId());
			}*/
		}
		
		return new ArrayList<String>(searchResult);
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
