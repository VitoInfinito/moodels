/**
 */
package Classes.Staff;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

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
@NonNullByDefault
public interface IStaff extends EObject {
	
	IStaff INSTANCE = Classes.Staff.impl.StaffManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllStaff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchStaff(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffFirstName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffLastName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffJob(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffPhone(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffEmail(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffSalaryContractType(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	double getStaffSalary(String SSID);

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
	void changeStaffSalaryContract(String SSID, SalaryContract salaryContract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> scheduleStaff(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" jobDataType="org.eclipse.uml2.types.String" jobRequired="true" jobOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" salaryContractTypeDataType="org.eclipse.uml2.types.String" salaryContractTypeRequired="true" salaryContractTypeOrdered="false" salaryRequired="true" salaryOrdered="false"
	 * @generated
	 */
	void addEmployee(String firstname, String lastname, String job, String phone, String email, String SSID, String salaryContractType, double salary);

} // IStaff
