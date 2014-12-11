/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Classes.Bookables.BookablesPackage;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookables.impl.HotelRoomImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Classes.Bookables.impl.HotelRoomImpl#getNbrBeds <em>Nbr Beds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HotelRoomImpl extends RoomImpl implements HotelRoom {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final HotelRoomCategory CATEGORY_EDEFAULT = HotelRoomCategory.STANDARD_ROOM;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected HotelRoomCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbrBeds() <em>Nbr Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrBeds() <em>Nbr Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrBeds()
	 * @generated
	 * @ordered
	 */
	protected int nbrBeds = NBR_BEDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookablesPackage.Literals.HOTEL_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoomCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(HotelRoomCategory newCategory) {
		HotelRoomCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.HOTEL_ROOM__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrBeds() {
		return nbrBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrBeds(int newNbrBeds) {
		int oldNbrBeds = nbrBeds;
		nbrBeds = newNbrBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.HOTEL_ROOM__NBR_BEDS, oldNbrBeds, nbrBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookablesPackage.HOTEL_ROOM__CATEGORY:
				return getCategory();
			case BookablesPackage.HOTEL_ROOM__NBR_BEDS:
				return getNbrBeds();
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
			case BookablesPackage.HOTEL_ROOM__CATEGORY:
				setCategory((HotelRoomCategory)newValue);
				return;
			case BookablesPackage.HOTEL_ROOM__NBR_BEDS:
				setNbrBeds((Integer)newValue);
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
			case BookablesPackage.HOTEL_ROOM__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BookablesPackage.HOTEL_ROOM__NBR_BEDS:
				setNbrBeds(NBR_BEDS_EDEFAULT);
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
			case BookablesPackage.HOTEL_ROOM__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case BookablesPackage.HOTEL_ROOM__NBR_BEDS:
				return nbrBeds != NBR_BEDS_EDEFAULT;
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
		result.append(" (category: ");
		result.append(category);
		result.append(", nbrBeds: ");
		result.append(nbrBeds);
		result.append(')');
		return result.toString();
	}

} //HotelRoomImpl
