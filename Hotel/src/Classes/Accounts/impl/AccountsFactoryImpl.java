/**
 */
package Classes.Accounts.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Accounts.Account;
import Classes.Accounts.AccountType;
import Classes.Accounts.AccountsFactory;
import Classes.Accounts.AccountsManager;
import Classes.Accounts.AccountsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsFactoryImpl extends EFactoryImpl implements AccountsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountsFactory init() {
		try {
			AccountsFactory theAccountsFactory = (AccountsFactory)EPackage.Registry.INSTANCE.getEFactory(AccountsPackage.eNS_URI);
			if (theAccountsFactory != null) {
				return theAccountsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EObject create(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccountsManager createAccountsManager() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccountType createAccountTypeFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertAccountTypeToString(EDataType eDataType, Object instanceValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccountsPackage getAccountsPackage() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Deprecated
	public static AccountsPackage getPackage() {
		throw new UnsupportedOperationException();
	}

} //AccountsFactoryImpl
