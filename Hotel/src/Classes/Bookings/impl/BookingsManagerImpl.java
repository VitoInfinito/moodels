/**
 */
package Classes.Bookings.impl;

import Classes.Banking.CustomerProvides;
import Classes.Bills.IBills;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookings.Booking;
import Classes.Bookings.BookingsManager;
import Classes.Bookings.BookingsPackage;
import Classes.Customers.ICustomers;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToBookingMapImpl;
import Classes.Guests.IGuests;
import Classes.Stays.IStays;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getIBookableAccess <em>IBookable Access</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getIGuest <em>IGuest</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getICustomer <em>ICustomer</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingsManagerImpl#getIBills <em>IBills</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingsManagerImpl extends MinimalEObjectImpl.Container implements BookingsManager {
	private final Logger logger = LoggerFactory.getLogger(BookingsManagerImpl.class);
	public static BookingsManagerImpl INSTANCE = new BookingsManagerImpl();
	
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Booking> booking;

	/**
	 * The cached value of the '{@link #getIBookableAccess() <em>IBookable Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookableAccess()
	 * @generated
	 * @ordered
	 */
	protected IBookablesAccess iBookableAccess;

	/**
	 * The cached value of the '{@link #getIHotelStayManager() <em>IHotel Stay Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHotelStayManager()
	 * @generated
	 * @ordered
	 */
	protected IStays iHotelStayManager;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected CustomerProvides bank;

	/**
	 * The cached value of the '{@link #getIGuest() <em>IGuest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGuest()
	 * @generated
	 * @ordered
	 */
	protected IGuests iGuest;

	/**
	 * The cached value of the '{@link #getICustomer() <em>ICustomer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICustomer()
	 * @generated
	 * @ordered
	 */
	protected ICustomers iCustomer;

	/**
	 * The cached value of the '{@link #getIBills() <em>IBills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBills()
	 * @generated
	 * @ordered
	 */
	protected IBills iBills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BookingsManagerImpl() {
		super();
		booking = new EcoreEMap<String,Booking>(ECoreMapEntriesPackage.Literals.STRING_TO_BOOKING_MAP, StringToBookingMapImpl.class, this, BookingsPackage.BOOKINGS_MANAGER__BOOKING);
		iBookableAccess = IBookablesAccess.INSTANCE;
		iHotelStayManager = IStays.INSTANCE;
		// TODO fetch bank
		iGuest = IGuests.INSTANCE;
		iCustomer = ICustomers.INSTANCE;
		iBills = IBills.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingsPackage.Literals.BOOKINGS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Booking> getBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookablesAccess getIBookableAccess() {
		if (iBookableAccess != null && iBookableAccess.eIsProxy()) {
			InternalEObject oldIBookableAccess = (InternalEObject)iBookableAccess;
			iBookableAccess = (IBookablesAccess)eResolveProxy(oldIBookableAccess);
			if (iBookableAccess != oldIBookableAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS, oldIBookableAccess, iBookableAccess));
			}
		}
		return iBookableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookablesAccess basicGetIBookableAccess() {
		return iBookableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookableAccess(IBookablesAccess newIBookableAccess) {
		IBookablesAccess oldIBookableAccess = iBookableAccess;
		iBookableAccess = newIBookableAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS, oldIBookableAccess, iBookableAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStays getIHotelStayManager() {
		if (iHotelStayManager != null && iHotelStayManager.eIsProxy()) {
			InternalEObject oldIHotelStayManager = (InternalEObject)iHotelStayManager;
			iHotelStayManager = (IStays)eResolveProxy(oldIHotelStayManager);
			if (iHotelStayManager != oldIHotelStayManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
			}
		}
		return iHotelStayManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStays basicGetIHotelStayManager() {
		return iHotelStayManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIHotelStayManager(IStays newIHotelStayManager) {
		IStays oldIHotelStayManager = iHotelStayManager;
		iHotelStayManager = newIHotelStayManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (CustomerProvides)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(CustomerProvides newBank) {
		CustomerProvides oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__BANK, oldBank, bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGuests getIGuest() {
		if (iGuest != null && iGuest.eIsProxy()) {
			InternalEObject oldIGuest = (InternalEObject)iGuest;
			iGuest = (IGuests)eResolveProxy(oldIGuest);
			if (iGuest != oldIGuest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__IGUEST, oldIGuest, iGuest));
			}
		}
		return iGuest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGuests basicGetIGuest() {
		return iGuest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIGuest(IGuests newIGuest) {
		IGuests oldIGuest = iGuest;
		iGuest = newIGuest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__IGUEST, oldIGuest, iGuest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomers getICustomer() {
		if (iCustomer != null && iCustomer.eIsProxy()) {
			InternalEObject oldICustomer = (InternalEObject)iCustomer;
			iCustomer = (ICustomers)eResolveProxy(oldICustomer);
			if (iCustomer != oldICustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER, oldICustomer, iCustomer));
			}
		}
		return iCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomers basicGetICustomer() {
		return iCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setICustomer(ICustomers newICustomer) {
		ICustomers oldICustomer = iCustomer;
		iCustomer = newICustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER, oldICustomer, iCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills getIBills() {
		if (iBills != null && iBills.eIsProxy()) {
			InternalEObject oldIBills = (InternalEObject)iBills;
			iBills = (IBills)eResolveProxy(oldIBills);
			if (iBills != oldIBills) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKINGS_MANAGER__IBILLS, oldIBills, iBills));
			}
		}
		return iBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills basicGetIBills() {
		return iBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBills(IBills newIBills) {
		IBills oldIBills = iBills;
		iBills = newIBills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKINGS_MANAGER__IBILLS, oldIBills, iBills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeBooking(EList<String> bookables, String customerID, EList<String> guests, EList<String> requests, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookings(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBookedStaysOfBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerOfBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrGuestOfBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelStayOfBooking(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookedStayToBooking(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeNbrGuestsOfBooking(String bookingID, int nbrGuests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookingsWithinPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookingsWithStaysInPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookingsMadeInPeriod(String keyword, Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookingsWithStaysInPeriod(String keyword, Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableBookablesInPeriod(Date from, Date to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableBookablesInPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookingRequest(String bookingID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBookingRequest(String bookingID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBookingRequests(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBookingBills(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payStayBills(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableHotelRoomsInPeriod(Date from, Date to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableHostelBedsInPeriod(Date from, Date to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableConferenceRoomsInPeriod(Date from, Date to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableHotelRoomsInPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableConferenceRoomsInPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableHostelBedsInPeriod(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingsPackage.BOOKINGS_MANAGER__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingsPackage.BOOKINGS_MANAGER__BOOKING:
				if (coreType) return getBooking();
				else return getBooking().map();
			case BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS:
				if (resolve) return getIBookableAccess();
				return basicGetIBookableAccess();
			case BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER:
				if (resolve) return getIHotelStayManager();
				return basicGetIHotelStayManager();
			case BookingsPackage.BOOKINGS_MANAGER__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case BookingsPackage.BOOKINGS_MANAGER__IGUEST:
				if (resolve) return getIGuest();
				return basicGetIGuest();
			case BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER:
				if (resolve) return getICustomer();
				return basicGetICustomer();
			case BookingsPackage.BOOKINGS_MANAGER__IBILLS:
				if (resolve) return getIBills();
				return basicGetIBills();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingsPackage.BOOKINGS_MANAGER__BOOKING:
				((EStructuralFeature.Setting)getBooking()).set(newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS:
				setIBookableAccess((IBookablesAccess)newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__BANK:
				setBank((CustomerProvides)newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IGUEST:
				setIGuest((IGuests)newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER:
				setICustomer((ICustomers)newValue);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IBILLS:
				setIBills((IBills)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookingsPackage.BOOKINGS_MANAGER__BOOKING:
				getBooking().clear();
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS:
				setIBookableAccess((IBookablesAccess)null);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)null);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__BANK:
				setBank((CustomerProvides)null);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IGUEST:
				setIGuest((IGuests)null);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER:
				setICustomer((ICustomers)null);
				return;
			case BookingsPackage.BOOKINGS_MANAGER__IBILLS:
				setIBills((IBills)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookingsPackage.BOOKINGS_MANAGER__BOOKING:
				return booking != null && !booking.isEmpty();
			case BookingsPackage.BOOKINGS_MANAGER__IBOOKABLE_ACCESS:
				return iBookableAccess != null;
			case BookingsPackage.BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER:
				return iHotelStayManager != null;
			case BookingsPackage.BOOKINGS_MANAGER__BANK:
				return bank != null;
			case BookingsPackage.BOOKINGS_MANAGER__IGUEST:
				return iGuest != null;
			case BookingsPackage.BOOKINGS_MANAGER__ICUSTOMER:
				return iCustomer != null;
			case BookingsPackage.BOOKINGS_MANAGER__IBILLS:
				return iBills != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingsPackage.BOOKINGS_MANAGER___MAKE_BOOKING__ELIST_STRING_ELIST_ELIST_STRING_STRING_INT_INT_STRING_STRING:
				makeBooking((EList<String>)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Integer)arguments.get(7), (String)arguments.get(8), (String)arguments.get(9));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_BOOKINGS__STRING:
				return searchBookings((String)arguments.get(0));
			case BookingsPackage.BOOKINGS_MANAGER___GET_BOOKED_STAYS_OF_BOOKING__STRING:
				return getBookedStaysOfBooking((String)arguments.get(0));
			case BookingsPackage.BOOKINGS_MANAGER___GET_CUSTOMER_OF_BOOKING__STRING:
				return getCustomerOfBooking((String)arguments.get(0));
			case BookingsPackage.BOOKINGS_MANAGER___GET_NBR_GUEST_OF_BOOKING__STRING:
				return getNbrGuestOfBooking((String)arguments.get(0));
			case BookingsPackage.BOOKINGS_MANAGER___CANCEL_BOOKING__STRING:
				cancelBooking((String)arguments.get(0));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___CANCEL_STAY_OF_BOOKING__STRING_STRING:
				cancelStayOfBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___ADD_BOOKED_STAY_TO_BOOKING__STRING_STRING:
				addBookedStayToBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___CHANGE_NBR_GUESTS_OF_BOOKING__STRING_INT:
				changeNbrGuestsOfBooking((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___GET_ALL_BOOKINGS:
				return getAllBookings();
			case BookingsPackage.BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITHIN_PERIOD__DATE_DATE:
				return getAllBookingsWithinPeriod((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingsPackage.BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD__DATE_DATE:
				return getAllBookingsWithStaysInPeriod((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_BOOKINGS_MADE_IN_PERIOD__STRING_DATE_DATE:
				return searchBookingsMadeInPeriod((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD__STRING_DATE_DATE:
				return searchBookingsWithStaysInPeriod((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE_STRING:
				return searchForAvailableBookablesInPeriod((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___GET_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE:
				return getAvailableBookablesInPeriod((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingsPackage.BOOKINGS_MANAGER___ADD_BOOKING_REQUEST__STRING_STRING:
				addBookingRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___REMOVE_BOOKING_REQUEST__STRING_STRING:
				removeBookingRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___GET_BOOKING_REQUESTS__STRING:
				return getBookingRequests((String)arguments.get(0));
			case BookingsPackage.BOOKINGS_MANAGER___PAY_BOOKING_BILLS__STRING:
				payBookingBills((String)arguments.get(0));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___PAY_STAY_BILLS__STRING_STRING:
				payStayBills((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE_STRING:
				return searchForAvailableHotelRoomsInPeriod((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE_STRING:
				return searchForAvailableHostelBedsInPeriod((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE_STRING:
				return searchForAvailableConferenceRoomsInPeriod((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case BookingsPackage.BOOKINGS_MANAGER___GET_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE:
				return getAvailableHotelRoomsInPeriod((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingsPackage.BOOKINGS_MANAGER___GET_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE:
				return getAvailableConferenceRoomsInPeriod((Date)arguments.get(0), (Date)arguments.get(1));
			case BookingsPackage.BOOKINGS_MANAGER___GET_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE:
				return getAvailableHostelBedsInPeriod((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingsManagerImpl
