/**
 */
package Classes.Services;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Services.ServicesPackage
 * @generated
 */
public interface ServicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesFactory eINSTANCE = Classes.Services.impl.ServicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Service Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Service Menu</em>'.
	 * @generated
	 */
	RoomServiceMenu createRoomServiceMenu();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	ServiceManager createServiceManager();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Room Service Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Service Order</em>'.
	 * @generated
	 */
	RoomServiceOrder createRoomServiceOrder();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	ServicesPackage getServicesPackage();

} //ServicesFactory
