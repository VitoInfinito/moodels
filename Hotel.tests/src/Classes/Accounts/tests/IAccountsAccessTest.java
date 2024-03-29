package Classes.Accounts.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Accounts.AccountType;
import Classes.Accounts.IAccountsAccess;
import Classes.Accounts.IManageAccounts;
import Classes.Utils.InvalidIDException;

public class IAccountsAccessTest {	
	@Before
	public void setUp() throws Exception {
		IManageAccounts.INSTANCE.addAccount("Pelle", "s7hhhds", AccountType.GUEST);
		IManageAccounts.INSTANCE.addAccount("Patrik", "ssdass", AccountType.CUSTOMER_SERVICE);
		IManageAccounts.INSTANCE.addAccount("Erik", "hfghfghf", AccountType.MANAGER);
		IManageAccounts.INSTANCE.addAccount("Orvar", "hfdbcbv", AccountType.STAFF);
	}
	
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IManageAccounts.INSTANCE.getAllAccountIDs()) {
			IManageAccounts.INSTANCE.deleteAccount(id);
		}
	}

	@Test
	public void testValidateAccount_username_not_exists() {
		boolean result = IAccountsAccess.INSTANCE.validateAccount("Arne", "");
		assertFalse(result);
	}
	
	@Test
	public void testValidateAccount_username_exists_wrong_password() {
		boolean result = IAccountsAccess.INSTANCE.validateAccount("Pelle", "s7hh56");
		assertFalse(result);
	}
	
	@Test
	public void testValidateAccount_username_exists_correct_password() {
		boolean result = IAccountsAccess.INSTANCE.validateAccount("Pelle", "s7hhhds");
		assertTrue(result);
	}

	@Test
	public void testLogin_username_not_exists() {
		boolean result = IAccountsAccess.INSTANCE.login("Pelle", "");
		assertFalse(result);
	}
	
	@Test
	public void testLogin_username_exists_wrong_password() {
		boolean result = IAccountsAccess.INSTANCE.login("Pelle", "s7hh56");
		assertFalse(result);
	}
	
	@Test
	public void testLogin_username_exists_correct_password() {
		boolean result = IAccountsAccess.INSTANCE.login("Pelle", "s7hhhds");
		assertTrue(result);
	}

	@Test(expected=InvalidIDException.class)
	public void testGetAccountType_username_not_exists() throws InvalidIDException {
		IAccountsAccess.INSTANCE.getAccountType("Arne");
	}
	
	@Test
	public void testGetAccountType_username_exists_nonNull_expected() throws InvalidIDException {
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Pelle");
		assertTrue(result != null);
	}
	
	@Test
	public void testGetAccountType_username_exists_Guest_expected() throws InvalidIDException {
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Pelle");
		assertTrue(result == AccountType.GUEST);
	}
	
	@Test
	public void testGetAccountType_username_exists_CustomerService_expected() throws InvalidIDException {
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Patrik");
		assertTrue(result == AccountType.CUSTOMER_SERVICE);
	}
	
	@Test
	public void testGetAccountType_username_exists_Manager_expected() throws InvalidIDException {
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Erik");
		assertTrue(result == AccountType.MANAGER);
	}
	
	@Test
	public void testGetAccountType_username_exists_Staff_expected() throws InvalidIDException {
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Orvar");
		assertTrue(result == AccountType.STAFF);
	}
}
