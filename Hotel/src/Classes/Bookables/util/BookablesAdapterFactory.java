/**
 */
package Classes.Bookables.util;

import Classes.Bookables.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage
 * @generated
 */
public class BookablesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookablesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookablesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BookablesPackage.eINSTANCE;
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
	protected BookablesSwitch<Adapter> modelSwitch =
		new BookablesSwitch<Adapter>() {
			@Override
			public Adapter caseBookable(Bookable object) {
				return createBookableAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseRoomLocation(RoomLocation object) {
				return createRoomLocationAdapter();
			}
			@Override
			public Adapter caseHostelBed(HostelBed object) {
				return createHostelBedAdapter();
			}
			@Override
			public Adapter caseHotelRoom(HotelRoom object) {
				return createHotelRoomAdapter();
			}
			@Override
			public Adapter caseConferenceRoom(ConferenceRoom object) {
				return createConferenceRoomAdapter();
			}
			@Override
			public Adapter caseIBookablesManage(IBookablesManage object) {
				return createIBookablesManageAdapter();
			}
			@Override
			public Adapter caseIBookablesAccess(IBookablesAccess object) {
				return createIBookablesAccessAdapter();
			}
			@Override
			public Adapter caseBookablesManager(BookablesManager object) {
				return createBookablesManagerAdapter();
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
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.Bookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.Bookable
	 * @generated
	 */
	public Adapter createBookableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.RoomLocation <em>Room Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.RoomLocation
	 * @generated
	 */
	public Adapter createRoomLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.HostelBed <em>Hostel Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.HostelBed
	 * @generated
	 */
	public Adapter createHostelBedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.ConferenceRoom
	 * @generated
	 */
	public Adapter createConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.HotelRoom <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.HotelRoom
	 * @generated
	 */
	public Adapter createHotelRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.IBookablesManage <em>IBookables Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.IBookablesManage
	 * @generated
	 */
	public Adapter createIBookablesManageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.IBookablesAccess <em>IBookables Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.IBookablesAccess
	 * @generated
	 */
	public Adapter createIBookablesAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Bookables.BookablesManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Bookables.BookablesManager
	 * @generated
	 */
	public Adapter createBookablesManagerAdapter() {
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

} //BookablesAdapterFactory
