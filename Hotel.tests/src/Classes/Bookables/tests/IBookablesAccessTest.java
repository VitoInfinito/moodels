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

	@Test
	public void testGetBookableBasePrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoomLocationInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookableDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBookableIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoomOfHostelBed() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHotelRoomCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConferenceRoomCapacity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHotelRoomNbrBeds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchForBookable() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoomLocationFloor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHotelRoomIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllConferenceRoomIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHostelBedIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConferenceRoomCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHotelRooms() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHostelBeds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchConferenceRooms() {
		fail("Not yet implemented");
	}

}
