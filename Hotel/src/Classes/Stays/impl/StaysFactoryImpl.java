/**
 */
package Classes.Stays.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Stays.CreditCard;
import Classes.Stays.Stay;
import Classes.Stays.StaysFactory;
import Classes.Stays.StaysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaysFactoryImpl extends EFactoryImpl implements StaysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaysFactory init() {
		try {
			StaysFactory theStaysFactory = (StaysFactory)EPackage.Registry.INSTANCE.getEFactory(StaysPackage.eNS_URI);
			if (theStaysFactory != null) {
				return theStaysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StaysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stay createStay() {
		StayImpl stay = new StayImpl();
		return stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard createCreditCard() {
		CreditCardImpl creditCard = new CreditCardImpl();
		return creditCard;
	}
} //StaysFactoryImpl
