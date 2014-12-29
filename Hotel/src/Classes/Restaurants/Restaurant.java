/**
 */
package Classes.Restaurants;

import java.io.Serializable;
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
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class Restaurant implements Serializable {
	
	private static final long serialVersionUID = 8858712942406489065L;
	
	private final Logger logger = LoggerFactory.getLogger(Restaurant.class);
	private String name;
	private HashMap<String, Reservation> reservations;
	private HashMap<String, RestaurantTable> restaurantTables;
	private RestaurantMenu menu;
	private static int counterID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Restaurant() {
		super();
		reservations = new HashMap<String,Reservation>();
		restaurantTables = new HashMap<String,RestaurantTable>();
		menu = RestaurantsFactory.INSTANCE.createRestaurantMenu();
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
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMenu getMenu() {
		return menu;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public Reservation getReservation(String reservationID) throws InvalidIDException {
		if (reservations.containsKey(reservationID)) {
			return reservations.get(reservationID);
		} else {
			logger.warn("A reservation with id {} could not be found.", reservationID);
			throw new InvalidIDException();
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public void changeTableNumber(String oldTableNbr, String newTableNbr) throws InvalidIDException {
		if (restaurantTables.containsKey(oldTableNbr)) {
			RestaurantTable table = restaurantTables.get(oldTableNbr);
			table.setTableNumber(newTableNbr);
			restaurantTables.remove(oldTableNbr);
			restaurantTables.put(newTableNbr, table);
		} else {
			logger.warn("A table with id {} could not be found.", oldTableNbr);
			throw new InvalidIDException();
		}
	}

	public void changeTableNumberOfSeats(String tableNbr, int nbrSeats) throws InvalidIDException {
		if (restaurantTables.containsKey(tableNbr)) {
			RestaurantTable table = restaurantTables.get(tableNbr);
			table.setNumberOfSeats(nbrSeats);
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	public void removeTable(String tableNbr) throws InvalidIDException {
		if (restaurantTables.containsKey(tableNbr)) {
			restaurantTables.remove(tableNbr);
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	public void addTable(String tableNbr, int nbrSeats) throws InvalidIDException {
		if (!restaurantTables.containsKey(tableNbr)) {
			
			RestaurantTable table = RestaurantsFactory.INSTANCE.createRestaurantTable();
			table.setTableNumber(tableNbr);
			table.setNumberOfSeats(nbrSeats);
			
			restaurantTables.put(tableNbr, table);
		} else {
			logger.warn("A table with id {} already exists.", tableNbr);
			throw new InvalidIDException();
		}
	}

	public List<String> getReservationIDs() {
		return new ArrayList<String>(reservations.keySet());
	}

	public List<String> getRestaurantTableIDs() {
		return new ArrayList<String>(restaurantTables.keySet());
	}

	public int getTableNumberOfSeats(String tableNbr) throws InvalidIDException {
		if (restaurantTables.containsKey(tableNbr)) {
			return restaurantTables.get(tableNbr).getNumberOfSeats();
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	public List<String> getAvailableTables(LocalDateTime to, LocalDateTime from) {
		List<String> available = new ArrayList<String>();
		Set<String> notAvailable = new LinkedHashSet<String>();
		for(Reservation reservation : reservations.values()) {
			if ((reservation.getFrom().isAfter(from) && reservation.getFrom().isBefore(to)) ||  // Reservation begins within period
				(reservation.getTo().isAfter(from) && reservation.getTo().isBefore(to))     ||  // Reservation ends within period
				(reservation.getFrom().isBefore(from) && reservation.getTo().isAfter(to))) {    // Reservation starts before the period and ends after the period
				for(RestaurantTable table : reservation.getTables()) {
					if(!notAvailable.contains(table.getTableNumber())) {
						notAvailable.add(table.getTableNumber());
					}
				}
			}
		}
		
		for(RestaurantTable table : restaurantTables.values()) {
			if(!notAvailable.contains(table.getTableNumber())) {
				available.add(table.getTableNumber());
			}
		}
		
		return new ArrayList<String>(available);
	}

	public List<String> searchReservations(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
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

	public List<String> searchTables(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		//Exact ID match
		RestaurantTable table = restaurantTables.get(keyword);
		if(table != null) {
			searchResult.add(table.getTableNumber());
		}
		
		//ID match somewhat
		Collection<RestaurantTable> c = restaurantTables.values();
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

	public void addReservation(List<String> tables, String guestID, LocalDateTime to, LocalDateTime from) {
		Reservation reservation = RestaurantsFactory.INSTANCE.createReservation();
		
		reservation.setId(generateReservationID());
		reservation.setReservedBy(guestID);
		reservation.setFrom(from);
		reservation.setTo(to);
		
		for(String table : tables) {
			reservation.addTable(restaurantTables.get(table));
		}
		
		reservations.put(reservation.getId(), reservation);
	}
	
	/**
	 * Helper method for making id's to reservation
	 * @return
	 */
	private String generateReservationID(){
		return String.format("res%06d", counterID++);
	}

	public void cancelReservation(String reservationID) throws InvalidIDException {
		if (reservations.containsKey(reservationID)) {
			reservations.remove(reservationID);
		} else {
			logger.warn("A reservation with id {} could not be found.", reservationID);
			throw new InvalidIDException();
		}
	}

	public void changeReservedTables(String reservationID, List<String> tables) throws InvalidIDException {
		if (reservations.containsKey(reservationID)) {
			List<RestaurantTable> tab = new ArrayList<RestaurantTable>();
			for (String table : tables) {
				if (restaurantTables.containsKey(table)) {
					tab.add(restaurantTables.get(table));
				} else {
					logger.warn("A tables with id {} could not be found.", table);
					throw new InvalidIDException();
				}
			}
			reservations.get(reservationID).changeTables(tab);
		} else {
			logger.warn("A reservation with id {} could not be found.", reservationID);
			throw new InvalidIDException();
		}
	}

	public List<String> getAvailableTablesByNbrGuests(LocalDateTime to, LocalDateTime from, int nbrGuests) {
		List<String> availableTables = getAvailableTables(to, from);
		List<String> newList = new ArrayList<String>();
		
		for(String table : availableTables) {
			if (restaurantTables.get(table).getNumberOfSeats() <= nbrGuests) {
				newList.add(table);
			}
		}
		
		return new ArrayList<String>(newList);
	}

	public List<String> searchReservationsWithTime(String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException {
		List<String> temp = searchReservations(keyword);
		List<String> result = new ArrayList<String>(temp.size());
		for (String resID : temp) {
			Reservation reservation = getReservation(resID);
			if ((reservation.getFrom().isAfter(from) && reservation.getFrom().isBefore(to)) ||  // Reservation begins within period
				(reservation.getTo().isAfter(from) && reservation.getTo().isBefore(to))     ||  // Reservation ends within period
				(reservation.getFrom().isBefore(from) && reservation.getTo().isAfter(to))) {    // Reservation starts before the period and ends after the period
				result.add(resID);
			}	
		}
		return result;
	}
} //RestaurantImpl
