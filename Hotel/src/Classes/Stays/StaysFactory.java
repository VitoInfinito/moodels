/**
 */
package Classes.Stays;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Stays.StaysPackage
 * @generated
 */
public interface StaysFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaysFactory eINSTANCE = Classes.Stays.impl.StaysFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stay</em>'.
	 * @generated
	 */
	Stay createStay();

	/**
	 * Returns a new object of class '<em>Credit Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card</em>'.
	 * @generated
	 */
	CreditCard createCreditCard();
} //StaysFactory
