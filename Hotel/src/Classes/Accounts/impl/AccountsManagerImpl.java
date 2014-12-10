/**
 */
package Classes.Accounts.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.Accounts.Account;
import Classes.Accounts.AccountType;
import Classes.Accounts.AccountsManager;
import Classes.Accounts.AccountsPackage;
import Classes.Accounts.IAccountsAccess;
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
	protected AccountsManagerImpl() {
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
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Account> getAccounts() {
		return accounts;
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
			Account account = new AccountImpl();
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
		if (accounts.containsKey(username)) {
			accounts.remove(username);
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
	 * @generated
	 */
	public String getAccountName(String username) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchAccounts(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Account getAccount(String username) {
		if (accounts.containsKey(username)) {
			return accounts.get(username);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS:
				if (coreType) return getAccounts();
				else return getAccounts().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS:
				((EStructuralFeature.Setting)getAccounts()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS:
				getAccounts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IAccountsAccess.class) {
			switch (baseOperationID) {
				case AccountsPackage.IACCOUNTS_ACCESS___VALIDATE_ACCOUNT__STRING_STRING: return AccountsPackage.ACCOUNTS_MANAGER___VALIDATE_ACCOUNT__STRING_STRING;
				case AccountsPackage.IACCOUNTS_ACCESS___LOGIN__STRING_STRING: return AccountsPackage.ACCOUNTS_MANAGER___LOGIN__STRING_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AccountsPackage.ACCOUNTS_MANAGER___ADD_ACCOUNT__STRING_STRING_ACCOUNTTYPE:
				addAccount((String)arguments.get(0), (String)arguments.get(1), (AccountType)arguments.get(2));
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___DELETE_ACCOUNT__STRING:
				deleteAccount((String)arguments.get(0));
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___RENAME_ACCOUNT__STRING_STRING:
				renameAccount((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___CHANGE_PASSWORD__STRING_STRING:
				changePassword((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___GET_ACCOUNT_PASSWORD__STRING:
				return getAccountPassword((String)arguments.get(0));
			case AccountsPackage.ACCOUNTS_MANAGER___GET_ACCOUNT_NAME__STRING:
				return getAccountName((String)arguments.get(0));
			case AccountsPackage.ACCOUNTS_MANAGER___SEARCH_ACCOUNTS__STRING:
				return searchAccounts((String)arguments.get(0));
			case AccountsPackage.ACCOUNTS_MANAGER___VALIDATE_ACCOUNT__STRING_STRING:
				return validateAccount((String)arguments.get(0), (String)arguments.get(1));
			case AccountsPackage.ACCOUNTS_MANAGER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccountsManagerImpl
