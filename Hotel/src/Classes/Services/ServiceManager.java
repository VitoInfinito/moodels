/**
 */
package Classes.Services;

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
 * An implementation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
 class ServiceManager implements IServicesManager {
	private static final long serialVersionUID = -4647702574744833642L;
	private final Logger logger = LoggerFactory.getLogger(ServiceManager.class);
	public static ServiceManager INSTANCE = new ServiceManager();
	
	private HashMap<String, Service> services;
	private HashMap<String, RoomServiceOrder> roomServiceOrders;
	private RoomServiceMenu roomServiceMenu;
	private static int ServiceIDCounter = 1;
	private static int OrderIDCounter = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private ServiceManager() {
		super();
		services = new HashMap<String,Service>();
		roomServiceOrders = new HashMap<String,RoomServiceOrder>();
		roomServiceMenu = ServicesFactory.INSTANCE.createRoomServiceMenu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAllServiceIDs() {
		return new ArrayList<String>(services.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAllRoomServiceOrderIDs() {
		return new ArrayList<String>(roomServiceOrders.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> searchServices(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (services.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Service> c = services.values();
		
		// Some property match exactly. Second Order!
		for (Service b : c) {
			if (b.getName().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} 
		}
		
		// ID match somewhat. Third Order!
		for (Service b : c) {			
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Service b : c) {
			if (regexPattern.matcher(b.getName()).matches()) {
				searchResult.add(b.getId());
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> searchRoomServiceOrders(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (roomServiceOrders.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<RoomServiceOrder> c = roomServiceOrders.values();
		
		// Some property match exactly. Second Order!
		for (RoomServiceOrder b : c) {
			if (b.getBill().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} else if (b.getBookable().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} else if (b.getItems().contains(keyword)) {
				searchResult.add(b.getId());
			} else if (b.getService().contains(keyword)) {
				searchResult.add(b.getId());
			} 
		}
		
		// ID match somewhat. Third Order!
		for (RoomServiceOrder b : c) {			
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (RoomServiceOrder b : c) {
			if (regexPattern.matcher(b.getBill()).matches()) {
				searchResult.add(b.getId());
			} else if (regexPattern.matcher(b.getBookable()).matches()) {
				searchResult.add(b.getId());
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public String getServiceName(String serviceID) throws InvalidIDException {
		if (services.containsKey(serviceID)) {
			return services.get(serviceID).getName();
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public double getServicePrice(String serviceID) throws InvalidIDException {
		if (services.containsKey(serviceID)) {
			return services.get(serviceID).getPrice();
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public double getServiceExpense(String serviceID) throws InvalidIDException {
		if (services.containsKey(serviceID)) {
			return services.get(serviceID).getExpense();
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public boolean isRSODelivered(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			return roomServiceOrders.get(orderID).isDelivered();
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public LocalDateTime getRSODeliveryDate(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			return roomServiceOrders.get(orderID).getDeliveryDate();
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public String getRSOBookable(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			return roomServiceOrders.get(orderID).getBookable();
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public List<String> getRSOItems(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			return new ArrayList<String>(roomServiceOrders.get(orderID).getItems());
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public List<String> getRSOServices(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			List<Service> services = roomServiceOrders.get(orderID).getService();
			List<String> tmp = new ArrayList<String>();
			for (Service se : services) {
				tmp.add(se.getId());
			}
			
			return tmp;
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void changeRSOISDelivered(String orderID, boolean isDelivered) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			roomServiceOrders.get(orderID).setIsDelivered(isDelivered);
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void changeRSODeliveryDate(String orderID, LocalDateTime date) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			roomServiceOrders.get(orderID).setDeliveryDate(date);
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomServiceMenuName() {
		return roomServiceMenu.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRoomServiceMenuItems() {
		return new ArrayList<String>(roomServiceMenu.getItems());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void setRSOBill(String orderID, String billID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			roomServiceOrders.get(orderID).setBill(billID);
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public String getRSOBill(String orderID) throws InvalidIDException {
		if (roomServiceOrders.containsKey(orderID)) {
			return roomServiceOrders.get(orderID).getBill();
		} else {
			logger.warn("A order with id {} could not be found.", orderID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void makeRoomServiceOrder(List<String> items, List<String> services, String bill, String bookable, LocalDateTime deliveryDate, boolean isDelivered) throws InvalidIDException {
		
		RoomServiceOrder order = ServicesFactory.INSTANCE.createRoomServiceOrder();
		
		String ID = generateOrderID();
		
		order.setId(ID);
		order.setBill(bill);
		order.setBookable(bookable);
		order.setDeliveryDate(deliveryDate);
		order.setIsDelivered(isDelivered);
		
		for (String item : items) {
			order.addItem(item);
		}
		
		for (String service : services) {
			if (this.services.containsKey(service)) {
				order.addService(this.services.get(service));
			} else {
				logger.warn("A service with id {} could not be found.", service);
				throw new InvalidIDException();
			}
		}
		
		roomServiceOrders.put(ID, order);
	}

	private String generateOrderID() {
		return String.format("or%06d", OrderIDCounter++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void changeServiceName(String serviceID, String name) throws InvalidIDException {
		if (services.containsKey(serviceID)) {
			services.get(serviceID).setName(name);
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void changeServicePrice(String serviceID, double price) throws InvalidIDException, IllegalArgumentException {
		if (price < 0) {
			logger.warn("The price is negative.");
			throw new IllegalArgumentException("The price is negative.");
		}
		
		if (services.containsKey(serviceID)) {
			services.get(serviceID).setPrice(price);
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void changeServiceExpense(String serviceID, double expense) throws InvalidIDException, IllegalArgumentException {
		if (expense < 0) {
			logger.warn("The expense is negative.");
			throw new IllegalArgumentException("The expense is negative.");
		}
		
		if (services.containsKey(serviceID)) {
			services.get(serviceID).setExpense(expense);
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void addRoomServiceMenuItem(String itemID) throws InvalidIDException {
		roomServiceMenu.addItem(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void removeRoomServiceMenuItem(String itemID) throws InvalidIDException {
		roomServiceMenu.removeItem(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomServiceMenuName(String name) {
		roomServiceMenu.setName(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(String name, double price, double expense) {
		if (price < 0 || expense < 0) {
			logger.warn("The price or expense is negative.");
			throw new IllegalArgumentException("The price or expense is negative.");
		}
		
		Service service = ServicesFactory.INSTANCE.createService();
		
		String ID = generateServiceID();
		
		service.setId(ID);
		service.setName(name);
		service.setPrice(price);
		service.setExpense(expense);
		
		services.put(ID, service);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(String serviceID) throws InvalidIDException {
		if (services.containsKey(serviceID)) {
			services.remove(serviceID);
		} else {
			logger.warn("A service with id {} could not be found.", serviceID);
			throw new InvalidIDException();
		}
	}

	private String generateServiceID() {
		return String.format("se%06d", ServiceIDCounter++);
	}
} //ServiceManagerImpl
