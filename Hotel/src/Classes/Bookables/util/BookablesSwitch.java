/**
 */
package Classes.Bookables.util;

import Classes.Bookables.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage
 * @generated
 */
public class BookablesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookablesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookablesSwitch() {
		if (modelPackage == null) {
			modelPackage = BookablesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BookablesPackage.BOOKABLE: {
				Bookable bookable = (Bookable)theEObject;
				T result = caseBookable(bookable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseBookable(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.ROOM_LOCATION: {
				RoomLocation roomLocation = (RoomLocation)theEObject;
				T result = caseRoomLocation(roomLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.HOSTEL_BED: {
				HostelBed hostelBed = (HostelBed)theEObject;
				T result = caseHostelBed(hostelBed);
				if (result == null) result = caseBookable(hostelBed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.HOTEL_ROOM: {
				HotelRoom hotelRoom = (HotelRoom)theEObject;
				T result = caseHotelRoom(hotelRoom);
				if (result == null) result = caseRoom(hotelRoom);
				if (result == null) result = caseBookable(hotelRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.CONFERENCE_ROOM: {
				ConferenceRoom conferenceRoom = (ConferenceRoom)theEObject;
				T result = caseConferenceRoom(conferenceRoom);
				if (result == null) result = caseRoom(conferenceRoom);
				if (result == null) result = caseBookable(conferenceRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.IBOOKABLES_MANAGE: {
				IBookablesManage iBookablesManage = (IBookablesManage)theEObject;
				T result = caseIBookablesManage(iBookablesManage);
				if (result == null) result = caseIBookablesAccess(iBookablesManage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.IBOOKABLES_ACCESS: {
				IBookablesAccess iBookablesAccess = (IBookablesAccess)theEObject;
				T result = caseIBookablesAccess(iBookablesAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookablesPackage.BOOKABLES_MANAGER: {
				BookablesManager bookablesManager = (BookablesManager)theEObject;
				T result = caseBookablesManager(bookablesManager);
				if (result == null) result = caseIBookablesManage(bookablesManager);
				if (result == null) result = caseIBookablesAccess(bookablesManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookable(Bookable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomLocation(RoomLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostel Bed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostel Bed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostelBed(HostelBed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConferenceRoom(ConferenceRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelRoom(HotelRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBookables Manage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBookables Manage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookablesManage(IBookablesManage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBookables Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBookables Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookablesAccess(IBookablesAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookablesManager(BookablesManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BookablesSwitch
