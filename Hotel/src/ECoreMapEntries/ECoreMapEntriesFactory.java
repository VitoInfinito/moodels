/**
 */
package ECoreMapEntries;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ECoreMapEntries.ECoreMapEntriesPackage
 * @generated
 */
public interface ECoreMapEntriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ECoreMapEntriesFactory eINSTANCE = ECoreMapEntries.impl.ECoreMapEntriesFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ECoreMapEntriesPackage getECoreMapEntriesPackage();

} //ECoreMapEntriesFactory
