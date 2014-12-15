/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Classes.Bookables.BookablesPackage;
import Classes.Bookables.HostelBed;
import Classes.Bookables.HotelRoom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostel Bed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HostelBedImpl extends BookableImpl implements HostelBed {
	private HotelRoom room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostelBedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookablesPackage.Literals.HOSTEL_BED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoom getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (HotelRoom)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookablesPackage.HOSTEL_BED__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoom basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(HotelRoom newRoom) {
		HotelRoom oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.HOSTEL_BED__ROOM, oldRoom, room));
	}
} //HostelBedImpl
