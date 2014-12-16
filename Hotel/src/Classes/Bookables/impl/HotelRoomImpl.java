/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
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
	private static final HotelRoomCategory CATEGORY_EDEFAULT = HotelRoomCategory.STANDARD_ROOM;
	private HotelRoomCategory category = CATEGORY_EDEFAULT;
	private int nbrBeds;

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
