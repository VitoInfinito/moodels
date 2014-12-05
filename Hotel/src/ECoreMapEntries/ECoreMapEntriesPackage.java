/**
 */
package ECoreMapEntries;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ECoreMapEntries.ECoreMapEntriesFactory
 * @model kind="package"
 * @generated
 */
public interface ECoreMapEntriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ECoreMapEntries";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "null";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "null";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ECoreMapEntriesPackage eINSTANCE = ECoreMapEntries.impl.ECoreMapEntriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ECoreMapEntries.impl.StringToBookableMapImpl <em>String To Bookable Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ECoreMapEntries.impl.StringToBookableMapImpl
	 * @see ECoreMapEntries.impl.ECoreMapEntriesPackageImpl#getStringToBookableMap()
	 * @generated
	 */
	int STRING_TO_BOOKABLE_MAP = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOKABLE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOKABLE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Bookable Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOKABLE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Bookable Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOKABLE_MAP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Bookable Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Bookable Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.uml2.types.String"
	 *        valueType="Classes.Bookables.Bookable"
	 * @generated
	 */
	EClass getStringToBookableMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBookableMap()
	 * @generated
	 */
	EAttribute getStringToBookableMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBookableMap()
	 * @generated
	 */
	EReference getStringToBookableMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ECoreMapEntriesFactory getECoreMapEntriesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ECoreMapEntries.impl.StringToBookableMapImpl <em>String To Bookable Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ECoreMapEntries.impl.StringToBookableMapImpl
		 * @see ECoreMapEntries.impl.ECoreMapEntriesPackageImpl#getStringToBookableMap()
		 * @generated
		 */
		EClass STRING_TO_BOOKABLE_MAP = eINSTANCE.getStringToBookableMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BOOKABLE_MAP__KEY = eINSTANCE.getStringToBookableMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_BOOKABLE_MAP__VALUE = eINSTANCE.getStringToBookableMap_Value();

	}

} //ECoreMapEntriesPackage
