package Classes.Bookables.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Stays.IStays;
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

	@Test
	public void testChangeRoomLocation() {
		String tmp = "New Location";
		IBookablesManage.INSTANCE.changeRoomLocation("002", 10, tmp);
		boolean result = IBookablesManage.INSTANCE.getRoomLocationFloor("002") == 10 
				&& IBookablesManage.INSTANCE.getRoomLocationInfo("002").equals(tmp);
		assertTrue(result);
	}

	@Test
	public void testChangeHotelRoomCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeConferenceRoomCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeBookableBasePrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeBookableDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddHotelRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddHostelBed() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddConferenceRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeHotelRoomNumberBeds() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeConferenceRoomCapacity() {
		fail("Not yet implemented");
	}

}
