/**
 */
package Classes.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.InvalidIDException;

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
public interface IServicesAccess extends EObject {
	
	IServicesAccess INSTANCE = Classes.Services.impl.ServiceManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getAllServiceIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getAllRoomServiceOrderIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchServices(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchRoomServiceOrders(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	String getServiceName(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	double getServicePrice(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false"
	 * @generated
	 */
	double getServiceExpense(String serviceID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	boolean isRSODelivered(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getRSODeliveryDate(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	String getRSOBookable(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	List<String> getRSOItems(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	List<String> getRSOServices(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" isDeliveredDataType="org.eclipse.uml2.types.Boolean" isDeliveredRequired="true" isDeliveredOrdered="false"
	 * @generated
	 */
	void changeRSOISDelivered(String orderID, boolean isDelivered) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	void changeRSODeliveryDate(String orderID, LocalDateTime date) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomServiceMenuName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	List<String> getRoomServiceMenuItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void setRSOBill(String orderID, String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" orderIDDataType="org.eclipse.uml2.types.String" orderIDRequired="true" orderIDOrdered="false"
	 * @generated
	 */
	String getRSOBill(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemsDataType="org.eclipse.uml2.types.String" itemsMany="true" itemsOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesMany="true" servicesOrdered="false" billDataType="org.eclipse.uml2.types.String" billRequired="true" billOrdered="false" bookableDataType="org.eclipse.uml2.types.String" bookableRequired="true" bookableOrdered="false" deliveryDateRequired="true" deliveryDateOrdered="false" isDeliveredDataType="org.eclipse.uml2.types.Boolean" isDeliveredRequired="true" isDeliveredOrdered="false"
	 * @generated
	 */
	void makeRoomServiceOrder(List<String> items, List<String> services, String bill, String bookable, LocalDateTime deliveryDate, boolean isDelivered) throws InvalidIDException;

} // IServicesAccess
