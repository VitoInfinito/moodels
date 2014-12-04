/**
 */
package Classes.Bookables.impl;

import Classes.InvalidIDException;
import Classes.RegexPatterns;
import Classes.Bookables.Bookable;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;
import Classes.Bookables.ConferenceRoom;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HostelBed;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.Room;
import Classes.Bookables.RoomLocation;
import Classes.Stays.IStays;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
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
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getBookables <em>Bookables</em>}</li>
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookablesManagerImpl extends MinimalEObjectImpl.Container implements BookablesManager {
	
	private final Logger logger = LoggerFactory.getLogger(BookablesManagerImpl.class);

	/**
	 * The cached value of the '{@link #getBookables() <em>Bookables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookables()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Bookable> bookables;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BookablesManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookablesPackage.Literals.BOOKABLES_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Bookable> getBookables() {
		if (bookables == null) {
			bookables = new EcoreEMap<String,Bookable>(Classes.ECoreMapEntries.ECoreMapEntriesPackage.Literals.STRING_TO_BOOKABLE_MAP, Classes.ECoreMapEntries.impl.StringToBookableMapImpl.class, this, BookablesPackage.BOOKABLES_MANAGER__BOOKABLES);
		}
		return bookables;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getBookableBasePrice(String bookableID) throws InvalidIDException {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found.", bookableID);
			throw new InvalidIDException();
		}
		return bookable.getBaseprice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomLocationInfo(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof Room)) {
			throw new InvalidIDException();
		}
		return ((Room)bookable).getLocation().getAddtionalInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getBookableDescription(String bookableID) throws InvalidIDException {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		return bookable.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBookableIDs() {
		return new ArrayList<String>(bookables.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomOfHostelBed(String hostelBedID) throws InvalidIDException {
		Bookable bookable = bookables.get(hostelBedID);
		if (bookable == null || !(bookable instanceof HostelBed)) {
			throw new InvalidIDException();
		}
		return ((HostelBed)bookable).getRoom().getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HotelRoomCategory getHotelRoomCategory(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		return ((HotelRoom)bookable).getCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getConferenceRoomCapacity(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof ConferenceRoom)) {
			throw new InvalidIDException();
		}
		return ((ConferenceRoom)bookable).getCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getHotelRoomNbrBeds(String ID) throws InvalidIDException {
		Bookable bookable = bookables.get(ID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		return ((HotelRoom)bookable).getNbrBeds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchForBookable(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable != null) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		for (Bookable b : c) {	
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			}
		}

		// Some property match exactly. Third Order!
		for (Bookable b : c) {
			if (b.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == b.getBaseprice())) {
				searchResult.add(b.getId());
			} else if (b instanceof Room) {
				Room r = (Room)b;
				RoomLocation l = r.getLocation();
				if ((keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == l.getFloor()) || keyword.equalsIgnoreCase(l.getAddtionalInfo())){ 
					searchResult.add(r.getId());
				} else if (b instanceof HotelRoom) {
					HotelRoom hr = (HotelRoom)b;
					if (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == hr.getNbrBeds()) {
						searchResult.add(hr.getId());
					}
				} else if (b instanceof ConferenceRoom) {
					ConferenceRoom cr = (ConferenceRoom)b;
					if (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == cr.getCapacity()) {
						searchResult.add(cr.getId());
					}
				}
			} else if (b instanceof HostelBed) {
				HostelBed h = (HostelBed)b;
				if (keyword.equalsIgnoreCase(h.getRoom().getId()))
					searchResult.add(h.getId());
			}
		}

		// Some property match somewhat. Fourth Order.
		for (Bookable b : c) {
			if (regexPattern.matcher(b.getDescription()).matches()) {
				searchResult.add(b.getId());
			} else if (b instanceof Room) {
				Room r = (Room)b;
				RoomLocation l = r.getLocation();
				if (regexPattern.matcher(l.getAddtionalInfo()).matches()){ 
					searchResult.add(r.getId());
				} 
			} else if (b instanceof HostelBed) {
				HostelBed h = (HostelBed)b;
				if (regexPattern.matcher(h.getRoom().getId()).matches())
					searchResult.add(h.getId());
			}
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRoomLocationFloor(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof Room)) {
			throw new InvalidIDException();
		}
		return ((Room)bookable).getLocation().getFloor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllHotelRoomIDs() {
		Collection<Bookable> c = bookables.values();
		List<String> result = new ArrayList<String>();
		for (Bookable b : c) {
			if (b instanceof HotelRoom) {
				result.add(b.getId());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllConferenceRoomIDs() {
		Collection<Bookable> c = bookables.values();
		List<String> result = new ArrayList<String>();
		for (Bookable b : c) {
			if (b instanceof ConferenceRoom) {
				result.add(b.getId());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllHostelBedIDs() {
		Collection<Bookable> c = bookables.values();
		List<String> result = new ArrayList<String>();
		for (Bookable b : c) {
			if (b instanceof HostelBed) {
				result.add(b.getId());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConferenceRoomCategory getConferenceRoomCategory(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof ConferenceRoom)) {
			throw new InvalidIDException();
		}
		return ((ConferenceRoom)bookable).getCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOTE: category == null implies that all categories are searched.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchHotelRooms(String keyword, HotelRoomCategory category) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable instanceof HotelRoom && (((HotelRoom)bookable).getCategory() == category) || category == null) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		List<HotelRoom> rooms = new ArrayList<HotelRoom>();
		for (Bookable b : c) {			
			if (b instanceof HotelRoom && (((HotelRoom)bookable).getCategory() == category) || category == null) {
				if (regexPattern.matcher(b.getId()).matches()) {
					searchResult.add(b.getId());
				} else {
					rooms.add((HotelRoom)b);
				}
			}
		}

		// Some property match exactly. Third Order!
		for (HotelRoom room : rooms) {
			RoomLocation location = room.getLocation();
			if (room.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == room.getBaseprice())) {
				searchResult.add(room.getId());
			} else if ((keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == location.getFloor()) || keyword.equalsIgnoreCase(location.getAddtionalInfo())){
				searchResult.add(room.getId());
			} else if (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == room.getNbrBeds()) {
				searchResult.add(room.getId());
			}
		}

		// Some property match somewhat. Fourth Order.
		for (HotelRoom room : rooms) {
			RoomLocation location = room.getLocation();
			if (regexPattern.matcher(room.getDescription()).matches()) {
				searchResult.add(room.getId());
			} else if (regexPattern.matcher(location.getAddtionalInfo()).matches()){
				searchResult.add(room.getId());
			} 
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchHostelBeds(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable instanceof HostelBed) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		List<HostelBed> beds = new ArrayList<HostelBed>();
		for (Bookable b : c) {			
			if (b instanceof HostelBed) {
				if (regexPattern.matcher(b.getId()).matches()) {
					searchResult.add(b.getId());
				} else {
					beds.add((HostelBed)b);
				}
			}
		}

		// Some property match exactly. Third Order!
		for (HostelBed bed : beds) {
			if (bed.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == bed.getBaseprice())) {
				searchResult.add(bed.getId());
			} else if (bed.getRoom().getId().equalsIgnoreCase(keyword)) {
				searchResult.add(bed.getId());
			}
		}

		// Some property match somewhat. Fourth Order.
		for (HostelBed bed : beds) {
			if (regexPattern.matcher(bed.getDescription()).matches()) {
				searchResult.add(bed.getId());
			} else if (regexPattern.matcher(bed.getRoom().getId()).matches()) {
				searchResult.add(bed.getId());
			} 
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOTE: category == null implies that all categories are searched.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchConferenceRooms(String keyword, ConferenceRoomCategory category) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable instanceof ConferenceRoom && (((ConferenceRoom)bookable).getCategory() == category) || category == null) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		List<ConferenceRoom> rooms = new ArrayList<ConferenceRoom>();
		for (Bookable b : c) {			
			if (b instanceof ConferenceRoom && (((ConferenceRoom)bookable).getCategory() == category) || category == null) {
				if (regexPattern.matcher(b.getId()).matches()) {
					searchResult.add(b.getId());
				} else {
					rooms.add((ConferenceRoom)b);
				}
			}
		}

		// Some property match exactly. Third Order!
		for (ConferenceRoom room : rooms) {
			RoomLocation location = room.getLocation();
			if (room.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == room.getBaseprice())) {
				searchResult.add(room.getId());
			} else if ((keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == location.getFloor()) || keyword.equalsIgnoreCase(location.getAddtionalInfo())){
				searchResult.add(room.getId());
			} else if (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.valueOf(keyword) == room.getCapacity()) {
				searchResult.add(room.getId());
			}
		}

		// Some property match somewhat. Fourth Order.
		for (ConferenceRoom room : rooms) {
			RoomLocation location = room.getLocation();
			if (regexPattern.matcher(room.getDescription()).matches()) {
				searchResult.add(room.getId());
			} else if (regexPattern.matcher(location.getAddtionalInfo()).matches()){
				searchResult.add(room.getId());
			} 
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeHostelBedRoom(String hostelBedID, String roomID) throws InvalidIDException  {
		Bookable hostelBed = bookables.get(hostelBedID);
		Bookable room = bookables.get(roomID);
		if (hostelBed == null || room == null || !(hostelBed instanceof HostelBed) || !(room instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		((HostelBed)hostelBed).setRoom((HotelRoom)room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteBookable(String bookableID) throws InvalidIDException {
		Bookable bookable = bookables.removeKey(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		// TODO might need to notify so that stays in this bookable get another bookable. (maybe EMap does this though)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRoomLocation(String roomID, int floor, String additionalInfo) throws InvalidIDException {
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof Room)) {
			throw new InvalidIDException();
		}
		RoomLocation loc = ((Room)room).getLocation();
		loc.setFloor(floor);
		loc.setAddtionalInfo(additionalInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeHotelRoomCategory(String roomID, HotelRoomCategory category) throws InvalidIDException {
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		((HotelRoom)room).setCategory(category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeConferenceRoomCategory(String roomID, ConferenceRoomCategory category) throws InvalidIDException {
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof ConferenceRoom)) {
			throw new InvalidIDException();
		}
		((ConferenceRoom)room).setCategory(category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeBookableBasePrice(String bookableID, double basePrice) throws InvalidIDException  {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		bookable.setBaseprice(basePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeBookableDescription(String bookableID, String description) throws InvalidIDException  {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		bookable.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String addHotelRoom(double basePrice, String description, int floor, String locationInfo, HotelRoomCategory category, int nbrBeds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String addHostelBed(double basePrice, String description, String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String addConferenceRoom(double basePrice, String description, int floor, String locationInfo, ConferenceRoomCategory category, int capacity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeHotelRoomNumberBeds(String roomID, int nbrBeds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeConferenceRoomCapacity(String roomID, int capacity) {
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
				return ((InternalEList<?>)getBookables()).basicRemove(otherEnd, msgs);
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
				if (coreType) return getBookables();
				else return getBookables().map();
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				if (resolve) return getIHotelStayManager();
				return basicGetIHotelStayManager();
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
				((EStructuralFeature.Setting)getBookables()).set(newValue);
				return;
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)newValue);
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
				getBookables().clear();
				return;
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)null);
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
				return bookables != null && !bookables.isEmpty();
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				return iHotelStayManager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_BASE_PRICE__STRING:
				return getBookableBasePrice((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO__STRING:
				return getRoomLocationInfo((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION__STRING:
				return getBookableDescription((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_BOOKABLE_IDS:
				return getAllBookableIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED__STRING:
				return getRoomOfHostelBed((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_CATEGORY__STRING:
				return getHotelRoomCategory((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CAPACITY__STRING:
				return getConferenceRoomCapacity((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_NBR_BEDS__STRING:
				return getHotelRoomNbrBeds((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_FOR_BOOKABLE__STRING:
				return searchForBookable((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_FLOOR__STRING:
				return getRoomLocationFloor((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_HOTEL_ROOM_IDS:
				return getAllHotelRoomIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_CONFERENCE_ROOM_IDS:
				return getAllConferenceRoomIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_HOSTEL_BED_IDS:
				return getAllHostelBedIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CATEGORY__STRING:
				return getConferenceRoomCategory((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY:
				return searchHotelRooms((String)arguments.get(0), (HotelRoomCategory)arguments.get(1));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_HOSTEL_BEDS__STRING:
				return searchHostelBeds((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY:
				return searchConferenceRooms((String)arguments.get(0), (ConferenceRoomCategory)arguments.get(1));
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_HOSTEL_BED_ROOM__STRING_STRING:
				changeHostelBedRoom((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___DELETE_BOOKABLE__STRING:
				deleteBookable((String)arguments.get(0));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_ROOM_LOCATION__STRING_INT_STRING:
				changeRoomLocation((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY:
				changeHotelRoomCategory((String)arguments.get(0), (HotelRoomCategory)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY:
				changeConferenceRoomCategory((String)arguments.get(0), (ConferenceRoomCategory)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE:
				changeBookableBasePrice((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING:
				changeBookableDescription((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___ADD_HOTEL_ROOM__DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT:
				return addHotelRoom((Double)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (HotelRoomCategory)arguments.get(4), (Integer)arguments.get(5));
			case BookablesPackage.BOOKABLES_MANAGER___ADD_HOSTEL_BED__DOUBLE_STRING_STRING:
				return addHostelBed((Double)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case BookablesPackage.BOOKABLES_MANAGER___ADD_CONFERENCE_ROOM__DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT:
				return addConferenceRoom((Double)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (ConferenceRoomCategory)arguments.get(4), (Integer)arguments.get(5));
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT:
				changeHotelRoomNumberBeds((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT:
				changeConferenceRoomCapacity((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookablesManagerImpl
