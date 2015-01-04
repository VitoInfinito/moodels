package Classes.Guests.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Accounts.IManageAccounts;
import Classes.Guests.IGuests;
import Classes.Requests.IRequests;
import Classes.Stays.IStays;
import Classes.Utils.InvalidIDException;

public class IManageGuestsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		IGuests.INSTANCE.addGuest("010101-0101", "Kalle", "Karlsson", "Mr", "kalle.karlsson@mail.mail", "0101010101");
		IGuests.INSTANCE.addGuest("020202-0202", "Erik", "Eriksson", "Mr", "erik.eriksson@mail.mail", "0202020202");
		IGuests.INSTANCE.addGuest("030303-0303", "Anna", "Andersson", "Mrs", "anna.andersson@mail.mail", "0303030303");
	}

	@After
	public void tearDown() throws Exception {
		for(String id : IGuests.INSTANCE.getAllGuestIDs()){
			IGuests.INSTANCE.removeGuest(id);
		}
		for(String SSID : IGuests.INSTANCE.getAllGuestIDs()){
			IGuests.INSTANCE.removeGuestAccount(SSID);
		}
		for(String SSID : IGuests.INSTANCE.getAllGuestIDs()){
			IGuests.INSTANCE.removeGuestRequest(SSID, SSID);
		}


	}

	@Test
	public void testGetAllGuestIDs() {
		List<String> guestsIDs  =  IGuests.INSTANCE.getAllGuestIDs();
		assertTrue(guestsIDs.size() == 3);
	}

	@Test
	public void testAddGuest() {
		IGuests.INSTANCE.addGuest("040404-0404", "Fatima", "Mohammed", "Mrs", "fatmima.mohammed@email.email", "0404040404");
		List<String> guestsIDs = IGuests.INSTANCE.getAllGuestIDs();
		assertTrue(guestsIDs.size() == 4);
	}

	@Test
	public void testChangeGuestFirstName() {
		assertTrue(IGuests.INSTANCE.getGuestFirstName("010101-0101") == "Kalle");
		IGuests.INSTANCE.changeGuestFirstName("010101-0101", "Karl");
		assertTrue(IGuests.INSTANCE.getGuestFirstName("010101-0101") == "Karl");

	}

	@Test
	public void testChangeGuestLastName() {
		assertTrue(IGuests.INSTANCE.getGuestLastName("010101-0101") == "Karlsson");
		IGuests.INSTANCE.changeGuestLastName("010101-0101", "Kallesson");
		assertTrue(IGuests.INSTANCE.getGuestLastName("010101-0101") == "Kallesson");
	}

	@Test
	public void testChangeGuestTitle() {
		assertTrue(IGuests.INSTANCE.getGuestTitle("010101-0101") == "Mr");
		IGuests.INSTANCE.changeGuestTitle("010101-0101", "Mrs");
		assertTrue(IGuests.INSTANCE.getGuestTitle("010101-0101") == "Mrs");
	}

	@Test
	public void testChangeGuestEmail() {
		assertTrue(IGuests.INSTANCE.getGuestEmail("010101-0101") == "kalle.karlsson@mail.mail");
		IGuests.INSTANCE.changeGuestEmail("010101-0101", "karl.karlsson@mail.mail");
		assertTrue(IGuests.INSTANCE.getGuestEmail("010101-0101") == "karl.karlsson@mail.mail");
	}

	@Test
	public void testChangeGuestPhone() {
		assertTrue(IGuests.INSTANCE.getGuestPhone("010101-0101") == "0101010101");
		IGuests.INSTANCE.changeGuestPhone("010101-0101", "0101010102");
		assertTrue(IGuests.INSTANCE.getGuestPhone("010101-0101") == "0101010102");
	}

	@Test
	public void testGetGuestFirstName() {
		assertTrue(IGuests.INSTANCE.getGuestFirstName("010101-0101") == "Kalle");
	}

	@Test
	public void testGetGuestLastName() {
		assertTrue(IGuests.INSTANCE.getGuestLastName("010101-0101") == "Karlsson");
	}

	@Test
	public void testGetGuestTitle() {
		assertTrue(IGuests.INSTANCE.getGuestTitle("010101-0101") == "Mr");
	}

	@Test
	public void testGetGuestEmail() {
		assertTrue(IGuests.INSTANCE.getGuestEmail("010101-0101") == "kalle.karlsson@mail.mail");
	}

	@Test
	public void testGetGuestPhone() {
		assertTrue(IGuests.INSTANCE.getGuestPhone("010101-0101") == "0101010101");
	}

	@Test
	public void testSearchGuests() {
		List<String> tmp = IGuests.INSTANCE.searchGuests("01");
		boolean result = (tmp.get(0).equals("010101-0101") || tmp.get(1).equals("010101-0101") || tmp.get(2).equals("010101-0101"));
		assertTrue(result);
	}

	@Test 
	public void testGetGuestStays() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestRequests() {
		String requestID = IRequests.INSTANCE.addRequest("abc");
		IGuests.INSTANCE.addGuestRequest("010101-0101", requestID);
		assertTrue(IGuests.INSTANCE.getGuestRequests("010101-0101").contains(requestID));
	}

	@Test
	public void testRemoveGuestStay() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testAddGuestRequest() {
		String requestID = IRequests.INSTANCE.addRequest("abc");
		IGuests.INSTANCE.addGuestRequest("010101-0101", requestID);
		assertTrue(IGuests.INSTANCE.getGuestRequests("010101-0101").contains(requestID));
	}

	@Test
	public void testRemoveGuestRequest() {
		String requestID = IRequests.INSTANCE.addRequest("abc");
		IGuests.INSTANCE.addGuestRequest("010101-0101", requestID);
		assertTrue(IGuests.INSTANCE.getGuestRequests("010101-0101").contains(requestID));
		IGuests.INSTANCE.removeGuestRequest("010101-0101", requestID);
		assertTrue(!(IGuests.INSTANCE.getGuestRequests("010101-0101").contains(requestID)));
	}

	@Test
	public void testGetGuestAccountUsername() {
		IGuests.INSTANCE.generateGuestAccount("010101-0101");
		boolean result = IGuests.INSTANCE.getGuestAccountUsername("010101-0101") == "010101-0101";
		assertTrue(result);
		IGuests.INSTANCE.removeGuestAccount("010101-0101");
	}

	@Test
	public void testGetGuestAccountPassword() {
		IGuests.INSTANCE.generateGuestAccount("020202-0202");
		String pw = IGuests.INSTANCE.getGuestAccountPassword("020202-0202");
		assertTrue(pw != "");
	}

	@Test
	public void testGenerateGuestAccount() {
		IGuests.INSTANCE.generateGuestAccount("030303-0303");
		assertTrue(IManageAccounts.INSTANCE.getAllAccountIDs().contains("030303-0303"));
	}

	@Test
	public void testRemoveGuestAccount() {
		IGuests.INSTANCE.generateGuestAccount("030303-0303");
		assertTrue(IManageAccounts.INSTANCE.getAllAccountIDs().contains("030303-0303"));
		IGuests.INSTANCE.removeGuestAccount("030303-0303");
		assertTrue(!(IManageAccounts.INSTANCE.getAllAccountIDs().contains("030303-0303")));
		
	}

}
