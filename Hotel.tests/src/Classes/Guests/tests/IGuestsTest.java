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
		for(String id : IGuests.INSTANCE.getAllGuestIDs()){
			IGuests.INSTANCE.removeGuest(id);
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
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testChangeGuestEmail() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testChangeGuestPhone() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestFirstName() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestLastName() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestTitle() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestEmail() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestPhone() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testSearchGuests() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestStays() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestRequests() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testRemoveGuestStay() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testAddGuestRequest() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testRemoveGuestRequest() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestAccountUsername() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGetGuestAccountPassword() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testGenerateGuestAccount() {
		fail("Not yet implemented");
		//TODO: write it
	}

	@Test
	public void testRemoveGuestAccount() {
		fail("Not yet implemented");
		//TODO: write it
	}

}
