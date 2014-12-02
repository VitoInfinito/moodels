/**
 */
package Classes.Statistics;

import Classes.Bills.IBills;

import Classes.Bookings.IBookings;

import Classes.Staff.IStaff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Statistics.StatisticsGenerator#getIBillsAccess <em>IBills Access</em>}</li>
 *   <li>{@link Classes.Statistics.StatisticsGenerator#getIBooking <em>IBooking</em>}</li>
 *   <li>{@link Classes.Statistics.StatisticsGenerator#getIStaff <em>IStaff</em>}</li>
 *   <li>{@link Classes.Statistics.StatisticsGenerator#getStaticExpenses <em>Static Expenses</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Statistics.StatisticsPackage#getStatisticsGenerator()
 * @model
 * @generated
 */
public interface StatisticsGenerator extends IStatisticsGenerator {
	/**
	 * Returns the value of the '<em><b>IBills Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBills Access</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBills Access</em>' reference.
	 * @see #setIBillsAccess(IBills)
	 * @see Classes.Statistics.StatisticsPackage#getStatisticsGenerator_IBillsAccess()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBills getIBillsAccess();

	/**
	 * Sets the value of the '{@link Classes.Statistics.StatisticsGenerator#getIBillsAccess <em>IBills Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBills Access</em>' reference.
	 * @see #getIBillsAccess()
	 * @generated
	 */
	void setIBillsAccess(IBills value);

	/**
	 * Returns the value of the '<em><b>IBooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking</em>' reference.
	 * @see #setIBooking(IBookings)
	 * @see Classes.Statistics.StatisticsPackage#getStatisticsGenerator_IBooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookings getIBooking();

	/**
	 * Sets the value of the '{@link Classes.Statistics.StatisticsGenerator#getIBooking <em>IBooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking</em>' reference.
	 * @see #getIBooking()
	 * @generated
	 */
	void setIBooking(IBookings value);

	/**
	 * Returns the value of the '<em><b>IStaff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IStaff</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IStaff</em>' reference.
	 * @see #setIStaff(IStaff)
	 * @see Classes.Statistics.StatisticsPackage#getStatisticsGenerator_IStaff()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IStaff getIStaff();

	/**
	 * Sets the value of the '{@link Classes.Statistics.StatisticsGenerator#getIStaff <em>IStaff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IStaff</em>' reference.
	 * @see #getIStaff()
	 * @generated
	 */
	void setIStaff(IStaff value);

	/**
	 * Returns the value of the '<em><b>Static Expenses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Expenses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Expenses</em>' attribute.
	 * @see #setStaticExpenses(double)
	 * @see Classes.Statistics.StatisticsPackage#getStatisticsGenerator_StaticExpenses()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getStaticExpenses();

	/**
	 * Sets the value of the '{@link Classes.Statistics.StatisticsGenerator#getStaticExpenses <em>Static Expenses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Expenses</em>' attribute.
	 * @see #getStaticExpenses()
	 * @generated
	 */
	void setStaticExpenses(double value);

} // StatisticsGenerator
