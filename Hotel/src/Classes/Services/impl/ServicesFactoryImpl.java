/**
 */
package Classes.Services.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Services.RoomServiceMenu;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServiceManager;
import Classes.Services.ServicesFactory;
import Classes.Services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesFactoryImpl extends EFactoryImpl implements ServicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicesFactory init() {
		try {
			ServicesFactory theServicesFactory = (ServicesFactory)EPackage.Registry.INSTANCE.getEFactory(ServicesPackage.eNS_URI);
			if (theServicesFactory != null) {
				return theServicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ServicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceMenu createRoomServiceMenu() {
		RoomServiceMenuImpl roomServiceMenu = new RoomServiceMenuImpl();
		return roomServiceMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceOrder createRoomServiceOrder() {
		RoomServiceOrderImpl roomServiceOrder = new RoomServiceOrderImpl();
		return roomServiceOrder;
	}
} //ServicesFactoryImpl
