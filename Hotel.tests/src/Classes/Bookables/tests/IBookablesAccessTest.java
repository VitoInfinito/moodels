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
		String bookableID = IBookablesManage.INSTANCE.addHotelRoom("001", 100, "desc for hotelroom 1", 1, "info 1", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("002", 200, "desc for hotelroom 2", 1, "info 2", HotelRoomCategory.FAMILY_ROOM, 4);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("003", 200, "desc for hotelroom 3", 1, "info 3", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("006", 200, "3", 1, "info 6", HotelRoomCategory.STANDARD_ROOM, 2);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHotelRoom("004", 200, "desc for hotelroom 4", 1, "info 4", HotelRoomCategory.SUITE, 6);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addConferenceRoom("005", 1, "desc of conferenceroom", 3, "info 5", ConferenceRoomCategory.LECTURE_ROOM, 100);
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHostelBed("101", 50, "hostelbed", "006");
		bookableList1.add(bookableID);
		bookableID = IBookablesManage.INSTANCE.addHostelBed("203", 50, "hostelbed", "006");
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
		boolean result = IBookablesManage.INSTANCE.getBookableBasePrice(ID) == 100;
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
		boolean result = IBookablesManage.INSTANCE.getRoomLocationInfo(ID).equals("info 1");
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
		boolean result = IBookablesManage.INSTANCE.getAllBookableIDs().size() == 8;
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
		IBookablesManage.INSTANCE.addHotelRoom("3", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.SUITE, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchForBookable("3");
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("3") &&
				(tmp.get(1).equals("003") || tmp.get(1).equals("203")) &&
				(tmp.get(2).equals("003") || tmp.get(2).equals("203")) &&
				(tmp.get(3).equals("005") || tmp.get(3).equals("006")) &&
				(tmp.get(4).equals("005") || tmp.get(4).equals("006"));
		assertTrue(result);
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
		boolean result = IBookablesManage.INSTANCE.getAllHostelBedIDs().size() == 2;
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
		String ID = "001";
		IBookablesManage.INSTANCE.getConferenceRoomCategory(ID);
	}

	@Test
	public void testSearchHotelRooms() {
		IBookablesManage.INSTANCE.addHotelRoom("011", 200, "desc for hotelroom222", 1, "info 3", HotelRoomCategory.STANDARD_ROOM, 6);
		IBookablesManage.INSTANCE.addHotelRoom("012", 200, "desc for hotelroom1111", 1, "info 57", HotelRoomCategory.SUITE, 3);
		IBookablesManage.INSTANCE.addHotelRoom("013", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.FAMILY_ROOM, 6);
		IBookablesManage.INSTANCE.addHotelRoom("3", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.SUITE, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("023", 200.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchHotelRooms("3", HotelRoomCategory.SUITE);
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("3") &&
				tmp.get(1).equals("003") &&
				tmp.get(2).equals("012");
		assertTrue(result);
	}

	@Test
	public void testSearchHostelBeds() {
		IBookablesManage.INSTANCE.addHostelBed("000", 200, "desc for hotelroom222", "001");
		IBookablesManage.INSTANCE.addHostelBed("012", 200, "desc for hotelroom1111", "002");
		IBookablesManage.INSTANCE.addHostelBed("013", 200, "desc for hostelbed", "001");
		IBookablesManage.INSTANCE.addHostelBed("1", 200, "desc for hotelrooms bed", "001");
		IBookablesManage.INSTANCE.addConferenceRoom("023", 200.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchHostelBeds("1");
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("1") &&
				(tmp.get(1).equals("013") || tmp.get(1).equals("012")|| tmp.get(1).equals("101")) &&
				(tmp.get(2).equals("013") || tmp.get(2).equals("101")|| tmp.get(2).equals("012")) &&
				(tmp.get(3).equals("012") || tmp.get(3).equals("101")|| tmp.get(3).equals("013"))
				&& tmp.get(4).equals("000");
		assertTrue(result);
	}

	@Test
	public void testSearchConferenceRooms() {
		IBookablesManage.INSTANCE.addHotelRoom("011", 200, "desc for hotelroom222", 1, "info 3", HotelRoomCategory.STANDARD_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("023", 300.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("034", 300.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.LECTURE_ROOM, 2);
		IBookablesManage.INSTANCE.addConferenceRoom("031", 300.0, "desc for hotelroom 2", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("2", 200.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.LECTURE_ROOM, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchConferenceRooms("2", ConferenceRoomCategory.LECTURE_ROOM);
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("2") &&
				tmp.get(1).equals("034");
		assertTrue(result);
	}
	
	@Test
	public void testSearchHotelRoomsWithNull() {
		IBookablesManage.INSTANCE.addHotelRoom("011", 200, "desc for hotelroom222", 1, "info 3", HotelRoomCategory.STANDARD_ROOM, 6);
		IBookablesManage.INSTANCE.addHotelRoom("012", 200, "desc for hotelroom1111", 1, "info 57", HotelRoomCategory.SUITE, 3);
		IBookablesManage.INSTANCE.addHotelRoom("013", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.FAMILY_ROOM, 6);
		IBookablesManage.INSTANCE.addHotelRoom("3", 200, "desc for hotelroom 3", 1, "info", HotelRoomCategory.SUITE, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("023", 200.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchHotelRooms("3", null);
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("3") &&
				(tmp.get(1).equals("013") || tmp.get(1).equals("003")) &&
				(tmp.get(2).equals("013") || tmp.get(2).equals("003")) &&
				(tmp.get(3).equals("012") || tmp.get(3).equals("006")) &&
				(tmp.get(4).equals("012") || tmp.get(4).equals("006")) &&
				tmp.get(5).equals("011");
		assertTrue(result);
	}

	@Test
	public void testSearchConferenceRoomsWithNull() {
		IBookablesManage.INSTANCE.addHotelRoom("011", 200, "desc for hotelroom222", 1, "info 3", HotelRoomCategory.STANDARD_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("023", 300.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("034", 300.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.LECTURE_ROOM, 2);
		IBookablesManage.INSTANCE.addConferenceRoom("031", 300.0, "desc for hotelroom 2", 1, "info", ConferenceRoomCategory.DINING_ROOM, 6);
		IBookablesManage.INSTANCE.addConferenceRoom("2", 200.0, "desc for hotelroom 3", 1, "info", ConferenceRoomCategory.LECTURE_ROOM, 6);
		
		List<String> tmp = IBookablesManage.INSTANCE.searchConferenceRooms("2", null);
		System.out.println(tmp.toString());
		boolean result = tmp.get(0).equals("2") &&
				tmp.get(1).equals("023") &&
				tmp.get(2).equals("034") &&
				tmp.get(3).equals("031");
		assertTrue(result);
	}

}
