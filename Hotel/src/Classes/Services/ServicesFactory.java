/**
 */
package Classes.Services;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
 class ServicesFactory implements Serializable {
	private static final long serialVersionUID = -4221591119508106627L;
	static ServicesFactory INSTANCE = new ServicesFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ServicesFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceMenu createRoomServiceMenu() {
		RoomServiceMenu roomServiceMenu = new RoomServiceMenu();
		return roomServiceMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		Service service = new Service();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceOrder createRoomServiceOrder() {
		RoomServiceOrder roomServiceOrder = new RoomServiceOrder();
		return roomServiceOrder;
	}
} //ServicesFactoryImpl
