/**
 */
package Classes.Restaurants;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;



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
@NonNullByDefault
public interface IRestaurantsManage extends IRestaurantsAccess {
	
	IRestaurantsManage INSTANCE = Classes.Restaurants.RestaurantsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null
	 * Ensures:
	 * 		if there exists a restaurant rest such that rest.getName() == name
	 * 			InvalidIDException is thrown
	 * 		otherwise
	 * 			the restaurant is added
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void addRestaurant(String name) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		name != null
	 * Ensures:
	 * 		if the restaurant with the restaurantID is not found
	 * 			InvalidIDException is thrown
	 * 		otherwise
	 * 			the restaurant is removed
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated
	 */
	void removeRestaurant(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && nbrSeats != null && tableNbr != null
	 * Ensures:
	 * 		that a restaurant table is added
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nbrSeatsDataType="org.eclipse.uml2.types.Integer" nbrSeatsRequired="true" nbrSeatsOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	void addRestaurantTable(String restaurantID, int nbrSeats, String tableNbr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && tableNbr != null
	 * Ensures:
	 * 		that a restaurant table is removed
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	void removeRestaurantTable(String restaurantID, String tableNbr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeRestaurantName(String restaurantID, String name) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false" nbrSeatsDataType="org.eclipse.uml2.types.Integer" nbrSeatsRequired="true" nbrSeatsOrdered="false"
	 * @generated
	 */
	void changeTableNumberOfSeats(String restaurantID, String tableNbr, int nbrSeats) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void addMenuItem(String restaurantID, String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" itemIDDataType="org.eclipse.uml2.types.String" itemIDRequired="true" itemIDOrdered="false"
	 * @generated
	 */
	void removeMenuItem(String restaurantID, String itemID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void changeMenuName(String restaurantID, String name) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" oldTableNbrDataType="org.eclipse.uml2.types.String" oldTableNbrRequired="true" oldTableNbrOrdered="false" newTableNbrDataType="org.eclipse.uml2.types.String" newTableNbrRequired="true" newTableNbrOrdered="false"
	 * @generated
	 */
	void changeTableNumber(String restaurantID, String oldTableNbr, String newTableNbr) throws InvalidIDException;

} // IRestaurantsManage
