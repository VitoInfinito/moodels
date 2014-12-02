/**
 */
package Classes.Services.util;

import Classes.Services.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Services.ServicesPackage
 * @generated
 */
public class ServicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicesSwitch<Adapter> modelSwitch =
		new ServicesSwitch<Adapter>() {
			@Override
			public Adapter caseRoomServiceMenu(RoomServiceMenu object) {
				return createRoomServiceMenuAdapter();
			}
			@Override
			public Adapter caseIServicesAccess(IServicesAccess object) {
				return createIServicesAccessAdapter();
			}
			@Override
			public Adapter caseServiceManager(ServiceManager object) {
				return createServiceManagerAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseRoomServiceOrder(RoomServiceOrder object) {
				return createRoomServiceOrderAdapter();
			}
			@Override
			public Adapter caseIServicesManage(IServicesManage object) {
				return createIServicesManageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.RoomServiceMenu <em>Room Service Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.RoomServiceMenu
	 * @generated
	 */
	public Adapter createRoomServiceMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.IServicesAccess <em>IServices Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.IServicesAccess
	 * @generated
	 */
	public Adapter createIServicesAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.ServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.ServiceManager
	 * @generated
	 */
	public Adapter createServiceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.RoomServiceOrder <em>Room Service Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.RoomServiceOrder
	 * @generated
	 */
	public Adapter createRoomServiceOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Services.IServicesManage <em>IServices Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Services.IServicesManage
	 * @generated
	 */
	public Adapter createIServicesManageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServicesAdapterFactory
