package Classes.Stays.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Accounts.IManageAccounts;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Stays.IStays;

public class IStaysTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String bookable1ID = IBookablesManage.INSTANCE.addHotelRoom("1", 100, "desc", 1, "info", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookable1ID);
		//String booking1ID = IBookings.INSTANCE.makeBooking(bookableList1, customerID, from, to, nbrGuests, ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, discountFactor)
		//IStays.INSTANCE.addNewStay(room1ID, bookingID, fromDate, toDate)
	}
	
	@After
	public void tearDown() {
		for (String id : IStays.INSTANCE.getAllHotelStayIDs()) {
			IStays.INSTANCE.removeStay(id);
		}
	}

	@Test
	public void testCheckInGuest() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeBookableOfStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddNewStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBillToStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckOutGuest() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddResponsibleCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeResponsibleCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookableOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookingOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHotelStayIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCheckedInGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCheckedOutGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHotelStays() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHotelStaysWithinPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHotelStaysWithinPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUnpayedBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsResponsibleCreditCardAdded() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangePeriodOfStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveBillFromStay() {
		fail("Not yet implemented");
	}

}
