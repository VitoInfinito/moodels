/**
 */
package Classes.Stays.impl;

import Classes.Stays.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
	public StaysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StaysPackage.STAY: return createStay();
			case StaysPackage.CREDIT_CARD: return createCreditCard();
			case StaysPackage.STAYS_MANAGER: return createStaysManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaysManager createStaysManager() {
		return StaysManagerImpl.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaysPackage getStaysPackage() {
		return (StaysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaysPackage getPackage() {
		return StaysPackage.eINSTANCE;
	}

} //StaysFactoryImpl
