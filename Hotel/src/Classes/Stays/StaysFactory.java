/**
 */
package Classes.Stays;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaysFactory implements Serializable {
	private static final long serialVersionUID = 4161660296629896515L;
	static StaysFactory INSTANCE = new StaysFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StaysFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stay createStay() {
		Stay stay = new Stay();
		return stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard createCreditCard() {
		CreditCard creditCard = new CreditCard();
		return creditCard;
	}
} //StaysFactoryImpl
