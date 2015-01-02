package Classes.Guests.tests;

import static org.junit.Assert.*;

import java.util.List;

import javax.management.InstanceAlreadyExistsException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Guests.IGuests;

public class IGuestsTest {
	
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
		IGuests.INSTANCE.removeGuest("010101-0101");
		IGuests.INSTANCE.removeGuest("020202-0202");
		IGuests.INSTANCE.removeGuest("030303-0303");
		
	}

	@Test
	public void testGetAllGuestIDs() {
		List<String> guestsIDs  =  IGuests.INSTANCE.getAllGuestIDs();
		assertTrue(guestsIDs.size() == 3);
	}

	@Test
	public void testAddGuest() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeGuestFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeGuestLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeGuestTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeGuestEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeGuestPhone() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestPhone() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchGuests() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestStays() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveGuestStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddGuestRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveGuestRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestAccountUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestAccountPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateGuestAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveGuestAccount() {
		fail("Not yet implemented");
	}

}
