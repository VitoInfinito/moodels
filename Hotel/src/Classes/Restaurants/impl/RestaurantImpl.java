/**
 */
package Classes.Restaurants.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToReservationMapImpl;
import Classes.ECoreMapEntries.impl.StringToRestaurantTableMapImpl;
import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsFactory;
import Classes.Restaurants.RestaurantsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantImpl extends MinimalEObjectImpl.Container implements Restaurant {
	private final Logger logger = LoggerFactory.getLogger(RestaurantImpl.class);
	private String name;
	private EMap<String, Reservation> reservations;
	private EMap<String, RestaurantTable> restaurantTables;
	private RestaurantMenu menu;
	private static int counterID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantImpl() {
		super();
		reservations = new EcoreEMap<String,Reservation>(ECoreMapEntriesPackage.Literals.STRING_TO_RESERVATION_MAP, StringToReservationMapImpl.class, this, RestaurantsPackage.RESTAURANT__RESERVATION);
		restaurantTables = new EcoreEMap<String,RestaurantTable>(ECoreMapEntriesPackage.Literals.STRING_TO_RESTAURANT_TABLE_MAP, StringToRestaurantTableMapImpl.class, this, RestaurantsPackage.RESTAURANT__RESTAURANT_TABLE);
		menu = RestaurantsFactory.eINSTANCE.createRestaurantMenu();
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
	@Override
	public Reservation getReservation(String reservationID) {
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public void changeTableNumber(String oldTableNbr, String newTableNbr) {
		if (restaurantTables.containsKey(oldTableNbr)) {
			RestaurantTable table = restaurantTables.get(oldTableNbr);
			table.setTableNumber(newTableNbr);
			restaurantTables.removeKey(oldTableNbr);
			restaurantTables.put(newTableNbr, table);
		} else {
			logger.warn("A table with id {} could not be found.", oldTableNbr);
			throw new InvalidIDException();
		}
	}

	@Override
	public void changeTableNumberOfSeats(String tableNbr, int nbrSeats) {
		if (restaurantTables.containsKey(tableNbr)) {
			RestaurantTable table = restaurantTables.get(tableNbr);
			table.setNumberOfSeats(nbrSeats);
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	@Override
	public void removeTable(String tableNbr) {
		if (restaurantTables.containsKey(tableNbr)) {
			restaurantTables.removeKey(tableNbr);
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	@Override
	public void addTable(String tableNbr, int nbrSeats) {
		if (!restaurantTables.containsKey(tableNbr)) {
			
			RestaurantTable table = RestaurantsFactory.eINSTANCE.createRestaurantTable();
			table.setTableNumber(tableNbr);
			table.setNumberOfSeats(nbrSeats);
			
			restaurantTables.put(tableNbr, table);
		} else {
			logger.warn("A table with id {} already exists.", tableNbr);
			throw new InvalidIDException();
		}
	}

	@Override
	public List<String> getReservationIDs() {
		return new ArrayList<String>(reservations.keySet());
	}

	@Override
	public List<String> getRestaurantTableIDs() {
		return new ArrayList<String>(restaurantTables.keySet());
	}

	@Override
	public int getTableNumberOfSeats(String tableNbr) {
		if (restaurantTables.containsKey(tableNbr)) {
			return restaurantTables.get(tableNbr).getNumberOfSeats();
		} else {
			logger.warn("A table with id {} could not be found.", tableNbr);
			throw new InvalidIDException();
		}
	}

	@Override
	public List<String> getAvailableTables(Date to, Date from) {
		List<String> available = new ArrayList<String>();
		List<String> notAvailable = new ArrayList<String>();
		for(Reservation reservation : reservations.values()) {
			if((reservation.getFrom().compareTo(from) >= 0 && reservation.getFrom().compareTo(to) <= 0)
					|| (reservation.getTo().compareTo(from) >= 0 && reservation.getTo().compareTo(to) <= 0)) {
				for(RestaurantTable table : restaurantTables.values()) {
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

	@Override
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
		
		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
	}

	@Override
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
		
		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
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

	@Override
	public void addReservation(List<String> tables, String guestID, Date to, Date from) {
		Reservation reservation = RestaurantsFactory.eINSTANCE.createReservation();
		
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

	@Override
	public void cancelReservation(String reservationID) {
		if (reservations.containsKey(reservationID)) {
			reservations.removeKey(reservationID);
		} else {
			logger.warn("A reservation with id {} could not be found.", reservationID);
			throw new InvalidIDException();
		}
	}

	@Override
	public void changeReservedTables(String reservationID, List<String> tables) {
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

	@Override
	public List<String> getAvailableTablesByNbrGuests(Date to, Date from, int nbrGuests) {
		List<String> availableTables = getAvailableTables(to, from);
		List<String> newList = new ArrayList<String>();
		
		for(String table : availableTables) {
			if (restaurantTables.get(table).getNumberOfSeats() <= nbrGuests) {
				newList.add(table);
			}
		}
		
		return Collections.unmodifiableList(new ArrayList<String>(newList));
	}

	@Override
	public List<String> searchReservationsWithTime(String keyword, Date from, Date to) {
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
		
		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
	}
} //RestaurantImpl
