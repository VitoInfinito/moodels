/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Bookables.BookablesPackage;
import Classes.Bookables.RoomLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookables.impl.RoomLocationImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link Classes.Bookables.impl.RoomLocationImpl#getAddtionalInfo <em>Addtional Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomLocationImpl extends MinimalEObjectImpl.Container implements RoomLocation {
	/**
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected int floor = FLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddtionalInfo() <em>Addtional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddtionalInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDTIONAL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddtionalInfo() <em>Addtional Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddtionalInfo()
	 * @generated
	 * @ordered
	 */
	protected String addtionalInfo = ADDTIONAL_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookablesPackage.Literals.ROOM_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		int oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.ROOM_LOCATION__FLOOR, oldFloor, floor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddtionalInfo() {
		return addtionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddtionalInfo(String newAddtionalInfo) {
		String oldAddtionalInfo = addtionalInfo;
		addtionalInfo = newAddtionalInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO, oldAddtionalInfo, addtionalInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookablesPackage.ROOM_LOCATION__FLOOR:
				return getFloor();
			case BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO:
				return getAddtionalInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookablesPackage.ROOM_LOCATION__FLOOR:
				setFloor((Integer)newValue);
				return;
			case BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO:
				setAddtionalInfo((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookablesPackage.ROOM_LOCATION__FLOOR:
				setFloor(FLOOR_EDEFAULT);
				return;
			case BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO:
				setAddtionalInfo(ADDTIONAL_INFO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookablesPackage.ROOM_LOCATION__FLOOR:
				return floor != FLOOR_EDEFAULT;
			case BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO:
				return ADDTIONAL_INFO_EDEFAULT == null ? addtionalInfo != null : !ADDTIONAL_INFO_EDEFAULT.equals(addtionalInfo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floor: ");
		result.append(floor);
		result.append(", addtionalInfo: ");
		result.append(addtionalInfo);
		result.append(')');
		return result.toString();
	}

} //RoomLocationImpl
