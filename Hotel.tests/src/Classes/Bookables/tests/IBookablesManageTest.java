package Classes.Bookables.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Utils.InvalidIDException;

public class IBookablesManageTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		String bookableID = IBookablesManage.INSTANCE.addHotelRoom("001", 100, "desc for hotelroom 1", 1, "info", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("002", 200, "desc for hotelroom 2", 1, "info", HotelRoomCategory.FAMILY_ROOM, 4);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("003", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("004", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addConferenceRoom("005", 1, "desc of conferenceroom", 3, "info", ConferenceRoomCategory.LECTURE_ROOM, 100);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("006", 200, "desc for hotelroom with hostel bed", 1, "info", HotelRoomCategory.STANDARD_ROOM, 2);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHostelBed("101", 50, "hostelbed", "006");
		bookableList1.add(bookableID);
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for(String id : IBookablesManage.INSTANCE.getAllBookableIDs()) {
			IBookablesManage.INSTANCE.deleteBookable(id);
		}
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNotExistingHostelBedRoom() {
		IBookablesManage.INSTANCE.changeHostelBedRoom("100", "004");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeHostelBedToNotExistingRoom() {
		IBookablesManage.INSTANCE.changeHostelBedRoom("101", "000");
	}

	@Test
	public void testChangeHostelBedRoom() {
		IBookablesManage.INSTANCE.changeHostelBedRoom("101", "004");
		boolean result = IBookablesManage.INSTANCE.getRoomOfHostelBed("101").equals("004");
		assertTrue(result);
	}

	@Test
	public void testDeleteBookable() {
		IBookablesManage.INSTANCE.deleteBookable("001");
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().contains("001");
		assertFalse(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testDeleteNoneExistingBookable() {
		IBookablesManage.INSTANCE.deleteBookable("000");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNoneExistingRoomLocation(){
		IBookablesManage.INSTANCE.changeRoomLocation("010", 10, "");
	}

	@Test
	public void testChangeRoomLocationOnlyFloor() {
		String tmp = "New Location";
		IBookablesManage.INSTANCE.changeRoomLocation("002", 10, tmp);
		boolean result = IBookablesManage.INSTANCE.getRoomLocationFloor("002") == 10 ;
		assertTrue(result);
	}
	
	@Test
	public void testChangeRoomLocationOnlyDesc() {
		String tmp = "New Location";
		IBookablesManage.INSTANCE.changeRoomLocation("002", 10, tmp);
		boolean result = IBookablesManage.INSTANCE.getRoomLocationInfo("002").equals(tmp);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNoneExistingHotelRoomCategory() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeHotelRoomCategory(ID, HotelRoomCategory.SUITE);
	}

	@Test
	public void testChangeHotelRoomCategory() {
		String ID = "002";
		boolean result = IBookablesManage.INSTANCE.getHotelRoomCategory(ID).equals(HotelRoomCategory.FAMILY_ROOM);
		IBookablesManage.INSTANCE.changeHotelRoomCategory(ID, HotelRoomCategory.SUITE);
		result = result && IBookablesManage.INSTANCE.getHotelRoomCategory(ID).equals(HotelRoomCategory.SUITE);
		assertTrue(result);
	}
	
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNotExistingConferenceRoomCategory() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeConferenceRoomCategory(ID, ConferenceRoomCategory.DINING_ROOM);
	}
	
	@Test
	public void testChangeConferenceRoomCategory() {
		String ID = "005";
		IBookablesManage.INSTANCE.changeConferenceRoomCategory(ID, ConferenceRoomCategory.DINING_ROOM);
		boolean result = IBookablesManage.INSTANCE.getConferenceRoomCategory(ID).equals(ConferenceRoomCategory.DINING_ROOM);
		assertTrue(result);
	}
	

	@Test
	public void testChangeBookableBasePrice() {
		String ID = "005";
		IBookablesManage.INSTANCE.changeBookableBasePrice(ID, 1337);
		boolean result = IBookablesManage.INSTANCE.getBookableBasePrice(ID) == 1337;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNotExistingBookableBasePrice() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeBookableBasePrice(ID, 1337);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testChangeBookableBasePriceToLessThanZero() {
		String ID = "005";
		IBookablesManage.INSTANCE.changeBookableBasePrice(ID, -1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNotExistingBookableDescription() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeBookableDescription(ID, "");
	}

	@Test
	public void testChangeBookableDescription() {
		String ID = "005";
		String desc = "This is not bookable";
		IBookablesManage.INSTANCE.changeBookableDescription(ID, desc);
		boolean result = IBookablesManage.INSTANCE.getBookableDescription(ID).equals(desc);
		assertTrue(result);
	}

	@Test
	public void testAddHotelRoom() {
		String ID = "010";
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().contains(ID);
		IBookablesManage.INSTANCE.addHotelRoom(ID, 5, "empty", 3, "hell", HotelRoomCategory.SUITE, 1);
		result = !result && IBookablesManage.INSTANCE.getAllHotelRoomIDs().contains(ID);
		assertTrue(result);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAddHostelBedWithToLowPrice() {
		String ID = "010";
		IBookablesManage.INSTANCE.addHostelBed(ID, -1, "desc", "001");
	}
	
	@Test (expected=InvalidIDException.class)
	public void testAddHostelBedToExistingID() {
		String ID = "001";
		IBookablesManage.INSTANCE.addHostelBed(ID, 1, "desc", "009");
	}
	
	@Test (expected=InvalidIDException.class)
	public void testAddHostelBedToNoneExistingRoom() {
		String ID = "010";
		IBookablesManage.INSTANCE.addHostelBed(ID, 1, "desc", "009");
	}

	@Test
	public void testAddHostelBed() {
		String ID = "010";
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().contains(ID);
		IBookablesManage.INSTANCE.addHostelBed(ID, 1, "desc", "001");
		result = !result && IBookablesManage.INSTANCE.getAllHostelBedIDs().contains(ID);
		assertTrue(result);
	}
	
	@Test (expected=InvalidIDException.class)
	public void testAddConferenceRoomWithExistingID() {
		String ID = "001";
		IBookablesManage.INSTANCE.addConferenceRoom(ID, 10000, "Conf", 100, "Heaven", ConferenceRoomCategory.OTHER, 100000);

	}

	@Test (expected=IllegalArgumentException.class)
	public void testAddConferenceRoomPriceToLow() {
		String ID = "010";
		IBookablesManage.INSTANCE.addConferenceRoom(ID, -1, "Conf", 100, "Heaven", ConferenceRoomCategory.OTHER, 100000);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAddConferenceRoomNbrOfBedsToLow() {
		String ID = "010";
		IBookablesManage.INSTANCE.addConferenceRoom(ID, 10000, "Conf", 100, "Heaven", ConferenceRoomCategory.OTHER, -1);
	}


	@Test
	public void testAddConferenceRoom() {
		String ID = "010";
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().contains(ID);
		IBookablesManage.INSTANCE.addConferenceRoom(ID, 10000, "Conf", 100, "Heaven", ConferenceRoomCategory.OTHER, 100000);
		result = !result && IBookablesManage.INSTANCE.getAllConferenceRoomIDs().contains(ID);
		assertTrue(result);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testChangeHotelRoomNumberBedsToLessThanZero() {
		String ID = "002";
		IBookablesManage.INSTANCE.changeHotelRoomNumberBeds(ID, -1337);

	}
	
	@Test (expected=InvalidIDException.class)
	public void testChangeNotExtistingHotelRoomNumberBeds() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeHotelRoomNumberBeds(ID, 1337);
	}
	
	@Test
	public void testChangeHotelRoomNumberBeds() {
		String ID = "002";
		IBookablesManage.INSTANCE.changeHotelRoomNumberBeds(ID, 1337);
		boolean result = IBookablesManage.INSTANCE.getHotelRoomNbrBeds(ID) == 1337;
		assertTrue(result);
	}
	
	@Test (expected=InvalidIDException.class)
	public void testChangeNotExistingConferenceRoomCapacity() {
		String ID = "000";
		IBookablesManage.INSTANCE.changeConferenceRoomCapacity(ID, 1337);
	}
	

	@Test (expected=IllegalArgumentException.class)
	public void testChangeConferenceRoomCapacityToLessThanZero() {
		String ID = "005";
		IBookablesManage.INSTANCE.changeConferenceRoomCapacity(ID, -1337);
	}

	@Test
	public void testChangeConferenceRoomCapacity() {
		String ID = "005";
		IBookablesManage.INSTANCE.changeConferenceRoomCapacity(ID, 1337);
		boolean result = IBookablesManage.INSTANCE.getConferenceRoomCapacity(ID) == 1337;
		assertTrue(result);
	}

}
