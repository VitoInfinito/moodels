/**
 */
package Classes.Services;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IServices Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Services.ServicesPackage#getIServicesAccess()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
@NonNullByDefault
public interface IServicesAccess extends Serializable {
	
	IServicesAccess INSTANCE = Classes.Services.ServiceManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		if there are more than zero stored services
	 * 			return a list of all the stored services IDs
	 * 		otherwise
	 * 			return an empty list
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getAllServiceIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		if there are more than zero stored room service orders
	 * 			return a list of all the stored room service orders IDs
	 * 		otherwise
	 * 			return an empty list
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getAllRoomServiceOrderIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>keyword != null</i></br></br>
	 * Ensures:</br>
	 * 		returns a non-null list of all services matching something in the following order:</br>
	 * 			1. Services with id that exactly matches <i>keyword</i></br>
	 * 			2. Services with id that has some matching to <i>keyword</i></br>
	 * 			3. Services with attributes that exactly matches <i>keyword</i></br>
	 * 			4. Services with attributes that has some matching to <i>keyword</i></br>
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchServices(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:</br>
	 * 		<i>keyword != null</i></br></br>
	 * Ensures:</br>
	 * 		returns a non-null list of all RoomServiceOrders matching something in the following order:</br>
	 * 			1. RoomServiceOrders with id that exactly matches <i>keyword</i></br>
	 * 			2. RoomServiceOrders with id that has some matching to <i>keyword</i></br>
	 * 			3. RoomServiceOrders with attributes that exactly matches <i>keyword</i></br>
	 * 			4. RoomServiceOrders with attributes that has some matching to <i>keyword</i></br>
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchRoomServiceOrders(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the non null name of the service is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	String getServiceName(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the non null price of the service is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	double getServicePrice(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the non null expense of the service is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	double getServiceExpense(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that rso.id == id
	 * 			the delivery status of the order is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	boolean isRSODelivered(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that rso.id == id
	 * 			the delivery date of the order is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getRSODeliveryDate(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that rso.id == id
	 * 			the bookable of the order is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	String getRSOBookable(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that rso.id == id
	 * 			a of the items of order is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	List<String> getRSOItems(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that rso.id == id
	 * 			a of the services of order is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	List<String> getRSOServices(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		orderID != null && isDelivered != null
	 * Ensures:
	 * 		if there is an RoomServiceOrder rso such that rso.id = orderID
	 * 			set rso.isDelivered = isDelivered
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" isDeliveredDataType="org.eclipse.uml2.types.Boolean" isDeliveredRequired="true" isDeliveredOrdered="false"
	 * @generated
	 */
	void changeRSOISDelivered(String orderID, boolean isDelivered) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		orderID != null && date != null
	 * Ensures:
	 * 		if there is an RoomServiceOrder rso such that rso.id = orderID
	 * 			set rso.deliveryDate = date
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	void changeRSODeliveryDate(String orderID, LocalDateTime date) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		returns the name of the RoomServiceMenu
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomServiceMenuName();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		returns a non-null list with all the MenuItems
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getRoomServiceMenuItems();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		orderID != null && billID != null
	 * Ensures:
	 * 		if there exists an RoomServiceOrder rso such that rso.id == orderID
	 * 			sets the rsos bill to billID
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void setRSOBill(String orderID, String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		orderID != null
	 * Ensures:
	 * 		if there exists an RoomServiceOrder rso such that rso.id == orderID
	 * 			returns the RSOBill where bill.orderID == orderID
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	String getRSOBill(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 	Requires:
	 * 		items != null && services != null && bill != null && bookable != null && deliveryDate != null && isDelivery != null
	 * Ensures:
	 * 		if there exists a bill such that bill == billID
	 * 			adds room service order to that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemsDataType="org.eclipse.uml2.types.String" itemsMany="true" itemsOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesMany="true" servicesOrdered="false" billDataType="org.eclipse.uml2.types.String" billRequired="true" billOrdered="false" bookableDataType="org.eclipse.uml2.types.String" bookableRequired="true" bookableOrdered="false" deliveryDateRequired="true" deliveryDateOrdered="false" isDeliveredDataType="org.eclipse.uml2.types.Boolean" isDeliveredRequired="true" isDeliveredOrdered="false"
	 * @generated
	 */
	String makeRoomServiceOrder(List<String> items, List<String> services, String bill, String bookable, LocalDateTime deliveryDate, boolean isDelivered) throws InvalidIDException;

} // IServicesAccess
