/**
 */
package Classes.Staff;

import Classes.Statistics.IStatisticsGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Staff.StaffManager#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.Staff.StaffManager#getIStatisticsGenerator <em>IStatistics Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Staff.StaffPackage#getStaffManager()
 * @model
 * @generated
 */
public interface StaffManager extends IStaff {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link Classes.Staff.Staff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see Classes.Staff.StaffPackage#getStaffManager_Staff()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Staff> getStaff();

	/**
	 * Returns the value of the '<em><b>IStatistics Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IStatistics Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IStatistics Generator</em>' reference.
	 * @see #setIStatisticsGenerator(IStatisticsGenerator)
	 * @see Classes.Staff.StaffPackage#getStaffManager_IStatisticsGenerator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IStatisticsGenerator getIStatisticsGenerator();

	/**
	 * Sets the value of the '{@link Classes.Staff.StaffManager#getIStatisticsGenerator <em>IStatistics Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IStatistics Generator</em>' reference.
	 * @see #getIStatisticsGenerator()
	 * @generated
	 */
	void setIStatisticsGenerator(IStatisticsGenerator value);

} // StaffManager
