/**
 */
package Classes.Staff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Staff.Staff#getSalaryContract <em>Salary Contract</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getJob <em>Job</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getPhone <em>Phone</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Staff.Staff#getSsid <em>Ssid</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Staff.StaffPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Salary Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary Contract</em>' reference.
	 * @see #setSalaryContract(SalaryContract)
	 * @see Classes.Staff.StaffPackage#getStaff_SalaryContract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SalaryContract getSalaryContract();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getSalaryContract <em>Salary Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary Contract</em>' reference.
	 * @see #getSalaryContract()
	 * @generated
	 */
	void setSalaryContract(SalaryContract value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see Classes.Staff.StaffPackage#getStaff_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see Classes.Staff.StaffPackage#getStaff_LastName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' attribute.
	 * @see #setJob(String)
	 * @see Classes.Staff.StaffPackage#getStaff_Job()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getJob();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getJob <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' attribute.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see Classes.Staff.StaffPackage#getStaff_Phone()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Classes.Staff.StaffPackage#getStaff_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see Classes.Staff.StaffPackage#getStaff_Ssid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link Classes.Staff.Staff#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSSID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLastName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPhone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEmail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSalaryContract();

} // Staff
