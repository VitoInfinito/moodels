/**
 */
package Classes.Accounts.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Accounts.impl.AccountsManagerImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountsManagerImpl extends MinimalEObjectImpl.Container implements AccountsManager {
	private final Logger logger = LoggerFactory.getLogger(AccountsManagerImpl.class);
	public static AccountsManagerImpl INSTANCE = new AccountsManagerImpl();


	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated NOT
	 * @ordered
	 */
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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountsPackage.Literals.ACCOUNTS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Account> getAccounts() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAccount(String username, String password, AccountType type) {
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
	 * @generated NOT
	 */
	public void deleteAccount(String username) {
		Account acc = accounts.removeKey(username);
		if (acc == null) {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void renameAccount(String oldUsername, String newUsername) {
		if (accounts.containsKey(oldUsername)) {
			if (accounts.containsKey(newUsername)) {
				logger.warn("An account with username {} already exists.", newUsername);
				throw new InvalidIDException();
			} else {
				accounts.get(oldUsername).setUsername(newUsername);
			}
		} else {
			logger.warn("An account with username {} could not be found.", oldUsername);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changePassword(String newPassword, String username) {
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
	 * @generated NOT
	 */
	public String getAccountPassword(String username) {
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
	 * @generated NOT
	 */
	public String getAccountName(String username) {
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
	 * @generated NOT
	 */
	public AccountType getAccountType(String username) {
		if (accounts.containsKey(username)) {
			return accounts.get(username).getAccountType();
		} else {
			logger.warn("An account with username {} could not be found.", username);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}
} //AccountsManagerImpl
