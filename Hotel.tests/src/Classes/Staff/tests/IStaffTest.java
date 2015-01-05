package Classes.Staff.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Customers.ICustomers;
import Classes.Staff.IStaff;
import Classes.Utils.InvalidIDException;

public class IStaffTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() {
		IStaff.INSTANCE.addEmployee("Sven", "Larsson", "Cleaner", "0705-232425", "sven.larsson@mail.com", "010101-0101", "Hourly", 100);
		IStaff.INSTANCE.addEmployee("Lars", "Svensson", "Chef", "0705-232426", "lars.svensson@mail.com", "010101-0102", "Monthly", 20000);
	}
	
	@After
	public void tearDown() {
		for(String SSID : IStaff.INSTANCE.getAllStaff()) {
			IStaff.INSTANCE.removeStaff(SSID);
		}
	}
	
	@Test
	public void testGetAllStaffEmptyExpectEmpty() {
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
		tearDown();
		
		boolean result = IStaff.INSTANCE.searchStaff("Svenne").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchStaff_staffEmpty_expectEmptyList() throws InvalidIDException{
		tearDown();
		boolean result = IStaff.INSTANCE.searchStaff("Sven").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchStaff_staffNotEmpty_expectsEmptyList() {
		boolean result = IStaff.INSTANCE.searchStaff("XXX").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchStaff_expectsListNonNull() {
		List<String> list = IStaff.INSTANCE.searchStaff("XXX");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchStaff_idMatchExactly() {
		List<String> list = IStaff.INSTANCE.searchStaff("Svensson");
		assertTrue(list.contains("010101-0102"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchStaff_idMatchSomewhat() {
		List<String> list = IStaff.INSTANCE.searchStaff("vensson");
		assertTrue(list.contains("010101-0102"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchStaff_multipleMatches() {
		List<String> list = IStaff.INSTANCE.searchStaff("son");
		assertTrue(list.size() == 2);
	}

	@Test
	public void testGetStaffFirstName() {		
		assertTrue(IStaff.INSTANCE.getStaffFirstName("010101-0101") == "Sven");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffFirstName_id_not_exists() {
		IStaff.INSTANCE.getStaffFirstName("");
	}

	@Test
	public void testGetStaffLastName() {
		assertTrue(IStaff.INSTANCE.getStaffLastName("010101-0101") == "Larsson");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffLastName_id_not_exists() {
		IStaff.INSTANCE.getStaffLastName("");
	}

	@Test
	public void testGetStaffJob() {
		assertTrue(IStaff.INSTANCE.getStaffJob("010101-0101") == "Cleaner");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffJob_id_not_exists() {
		IStaff.INSTANCE.getStaffJob("");
	}

	@Test
	public void testGetStaffPhone() {
		assertTrue(IStaff.INSTANCE.getStaffPhone("010101-0101") == "0705-232425");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffPhone_id_not_exists() {
		IStaff.INSTANCE.getStaffPhone("");
	}

	@Test
	public void testGetStaffEmail() {
		assertTrue(IStaff.INSTANCE.getStaffEmail("010101-0101") == "sven.larsson@mail.com");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffEmail_id_not_exists() {
		IStaff.INSTANCE.getStaffEmail("");
	}

	@Test
	public void testGetStaffSalaryContractType() {
		assertTrue(IStaff.INSTANCE.getStaffSalaryContractType("010101-0101") == "Hourly");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffSalaryContractType_id_not_exists() {
		IStaff.INSTANCE.getStaffSalaryContractType("");
	}

	@Test
	public void testGetStaffSalary() {
		assertTrue(IStaff.INSTANCE.getStaffSalary("010101-0101") == 100);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetStaffSalary_id_not_exists() {
		IStaff.INSTANCE.getStaffSalary("");
	}

	@Test
	public void testChangeStaffFirstName() {
		IStaff.INSTANCE.changeStaffFirstName("010101-0101", "Kalle");
		assertTrue(IStaff.INSTANCE.getStaffFirstName("010101-0101") == "Kalle");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeStaffFirstName_id_not_exists() {
		IStaff.INSTANCE.changeStaffFirstName("", "");
	}

	@Test
	public void testChangeStaffLastName() {
		IStaff.INSTANCE.changeStaffLastName("010101-0101", "Andersson");
		assertTrue(IStaff.INSTANCE.getStaffLastName("010101-0101") == "Andersson");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeStaffLastName_id_not_exists() {
		IStaff.INSTANCE.changeStaffLastName("", "");
	}

	@Test
	public void testChangeStaffJob() {
		IStaff.INSTANCE.changeStaffJob("010101-0101", "Manager");
		assertTrue(IStaff.INSTANCE.getStaffJob("010101-0101") == "Manager");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeStaffJob_id_not_exists() {
		IStaff.INSTANCE.changeStaffJob("", "");
	}

	@Test
	public void testChangeStaffPhone() {
		IStaff.INSTANCE.changeStaffPhone("010101-0101", "0705-232427");
		assertTrue(IStaff.INSTANCE.getStaffPhone("010101-0101") == "0705-232427");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeStaffPhone_id_not_exists() {
		IStaff.INSTANCE.changeStaffPhone("", "");
	}

	@Test
	public void testChangeStaffSalaryContract() {
		IStaff.INSTANCE.changeStaffSalaryContract("010101-0101", "Monthly");
		assertTrue(IStaff.INSTANCE.getStaffSalaryContractType("010101-0101") == "Monthly");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeStaffSalaryContract_id_not_exists() {
		IStaff.INSTANCE.getStaffSalaryContractType("");
	}

	//TODO This test may be inaccurate
	@Test(expected=InvalidIDException.class)
	public void testScheduleStaff() {
		tearDown();
		
		IStaff.INSTANCE.scheduleStaff(LocalDateTime.now(), LocalDateTime.of(2015, 1, 22, 0, 0));
		IStaff.INSTANCE.getStaffJob("010101-0101");
	}
	
	@Test
	public void testRemoveEmployee() {
		IStaff.INSTANCE.removeStaff("010101-0101");
		assertTrue(IStaff.INSTANCE.getAllStaff().size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveEmployee_id_not_exists() {
		IStaff.INSTANCE.removeStaff("");
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
	
	@Test(expected=InvalidIDException.class)
	public void testAddEmployee_id_already_exists() {
		IStaff.INSTANCE.addEmployee("", "", "", "", "", "010101-0101", "", 0);
	}

}
