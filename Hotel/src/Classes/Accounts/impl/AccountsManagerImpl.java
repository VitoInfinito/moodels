/**
 */
package Classes.Accounts.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Accounts.Account;
import Classes.Accounts.AccountType;
import Classes.Accounts.AccountsFactory;
import Classes.Accounts.AccountsManager;
import Classes.Accounts.AccountsPackage;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToAccountMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsManagerImpl extends MinimalEObjectImpl.Container implements AccountsManager {
	private final Logger logger = LoggerFactory.getLogger(AccountsManagerImpl.class);
	public static AccountsManagerImpl INSTANCE = new AccountsManagerImpl();

	private EMap<String, Account> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private AccountsManagerImpl() {
		super();
		accounts = new EcoreEMap<String,Account>(ECoreMapEntriesPackage.Literals.STRING_TO_ACCOUNT_MAP, StringToAccountMapImpl.class, this, AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addAccount(String username, String password, AccountType type) throws InvalidIDException {
		if (accounts.containsKey(username)) {
			logger.warn("An account with username {} already exists.", username);
			throw new InvalidIDException();
		} else {
			Account account = AccountsFactory.eINSTANCE.createAccount();

			account.setUsername(username);
			account.setPassword(password);
			account.setAccountType(type);

			accounts.put(username, account);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void deleteAccount(String username) throws InvalidIDException {
		Account acc = accounts.removeKey(username);
		if (acc == null) {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void renameAccount(String oldUsername, String newUsername) throws InvalidIDException {
		if (accounts.containsKey(oldUsername)) {
			if (accounts.containsKey(newUsername)) {
				logger.warn("An account with username {} already exists.", newUsername);
				throw new InvalidIDException();
			} else {
				Account acc = accounts.get(oldUsername);
				acc.setUsername(newUsername);
				accounts.removeKey(oldUsername);
				accounts.put(newUsername, acc);
			}
		} else {
			logger.warn("An account with username {} could not be found.", oldUsername);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changePassword(String newPassword, String username) throws InvalidIDException {
		if (accounts.containsKey(username)) {
			accounts.get(username).setPassword(newPassword);
		} else {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getAccountPassword(String username) throws InvalidIDException {
		if (accounts.containsKey(username)) {
			return accounts.get(username).getPassword();
		} else {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getAccountName(String username) throws InvalidIDException {
		if (accounts.containsKey(username)) {
			return accounts.get(username).getUsername();
		} else {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchAccounts(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (accounts.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		// ID match somewhat. Second Order!
		Collection<Account> c = accounts.values();
		for (Account acc : c) {			
			if (regexPattern.matcher(acc.getUsername()).matches()) {
				searchResult.add(acc.getUsername());
			}
		}
		
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccount(String username, String password) {
		return accounts.containsKey(username) && accounts.get(username).getPassword() == password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String username, String password) {
		return validateAccount(username, password);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public AccountType getAccountType(String username) throws InvalidIDException {
		if (accounts.containsKey(username)) {
			return accounts.get(username).getAccountType();
		} else {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<String> getAllAccountIDs() {
		return new ArrayList<String>(accounts.keySet());
	}
} //AccountsManagerImpl
