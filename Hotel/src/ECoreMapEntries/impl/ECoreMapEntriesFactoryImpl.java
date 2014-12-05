/**
 */
package ECoreMapEntries.impl;

import Classes.Bookables.Bookable;

import ECoreMapEntries.*;

import java.util.Map;

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
public class ECoreMapEntriesFactoryImpl extends EFactoryImpl implements ECoreMapEntriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECoreMapEntriesFactory init() {
		try {
			ECoreMapEntriesFactory theECoreMapEntriesFactory = (ECoreMapEntriesFactory)EPackage.Registry.INSTANCE.getEFactory(ECoreMapEntriesPackage.eNS_URI);
			if (theECoreMapEntriesFactory != null) {
				return theECoreMapEntriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ECoreMapEntriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreMapEntriesFactoryImpl() {
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
			case ECoreMapEntriesPackage.STRING_TO_BOOKABLE_MAP: return (EObject)createStringToBookableMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Bookable> createStringToBookableMap() {
		StringToBookableMapImpl stringToBookableMap = new StringToBookableMapImpl();
		return stringToBookableMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreMapEntriesPackage getECoreMapEntriesPackage() {
		return (ECoreMapEntriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ECoreMapEntriesPackage getPackage() {
		return ECoreMapEntriesPackage.eINSTANCE;
	}

} //ECoreMapEntriesFactoryImpl
