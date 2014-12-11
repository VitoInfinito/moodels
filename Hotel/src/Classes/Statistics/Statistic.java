/**
 */
package Classes.Statistics;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Statistics.Statistic#getType <em>Type</em>}</li>
 *   <li>{@link Classes.Statistics.Statistic#getStatisticEntry <em>Statistic Entry</em>}</li>
 *   <li>{@link Classes.Statistics.Statistic#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Classes.Statistics.Statistic#getToDate <em>To Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Statistics.StatisticsPackage#getStatistic()
 * @model
 * @generated
 */
public interface Statistic extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Classes.Statistics.StatisticsPackage#getStatistic_Type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Statistic Entry</b></em>' reference list.
	 * The list contents are of type {@link Classes.Statistics.StatisticEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistic Entry</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic Entry</em>' reference list.
	 * @see Classes.Statistics.StatisticsPackage#getStatistic_StatisticEntry()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='statistic Entry'"
	 * @generated
	 */
	EList<StatisticEntry> getStatisticEntry();

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' reference.
	 * @see #setFromDate(Date)
	 * @see Classes.Statistics.StatisticsPackage#getStatistic_FromDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link Classes.Statistics.Statistic#getFromDate <em>From Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' reference.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' reference.
	 * @see #setToDate(Date)
	 * @see Classes.Statistics.StatisticsPackage#getStatistic_ToDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link Classes.Statistics.Statistic#getToDate <em>To Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' reference.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

} // Statistic
