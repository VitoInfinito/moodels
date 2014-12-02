/**
 */
package Classes.Accounts.impl;

import Classes.Accounts.Account;
import Classes.Accounts.AccountsManager;
import Classes.Accounts.AccountsPackage;
import Classes.Accounts.IAccountsAccess;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Accounts.impl.AccountsManagerImpl#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountsManagerImpl extends MinimalEObjectImpl.Container implements AccountsManager {
	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> account;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountsManagerImpl() {
		super();
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
	 * @generated
	 */
	public EList<Account> getAccount() {
		if (account == null) {
			account = new EObjectResolvingEList<Account>(Account.class, this, AccountsPackage.ACCOUNTS_MANAGER__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAccount(String username, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAccount(String username) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void renameAccount(String oldUsername, String newUsername) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changePassword(String newPassword, String username) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAccountPassword() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(String username, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean login(String username, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNT:
				return getAccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Account>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNT:
				getAccount().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountsPackage.ACCOUNTS_MANAGER__ACCOUNT:
				return account != null && !account.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
			case AccountsPackage.ACCOUNTS_MANAGER___ADD_ACCOUNT__STRING_STRING:
				addAccount((String)arguments.get(0), (String)arguments.get(1));
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
			case AccountsPackage.ACCOUNTS_MANAGER___GET_ACCOUNT_PASSWORD:
				getAccountPassword();
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___GET_ACCOUNTS:
				getAccounts();
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___SEARCH_ACCOUNTS:
				searchAccounts();
				return null;
			case AccountsPackage.ACCOUNTS_MANAGER___VALIDATE_ACCOUNT__STRING_STRING:
				return validateAccount((String)arguments.get(0), (String)arguments.get(1));
			case AccountsPackage.ACCOUNTS_MANAGER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccountsManagerImpl
