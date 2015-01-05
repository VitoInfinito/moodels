/**
 */
package Classes.Services;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IServices Manage</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Services.ServicesPackage#getIServicesManage()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IServicesManager extends IServicesAccess {
	
	IServicesManager INSTANCE = Classes.Services.ServiceManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		name != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the name of the service is set to name
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeServiceName(String serviceID, String name) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		price != null
	 * Ensures:
	 * 		if price is 0 or higher
	 * 			if there exists a service such that service.id == id
	 * 				the price of the service is set to price
	 * 			otherwise
	 * 				InvalidIDException is thrown
	 * 		otherwise
	 * 			IllegalArgumentException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeServicePrice(String serviceID, double price) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		expense != null
	 * Ensures:
	 * 		if expense is 0 or higher
	 * 			if there exists a service such that service.id == id
	 * 				the expense of the service is set to expense
	 * 			otherwise
	 * 				InvalidIDException is thrown
	 * 		otherwise
	 * 			IllegalArgumentException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeServiceExpense(String serviceID, double expense) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there doesn't exists a room service item such that item.id == id
	 * 			the item with id ID is added to the room service menu
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addRoomServiceMenuItem(String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service item such that item.id == id
	 * 			the item with id ID is removed to the room service menu
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeRoomServiceMenuItem(String itemID) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the service with id ID is removed
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeService(String serviceID) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a room service order such that service.id == id
	 * 			the room service order with id ID is removed
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeRoomServiceOrder(String orderID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		That the room service menu is renamed to NAME
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeRoomServiceMenuName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		name != null
	 * 		price != null
	 * 		expense != null
	 * Ensures:
	 * 		if price and expense are 0 or higher
	 * 			a service with the name NAME are added
	 * 		otherwise
	 * 			IllegalArgumentException is thrown
	 * <!-- end-user-doc -->
	 * @return 
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	String addService(String name, double price, double expense) throws IllegalArgumentException;

} // IServicesManager
