/**
 */
package Classes.Guests.impl;

import Classes.Guests.*;

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
public class GuestsFactoryImpl extends EFactoryImpl implements GuestsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuestsFactory init() {
		try {
			GuestsFactory theGuestsFactory = (GuestsFactory)EPackage.Registry.INSTANCE.getEFactory(GuestsPackage.eNS_URI);
			if (theGuestsFactory != null) {
				return theGuestsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuestsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private GuestsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EObject create(EClass eClass) {
		// NOT USED
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GuestsManager createGuestsManager() {
		// NOT USED
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GuestsPackage getGuestsPackage() {
		// NOT USED
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Deprecated
	public static GuestsPackage getPackage() {
		// NOT USED
		throw new UnsupportedOperationException();
	}

} //GuestsFactoryImpl
