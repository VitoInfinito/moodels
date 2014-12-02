/**
 */
package Classes.Statistics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Statistics.StatisticEntry#getValue <em>Value</em>}</li>
 *   <li>{@link Classes.Statistics.StatisticEntry#getDateOfEntry <em>Date Of Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Statistics.StatisticsPackage#getStatisticEntry()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Statistic Entry'"
 * @generated
 */
public interface StatisticEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see Classes.Statistics.StatisticsPackage#getStatisticEntry_Value()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Returns the value of the '<em><b>Date Of Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Entry</em>' reference.
	 * @see #setDateOfEntry(Date)
	 * @see Classes.Statistics.StatisticsPackage#getStatisticEntry_DateOfEntry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateOfEntry();

	/**
	 * Sets the value of the '{@link Classes.Statistics.StatisticEntry#getDateOfEntry <em>Date Of Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Entry</em>' reference.
	 * @see #getDateOfEntry()
	 * @generated
	 */
	void setDateOfEntry(Date value);

} // StatisticEntry
