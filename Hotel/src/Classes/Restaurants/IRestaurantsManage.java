/**
 */
package Classes.Restaurants;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRestaurants Manage</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Restaurants.RestaurantsPackage#getIRestaurantsManage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRestaurantsManage extends IRestaurantsAccess {
	
	IRestaurantsManage INSTANCE = Classes.Restaurants.impl.RestaurantsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void addRestaurant(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated
	 */
	void removeRestaurant(String restaurantID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nbrSeatsDataType="org.eclipse.uml2.types.Integer" nbrSeatsRequired="true" nbrSeatsOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	void addRestaurantTable(String restaurantID, int nbrSeats, String tableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	void removeRestaurantTable(String restaurantID, String tableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeRestaurantName(String restaurantID, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false" nbrSeatsDataType="org.eclipse.uml2.types.Integer" nbrSeatsRequired="true" nbrSeatsOrdered="false"
	 * @generated
	 */
	void changeTableNumberOfSeats(String restaurantID, String tableNbr, int nbrSeats);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addMenuItem(String restaurantID, String itemID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeMenuItem(String restaurantID, String itemID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeMenuName(String restaurantID, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" oldTableNbrDataType="org.eclipse.uml2.types.String" oldTableNbrRequired="true" oldTableNbrOrdered="false" newTableNbrDataType="org.eclipse.uml2.types.String" newTableNbrRequired="true" newTableNbrOrdered="false"
	 * @generated
	 */
	void changeTableNumber(String restaurantID, String oldTableNbr, String newTableNbr);

} // IRestaurantsManage
