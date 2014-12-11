/**
 */
package Classes.Services;

import org.eclipse.jdt.annotation.NonNullByDefault;


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
public interface IServicesManage extends IServicesAccess {
	
	IServicesManage INSTANCE = Classes.Services.impl.ServiceManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeServiceName(String serviceID, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void changeServicePrice(String serviceID, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceIDDataType="org.eclipse.uml2.types.String" serviceIDRequired="true" serviceIDOrdered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	void changeServiceExpense(String serviceID, double expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addRoomServiceMenuItem(String itemID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeRoomServiceMenuItem(String itemID);

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

} // IServicesManage
