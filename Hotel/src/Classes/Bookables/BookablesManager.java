/**
 */
package Classes.Bookables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;
import Classes.Utils.StringUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class BookablesManager implements IBookablesManage {

	private static final long serialVersionUID = -108853942872272730L;
	
	private final Logger logger = LoggerFactory.getLogger(BookablesManager.class);
	public static BookablesManager INSTANCE = new BookablesManager();

	private HashMap<String, Bookable> bookables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BookablesManager() {
		super();
		bookables = new HashMap<String,Bookable>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getBookableBasePrice(String bookableID) throws InvalidIDException{
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
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
			logger.warn("The hostelbed with ID {} could not be found. Invalid ID!", hostelBedID);
			throw new InvalidIDException();
		}
		return ((HostelBed)bookable).getRoom().getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HotelRoomCategory getHotelRoomCategory(String roomID) throws InvalidIDException{
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		}
		return ((ConferenceRoom)bookable).getCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getHotelRoomNbrBeds(String roomID) throws InvalidIDException{
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			if (b.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == b.getBaseprice())) {
				searchResult.add(b.getId());
			} else if (b instanceof Room) {
				Room r = (Room)b;
				RoomLocation l = r.getLocation();
				if ((keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == l.getFloor()) || keyword.equalsIgnoreCase(l.getAddtionalInfo())){ 
					searchResult.add(r.getId());
				} else if (b instanceof HotelRoom) {
					HotelRoom hr = (HotelRoom)b;
					if (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == hr.getNbrBeds()) {
						searchResult.add(hr.getId());
					}
				} else if (b instanceof ConferenceRoom) {
					ConferenceRoom cr = (ConferenceRoom)b;
					if (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == cr.getCapacity()) {
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
	public List<String> searchHotelRooms(String keyword, @Nullable HotelRoomCategory category)  {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable instanceof HotelRoom && (((HotelRoom)bookable).getCategory() == category || category == null)) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		List<HotelRoom> rooms = new ArrayList<HotelRoom>();
		for (Bookable b : c) {			
			if (b instanceof HotelRoom && (((HotelRoom)b).getCategory() == category || category == null)) {
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
			if (room.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == room.getBaseprice())) {
				searchResult.add(room.getId());
			} else if ((keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == location.getFloor()) || keyword.equalsIgnoreCase(location.getAddtionalInfo())){
				searchResult.add(room.getId());
			} else if (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == room.getNbrBeds()) {
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
	public List<String> searchHostelBeds(String keyword)  {
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
			if (bed.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == bed.getBaseprice())) {
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
	public List<String> searchConferenceRooms(String keyword, @Nullable ConferenceRoomCategory category) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		Bookable bookable = bookables.get(keyword);
		if (bookable instanceof ConferenceRoom && (((ConferenceRoom)bookable).getCategory() == category || category == null)) {
			searchResult.add(bookable.getId());
			//return new ArrayList<String>(searchResult);
		}

		// ID match somewhat. Second Order!
		Collection<Bookable> c = bookables.values();
		List<ConferenceRoom> rooms = new ArrayList<ConferenceRoom>();
		for (Bookable b : c) {			
			if (b instanceof ConferenceRoom && (((ConferenceRoom)b).getCategory() == category || category == null)) {
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
			if (room.getDescription().equalsIgnoreCase(keyword) || (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == room.getBaseprice())) {
				searchResult.add(room.getId());
			} else if ((keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == location.getFloor()) || keyword.equalsIgnoreCase(location.getAddtionalInfo())){
				searchResult.add(room.getId());
			} else if (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == room.getCapacity()) {
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
	public void changeHostelBedRoom(String hostelBedID, String roomID) throws InvalidIDException {
		Bookable hostelBed = bookables.get(hostelBedID);
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof HotelRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		} else if (hostelBed == null || !(hostelBed instanceof HostelBed)) {
			logger.warn("The hostel bed with ID {} could not be found. Invalid ID!", hostelBedID);
			throw new InvalidIDException();
		}
		((HostelBed)hostelBed).setRoom((HotelRoom)room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteBookable(String bookableID) throws InvalidIDException{
		Bookable bookable = bookables.remove(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
			throw new InvalidIDException();
		}
		// TODO might need to notify so that stays in this bookable get another bookable.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRoomLocation(String roomID, int floor, String additionalInfo) throws InvalidIDException {
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof Room)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
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
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		}
		((ConferenceRoom)room).setCategory(category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeBookableBasePrice(String bookableID, double basePrice) throws InvalidIDException, IllegalArgumentException  {
		if (basePrice < 0) {
			logger.warn("The basePrice passed was negative! Invalid argument!");
			throw new IllegalArgumentException("The basePrice was negative!");
		}
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
			throw new InvalidIDException();
		}
		bookable.setBaseprice(basePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeBookableDescription(String bookableID, String description) throws InvalidIDException {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
			throw new InvalidIDException();
		}
		bookable.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String addHotelRoom(String roomNumber, double basePrice, String description, int floor, String locationInfo, HotelRoomCategory category, int nbrBeds) throws InvalidIDException, IllegalArgumentException{
		if (basePrice < 0) {
			logger.warn("The basePrice was negative! Invalid argument!");
			throw new IllegalArgumentException("The basePrice was negative!");
		} else if (nbrBeds < 0) {
			logger.warn("The nbrBeds passed was negative! Invalid argument!");
			throw new IllegalArgumentException("The nbrBeds was negative!");
		} 
		
		if (bookables.containsKey(roomNumber)) {
			logger.warn("There is already a room added with the roomNumber {}. The room number can not be used as a unique ID!", roomNumber);
			throw new InvalidIDException("There is already a room added with the roomNumber " + roomNumber + ". The room number can not be used as a unique ID!");
		}
		
		HotelRoom room = BookablesFactory.INSTANCE.createHotelRoom();
		RoomLocation location = BookablesFactory.INSTANCE.createRoomLocation();
		
		location.setFloor(floor);
		location.setAddtionalInfo(locationInfo);
		
		room.setId(roomNumber);
		room.setBaseprice(basePrice);
		room.setDescription(description);
		room.setLocation(location);
		room.setCategory(category);
		room.setNbrBeds(nbrBeds);
		
		bookables.put(roomNumber, room);
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String addHostelBed(String bedNumber, double basePrice, String description, String roomID) throws InvalidIDException, IllegalArgumentException {
		if (basePrice < 0) {
			logger.warn("The basePrice was negative! Invalid argument!");
			throw new IllegalArgumentException("The basePrice was negative!");
		}
		
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof HotelRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		}
		
		if (bookables.containsKey(bedNumber)) {
			logger.warn("There is already a bed added with the bedNumber {}. The bed number can not be used as a unique ID!", bedNumber);
			throw new InvalidIDException("There is already a bed added with the bedNumber " + bedNumber + ". The bed number can not be used as a unique ID!");
		} 
		
		HostelBed bed = BookablesFactory.INSTANCE.createHostelBed();
		
		bed.setId(bedNumber);
		bed.setBaseprice(basePrice);
		bed.setDescription(description);
		bed.setRoom((HotelRoom)room);

		bookables.put(bedNumber, bed);
		return bedNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String addConferenceRoom(String roomNumber, double basePrice, String description, int floor, String locationInfo, ConferenceRoomCategory category, int capacity) throws InvalidIDException, IllegalArgumentException {
		if (basePrice < 0) {
			logger.warn("The basePrice was negative! Invalid argument!");
			throw new IllegalArgumentException("The basePrice was negative!");
		} else if (capacity < 0) {
			logger.warn("The capacity passed was negative! Invalid argument!");
			throw new IllegalArgumentException("The capacity was negative!");
		} 
		
		if (bookables.containsKey(roomNumber)) {
			logger.warn("There is already a room added with the roomNumber {}. The room number can not be used as a unique ID!", roomNumber);
			throw new InvalidIDException("There is already a room added with the roomNumber " + roomNumber + ". The room number can not be used as a unique ID!");
		}
		
		ConferenceRoom room = BookablesFactory.INSTANCE.createConferenceRoom();
		RoomLocation location = BookablesFactory.INSTANCE.createRoomLocation();
		
		location.setFloor(floor);
		location.setAddtionalInfo(locationInfo);
		
		room.setId(roomNumber);
		room.setBaseprice(basePrice);
		room.setDescription(description);
		room.setLocation(location);
		room.setCategory(category);
		room.setCapacity(capacity);
		
		bookables.put(roomNumber, room);
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeHotelRoomNumberBeds(String roomID, int nbrBeds) throws InvalidIDException, IllegalArgumentException { 
		if (nbrBeds < 0) {
			logger.warn("The nbrBeds passed was negative! Invalid argument!");
			throw new IllegalArgumentException("The nbrBeds was negative!");
		} 
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof HotelRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		}
		((HotelRoom)room).setNbrBeds(nbrBeds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeConferenceRoomCapacity(String roomID, int capacity) throws InvalidIDException, IllegalArgumentException { 
		if (capacity < 0) {
			logger.warn("The capacity passed was negative! Invalid argument!");
			throw new IllegalArgumentException("The capacity was negative!");
		} 
		Bookable room = bookables.get(roomID);
		if (room == null || !(room instanceof ConferenceRoom)) {
			logger.warn("The room with ID {} could not be found. Invalid ID!", roomID);
			throw new InvalidIDException();
		}
		((ConferenceRoom)room).setCapacity(capacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getBookableCapacity(String bookableID) {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", bookableID);
			throw new InvalidIDException();
		}
		return bookable.getCapacity();
	}
} //BookablesManagerImpl
