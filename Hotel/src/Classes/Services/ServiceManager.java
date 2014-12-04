/**
 */
package Classes.Services;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Services.ServiceManager#getService <em>Service</em>}</li>
 *   <li>{@link Classes.Services.ServiceManager#getRoomServiceOrder <em>Room Service Order</em>}</li>
 *   <li>{@link Classes.Services.ServiceManager#getRoomServiceMenu <em>Room Service Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Services.ServicesPackage#getServiceManager()
 * @model
 * @generated NOT
 */
public interface ServiceManager extends IServicesManage {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Services.Service},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' map.
	 * @see Classes.Services.ServicesPackage#getServiceManager_Service()
	 * @model mapType="Classes.ECoreMapEntries.StringToServiceMap<org.eclipse.uml2.types.String, Classes.Services.Service>" ordered="false"
	 * @generated
	 */
	EMap<String, Service> getService();

	/**
	 * Returns the value of the '<em><b>Room Service Order</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Services.RoomServiceOrder},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Service Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Service Order</em>' map.
	 * @see Classes.Services.ServicesPackage#getServiceManager_RoomServiceOrder()
	 * @model mapType="Classes.ECoreMapEntries.StringToRoomServiceOrderMap<org.eclipse.uml2.types.String, Classes.Services.RoomServiceOrder>" ordered="false"
	 * @generated
	 */
	EMap<String, RoomServiceOrder> getRoomServiceOrder();

	/**
	 * Returns the value of the '<em><b>Room Service Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Service Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Service Menu</em>' reference.
	 * @see #setRoomServiceMenu(RoomServiceMenu)
	 * @see Classes.Services.ServicesPackage#getServiceManager_RoomServiceMenu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomServiceMenu getRoomServiceMenu();

	/**
	 * Sets the value of the '{@link Classes.Services.ServiceManager#getRoomServiceMenu <em>Room Service Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Service Menu</em>' reference.
	 * @see #getRoomServiceMenu()
	 * @generated
	 */
	void setRoomServiceMenu(RoomServiceMenu value);

} // ServiceManager
