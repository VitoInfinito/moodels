package Classes.Bookables.tests;

import static org.junit.Assert.*;

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

public class IBookablesAccessTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String bookableID = IBookablesManage.INSTANCE.addHotelRoom("001", 100, "desc for hotelroom 1", 1, "info1", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("002", 200, "desc for hotelroom 2", 1, "info2", HotelRoomCategory.FAMILY_ROOM, 4);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("003", 200, "desc for hotelroom 3", 1, "info3", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("004", 200, "desc for hotelroom 3", 1, "info4", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addConferenceRoom("005", 1, "desc of conferenceroom", 3, "info5", ConferenceRoomCategory.LECTURE_ROOM, 100);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("006", 200, "desc for hotelroom with hostel bed", 1, "info6", HotelRoomCategory.STANDARD_ROOM, 2);
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

	@Test
	public void testGetBookableBasePrice() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getBookableBasePrice(ID)==100;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingBookableBasePrice() {
		String ID = "000";
		IBookablesManage.INSTANCE.getBookableBasePrice(ID);
	}

	@Test
	public void testGetRoomLocationInfo() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getRoomLocationInfo(ID).equals("info1");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingRoomLocationInfo() {
		String ID = "000";
		IBookablesManage.INSTANCE.getRoomLocationInfo(ID);
	}

	@Test
	public void testGetBookableDescription() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getBookableDescription(ID).equals("desc for hotelroom 1");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingBookableDescription() {
		String ID = "000";
		IBookablesManage.INSTANCE.getBookableDescription(ID);
	}

	@Test
	public void testGetAllBookableIDs() {
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().size() == 7;
		assertTrue(result);
	}

	@Test
	public void testGetRoomOfHostelBed() {
		String ID = "101";
		boolean result = IBookablesManage.INSTANCE.getRoomOfHostelBed(ID).equals("006");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingRoomOfHostelBed() {
		String ID = "001";
		IBookablesManage.INSTANCE.getRoomOfHostelBed(ID);
	}

	@Test
	public void testGetHotelRoomCategory() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getHotelRoomCategory(ID) == HotelRoomCategory.STANDARD_ROOM;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingHotelRoomCategory() {
		String ID = "101";
		IBookablesManage.INSTANCE.getHotelRoomCategory(ID);
	}

	@Test
	public void testGetConferenceRoomCapacity() {
		String ID = "005";
		boolean result = IBookablesManage.INSTANCE.getConferenceRoomCapacity(ID) == 100;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingConferenceRoomCapacity() {
		String ID = "001";
		IBookablesManage.INSTANCE.getConferenceRoomCapacity(ID);
	}

	@Test
	public void testGetHotelRoomNbrBeds() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getHotelRoomNbrBeds(ID) == 2;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingHotelRoomNbrBeds() {
		String ID = "000";
		IBookablesManage.INSTANCE.getHotelRoomNbrBeds(ID);
	}

	@Test
	public void testSearchForBookable() {
		fail("Not yet implemented");
		//TODO
		//TODO
	}

	@Test
	public void testGetRoomLocationFloor() {
		String ID = "001";
		boolean result = IBookablesManage.INSTANCE.getRoomLocationFloor(ID) == 1;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingRoomLocationFloor() {
		String ID = "000";
		IBookablesManage.INSTANCE.getRoomLocationFloor(ID);
	}

	@Test
	public void testGetAllHotelRoomIDs() {
		boolean result = IBookablesManage.INSTANCE.getAllHotelRoomIDs().size() == 5;
		assertTrue(result);
	}

	@Test
	public void testGetAllConferenceRoomIDs() {
		boolean result = IBookablesManage.INSTANCE.getAllConferenceRoomIDs().size() == 1;
		assertTrue(result);
	}

	@Test
	public void testGetAllHostelBedIDs() {
		boolean result = IBookablesManage.INSTANCE.getAllHostelBedIDs().size() == 1;
		assertTrue(result);
	}

	@Test
	public void testGetConferenceRoomCategory() {
		String ID = "005";
		boolean result = IBookablesManage.INSTANCE.getConferenceRoomCategory(ID) == ConferenceRoomCategory.LECTURE_ROOM;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotExistingConferenceRoomCategory() {
		fail("Not yet implemented");
		//TODO
	}

	@Test
	public void testSearchHotelRooms() {
		fail("Not yet implemented");
		//TODO
		//TODO
	}

	@Test
	public void testSearchHostelBeds() {
		fail("Not yet implemented");
		//TODO
		//TODO
	}

	@Test
	public void testSearchConferenceRooms() {
		fail("Not yet implemented");
		//TODO
		//TODO
	}

}
