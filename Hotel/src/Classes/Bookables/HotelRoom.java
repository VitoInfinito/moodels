/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookables.HotelRoom#getCategory <em>Category</em>}</li>
 *   <li>{@link Classes.Bookables.HotelRoom#getNbrBeds <em>Nbr Beds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
class HotelRoom extends Room {

	private static final long serialVersionUID = -1582245312990038143L;
	
	private static final HotelRoomCategory CATEGORY_EDEFAULT = HotelRoomCategory.STANDARD_ROOM;
	private HotelRoomCategory category = CATEGORY_EDEFAULT;
	private int nbrBeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelRoom() {
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
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
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
		nbrBeds = newNbrBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", nbrBeds: ");
		result.append(nbrBeds);
		result.append(')');
		return result.toString();
	}

} //HotelRoomImpl
