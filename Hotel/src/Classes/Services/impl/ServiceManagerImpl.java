/**
 */
package Classes.Services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToRoomServiceOrderMapImpl;
import Classes.ECoreMapEntries.impl.StringToServiceMapImpl;
import Classes.Guests.impl.GuestsManagerImpl;
import Classes.Services.RoomServiceMenu;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServiceManager;
import Classes.Services.ServicesFactory;
import Classes.Services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class ServiceManagerImpl extends MinimalEObjectImpl.Container implements ServiceManager {
	private final Logger logger = LoggerFactory.getLogger(GuestsManagerImpl.class);
	public static ServiceManagerImpl INSTANCE = new ServiceManagerImpl();
	
	private EMap<String, Service> services;
	private EMap<String, RoomServiceOrder> roomServiceOrders;
	private RoomServiceMenu roomServiceMenu;
	private static int ServiceIDCounter = 1;
	private static int OrderIDCounter = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private ServiceManagerImpl() {
		super();
		services = new EcoreEMap<String,Service>(ECoreMapEntriesPackage.Literals.STRING_TO_SERVICE_MAP, StringToServiceMapImpl.class, this, ServicesPackage.SERVICE_MANAGER__SERVICE);
		roomServiceOrders = new EcoreEMap<String,RoomServiceOrder>(ECoreMapEntriesPackage.Literals.STRING_TO_ROOM_SERVICE_ORDER_MAP, StringToRoomServiceOrderMapImpl.class, this, ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER);
		roomServiceMenu = ServicesFactory.eINSTANCE.createRoomServiceMenu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAllServiceIDs() {
		return Collections.unmodifiableList(new ArrayList<String>(services.keySet()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAllRoomServiceOrderIDs() {
		return Collections.unmodifiableList(new ArrayList<String>(roomServiceOrders.keySet()));
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
		

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
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
		

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName(String serviceID) {
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
	 * @generated
	 */
	public double getServicePrice(String serviceID) {
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
	 * @generated
	 */
	public double getServiceExpense(String serviceID) {
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
	 * @generated
	 */
	public boolean isRSODelivered(String orderID) {
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
	 * @generated
	 */
	public Date getRSODeliveryDate(String orderID) {
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
	 * @generated
	 */
	public String getRSOBookable(String orderID) {
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
	 * @generated
	 */
	public List<String> getRSOItems(String orderID) {
		if (roomServiceOrders.containsKey(orderID)) {
			return Collections.unmodifiableList(roomServiceOrders.get(orderID).getItems());
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
	public List<String> getRSOServices(String orderID) {
		if (roomServiceOrders.containsKey(orderID)) {
			List<Service> services = roomServiceOrders.get(orderID).getService();
			List<String> tmp = new ArrayList<String>();
			for (Service se : services) {
				tmp.add(se.getId());
			}
			
			return Collections.unmodifiableList(tmp);
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
	public void changeRSOISDelivered(String orderID, boolean isDelivered) {
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
	 * @generated
	 */
	public void changeRSODeliveryDate(String orderID, Date date) {
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
		return Collections.unmodifiableList(roomServiceMenu.getItems());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSOBill(String orderID, String billID) {
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
	 * @generated
	 */
	public String getRSOBill(String orderID) {
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
	 * @generated
	 */
	public void makeRoomServiceOrder(List<String> items, List<String> services, String bill, String bookable, Date deliveryDate, boolean isDelivered) {
		
		RoomServiceOrder order = ServicesFactory.eINSTANCE.createRoomServiceOrder();
		
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
			if (this.services.contains(service)) {
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
	 * @generated
	 */
	public void changeServiceName(String serviceID, String name) {
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
	 * @generated
	 */
	public void changeServicePrice(String serviceID, double price) {
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
	 * @generated
	 */
	public void changeServiceExpense(String serviceID, double expense) {
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
	 * @generated
	 */
	public void addRoomServiceMenuItem(String itemID) {
		roomServiceMenu.addItem(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomServiceMenuItem(String itemID) {
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
		
		Service service = ServicesFactory.eINSTANCE.createService();
		
		String ID = generateServiceID();
		
		service.setId(ID);
		service.setName(name);
		service.setPrice(price);
		service.setExpense(expense);
		
		services.put(ID, service);
	}

	private String generateServiceID() {
		return String.format("se%06d", ServiceIDCounter++);
	}
} //ServiceManagerImpl
