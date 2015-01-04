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
	 * 		if there exists a service such that service.id == id
	 * 			the price of the service is set to price
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeServicePrice(String serviceID, double price) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		expense != null
	 * Ensures:
	 * 		if there exists a service such that service.id == id
	 * 			the expense of the service is set to expense
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeServiceExpense(String serviceID, double expense) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addRoomServiceMenuItem(String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeRoomServiceMenuItem(String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeRoomServiceMenuName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void addService(String name, double price, double expense);

} // IServicesManager