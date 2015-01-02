package Classes.Staff.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Staff.IStaff;

public class IStaffTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IStaff.INSTANCE.addEmployee("Sven", "Larsson", "Cleaner", "0705-232425", "sven.larsson@mail.com", "010101-0101", "Hourly", 100);
		IStaff.INSTANCE.addEmployee("Lars", "Svensson", "Chef", "0705-232426", "lars.svensson@mail.com", "010101-0102", "Monthly", 20000);
	}
	
	@After
	public void tearDown() throws Exception {
		for(String SSID : IStaff.INSTANCE.getAllStaff()) {
			IStaff.INSTANCE.removeStaff(SSID);
		}
	}
	
	@Test
	public void testGetAllStaffEmptyExpectEmpty() throws Exception {
		tearDown();
		
		int result = IStaff.INSTANCE.getAllStaff().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllStaffNotEmpty() {
		int result = IStaff.INSTANCE.getAllStaff().size();
		assertTrue(result == 2);
	}

	@Test
	public void testSearchStaff() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStaffFirstName() {		
		assertTrue(IStaff.INSTANCE.getStaffFirstName("010101-0101") == "Sven");
	}

	@Test
	public void testGetStaffLastName() {
		assertTrue(IStaff.INSTANCE.getStaffLastName("010101-0101") == "Larsson");
	}

	@Test
	public void testGetStaffJob() {
		assertTrue(IStaff.INSTANCE.getStaffJob("010101-0101") == "Cleaner");
	}

	@Test
	public void testGetStaffPhone() {
		assertTrue(IStaff.INSTANCE.getStaffPhone("010101-0101") == "0705-232425");
	}

	@Test
	public void testGetStaffEmail() {
		assertTrue(IStaff.INSTANCE.getStaffEmail("010101-0101") == "sven.larsson@mail.com");
	}

	@Test
	public void testGetStaffSalaryContractType() {
		assertTrue(IStaff.INSTANCE.getStaffSalaryContractType("010101-0101") == "Hourly");
	}

	@Test
	public void testGetStaffSalary() {
		assertTrue(IStaff.INSTANCE.getStaffSalary("010101-0101") == 100);
	}

	@Test
	public void testChangeStaffFirstName() {
		IStaff.INSTANCE.changeStaffFirstName("010101-0101", "Kalle");
		assertTrue(IStaff.INSTANCE.getStaffFirstName("010101-0101") == "Kalle");
	}

	@Test
	public void testChangeStaffLastName() {
		IStaff.INSTANCE.changeStaffLastName("010101-0101", "Andersson");
		assertTrue(IStaff.INSTANCE.getStaffLastName("010101-0101") == "Andersson");
	}

	@Test
	public void testChangeStaffJob() {
		IStaff.INSTANCE.changeStaffJob("010101-0101", "Manager");
		assertTrue(IStaff.INSTANCE.getStaffJob("010101-0101") == "Manager");
	}

	@Test
	public void testChangeStaffPhone() {
		IStaff.INSTANCE.changeStaffPhone("010101-0101", "0705-232427");
		assertTrue(IStaff.INSTANCE.getStaffPhone("010101-0101") == "0705-232427");
	}

	@Test
	public void testChangeStaffSalaryContract() {
		// TODO
		fail("Not yet implemented");
	}

	@Test
	public void testScheduleStaff() {
		// TODO
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveEmployee() {
		IStaff.INSTANCE.removeStaff("010101-0101");
		assertTrue(IStaff.INSTANCE.getAllStaff().size() == 1);
	}

	@Test
	public void testAddEmployee() {
		IStaff.INSTANCE.addEmployee("Anders", "Gustavsson", "Receptionist", "0705-232428", "anders.gustavsson@mail.com", "010101-0103", "Monthly", 150);
		
		boolean result =	IStaff.INSTANCE.getStaffFirstName("010101-0103") == "Anders" &&
							IStaff.INSTANCE.getStaffLastName("010101-0103") == "Gustavsson" &&
							IStaff.INSTANCE.getStaffJob("010101-0103") == "Receptionist" &&
							IStaff.INSTANCE.getStaffPhone("010101-0103") == "0705-232428" &&
							IStaff.INSTANCE.getStaffEmail("010101-0103") == "anders.gustavsson@mail.com" &&
							IStaff.INSTANCE.getStaffSalaryContractType("010101-0103") == "Monthly" &&
							IStaff.INSTANCE.getStaffSalary("010101-0103") == 150;
		
		assertTrue(result);
	}

}
