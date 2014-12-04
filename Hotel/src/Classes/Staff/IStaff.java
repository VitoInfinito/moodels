/**
 */
package Classes.Staff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Staff.StaffPackage#getIStaff()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStaff extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllStaff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void searchStaff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffFirstName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffLastName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffJob(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffPhone(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffEmail(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffSalaryContractType(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void getStaffSalary(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeStaffFirstName(String SSID, String firstName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeStaffLastName(String SSID, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false" jobRequired="true" jobOrdered="false"
	 * @generated
	 */
	void changeStaffJob(String SSID, String job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false"
	 * @generated
	 */
	void changeStaffPhone(String SSID, String phoneNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDRequired="true" SSIDOrdered="false" salaryContractRequired="true" salaryContractOrdered="false"
	 * @generated
	 */
	void changeStaffSalaryContract(String SSID, String salaryContract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void scheduleStaff();

} // IStaff
