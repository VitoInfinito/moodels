package Classes.Accounts.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Accounts.AccountType;
import Classes.Accounts.IAccountsAccess;
import Classes.Accounts.IManageAccounts;
import Classes.Utils.InvalidIDException;

public class IManageAccountsTest {
	@Before
	public void setUp() throws Exception {
		IManageAccounts.INSTANCE.addAccount("Pelle", "s7hhhds", AccountType.GUEST);
		IManageAccounts.INSTANCE.addAccount("Patrik", "ssdass", AccountType.CUSTOMER_SERVICE);
		IManageAccounts.INSTANCE.addAccount("rik", "hfghfghf", AccountType.MANAGER);
		IManageAccounts.INSTANCE.addAccount("Orvar", "hfdbcbv", AccountType.STAFF);
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IManageAccounts.INSTANCE.getAllAccountIDs()) {
			IManageAccounts.INSTANCE.deleteAccount(id);
		}
	}

	@Test
	public void testAddAccount_username_not_exists_expects_username_added() throws InvalidIDException {
		IManageAccounts.INSTANCE.addAccount("Fisken", "s7hhhds", AccountType.GUEST);
		List<String> accounts = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertTrue(accounts.contains("Fisken"));
	}
	
	@Test
	public void testAddAccount_username_not_exists_expects_password_set() throws InvalidIDException {
		IManageAccounts.INSTANCE.addAccount("Fisken", "s7hhhds", AccountType.GUEST);
		String result = IManageAccounts.INSTANCE.getAccountPassword("Fisken");
		assertEquals("s7hhhds", result);
	}
	
	@Test
	public void testAddAccount_username_not_exists_expects_type_set() throws InvalidIDException {
		IManageAccounts.INSTANCE.addAccount("Fisken", "s7hhhds", AccountType.GUEST);
		AccountType result = IAccountsAccess.INSTANCE.getAccountType("Fisken");
		assertTrue(result == AccountType.GUEST);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddAccount_username_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.addAccount("Pelle", "asd", AccountType.GUEST);
	}

	@Test
	public void testDeleteAccount_username_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.deleteAccount("Pelle");
		List<String> accounts = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertFalse(accounts.contains("Pelle"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testDeleteAccount_username_not_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.deleteAccount("Arne");
	}

	@Test
	public void testRenameAccount_username_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.renameAccount("Pelle", "Torsten");
		List<String> accounts = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertTrue(accounts.contains("Torsten"));
		assertFalse(accounts.contains("Pelle"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRenameAccount_username_not_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.renameAccount("Torsten", "Pelle");
	}

	@Test
	public void testChangePassword_username_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.changePassword("sdads", "Pelle");
		String result = IManageAccounts.INSTANCE.getAccountPassword("Pelle");
		assertEquals("sdads", result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangePassword_username_not_exists() {
		IManageAccounts.INSTANCE.changePassword("sdads", "Olle");
	}

	@Test
	public void testGetAccountPassword_username_exists() throws InvalidIDException {
		String result = IManageAccounts.INSTANCE.getAccountPassword("Pelle");
		assertEquals("s7hhhds", result);
	}
	
	@Test
	public void testGetAccountPassword_username_exists_expects_non_null() throws InvalidIDException {
		String result = IManageAccounts.INSTANCE.getAccountPassword("Pelle");
		assertNotNull(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAccountPassword_username_not_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.getAccountPassword("Olle");
	}

	@Test
	public void testGetAccountName_username_exists() throws InvalidIDException {
		String result = IManageAccounts.INSTANCE.getAccountName("Pelle");
		assertEquals("Pelle", result);
	}
	
	@Test
	public void testGetAccountName_username_exists_expects_non_null() throws InvalidIDException {
		String result = IManageAccounts.INSTANCE.getAccountName("Pelle");
		assertNotNull(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAccountName_username_not_exists() throws InvalidIDException {
		IManageAccounts.INSTANCE.getAccountName("Olle");
	}
	
	@Test
	public void testSearchAccounts_accounts_empty_expects_empty_list() throws InvalidIDException {
		tearDown();
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("Pelle");
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void testSearchAccounts_expects_empty_list() {
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("Gurkan");
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void testSearchAccounts_expects_list_non_null() {
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("Gurkan");
		assertNotNull(result);
	}
	
	@Test
	public void testSearchAccounts_id_match_exactly() {
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("Pelle");
		assertTrue(result.contains("Pelle"));
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void testSearchAccounts_id_match_somewhat() {
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("elle");
		assertTrue(result.contains("Pelle"));
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void testSearchAccounts_multiple_matches_expects_correct_ordering() {
		List<String> result = IManageAccounts.INSTANCE.searchAccounts("rik");
		assertTrue(result.get(0) == "rik");
		assertTrue(result.get(1) == "Patrik");
		assertTrue(result.size() == 2);
	}
	
	@Test
	public void testGetAllAccountIDs_expects_list_contains_correct_elements() {
		List<String> result = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertTrue(result.contains("Pelle"));
		assertTrue(result.contains("Patrik"));
		assertTrue(result.contains("rik"));
		assertTrue(result.contains("Orvar"));
	}
	
	@Test
	public void testGetAllAccountIDs_expects_empty_list() throws InvalidIDException {
		tearDown();
		List<String> result = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void testGetAllAccountIDs_expects_non_null_list() {
		List<String> result = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertNotNull(result);
	}
	
	@Test
	public void testGetAllAccountIDs_expects_list_length_correct() {
		List<String> result = IManageAccounts.INSTANCE.getAllAccountIDs();
		assertTrue(result.size() == 4);
	}
}
