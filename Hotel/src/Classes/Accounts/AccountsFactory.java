/**
 */
package Classes.Accounts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Accounts.AccountsPackage
 * @generated
 */
public interface AccountsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	AccountsFactory eINSTANCE = Classes.Accounts.impl.AccountsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();
} //AccountsFactory
