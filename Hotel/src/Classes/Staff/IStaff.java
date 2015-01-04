/**
 */
package Classes.Staff;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Staff.StaffPackage#getIStaff()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
@NonNullByDefault
public interface IStaff extends Serializable {
	
	IStaff INSTANCE = Classes.Staff.StaffManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		if there are more than zero staff
	 * 			return a list of all the staffs SSIDs
	 * 		otherwise
	 * 			return an empty list
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllStaff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchStaff(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null first name of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffFirstName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null last name of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffLastName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null job of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffJob(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null phone number of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffPhone(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null email of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffEmail(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null contract type of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getStaffSalaryContractType(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the non null salary of the staff is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	double getStaffSalary(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		firstname != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the firstname of the staff is set to the firstname
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeStaffFirstName(String SSID, String firstName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		lastname != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the lastname of the staff is set to the lastname
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeStaffLastName(String SSID, String lastName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		job != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the job of the staff is set to the job
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" jobRequired="true" jobOrdered="false"
	 * @generated
	 */
	void changeStaffJob(String SSID, String job) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		phone != null
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the phone of the staff is set to the phone
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false"
	 * @generated
	 */
	void changeStaffPhone(String SSID, String phoneNumber) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		salaryContractType == "Monthly" || "Hourly"
	 * Ensures:
	 * 		if there exists a staff such that staff.ssid == ssid
	 * 			the contract type of the staff is set to salaryContractType
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" salaryContractRequired="true" salaryContractOrdered="false"
	 * @generated
	 */
	void changeStaffSalaryContract(String SSID, String salaryContractType) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		that the staff s with s.ssid == ssid are no more
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDRequired="true" SSIDOrdered="false" salaryContractRequired="true" salaryContractOrdered="false"
	 * @generated
	 */
	void removeStaff(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, List<String>> scheduleStaff(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		firstname	!= null
	 * 		lastname 	!= null
	 * 		job 		!= null
	 * 		phone 		!= null
	 * 		email 		!= null
	 * 		SSID 		!= null
	 * 		contract 	!= null
	 * 		salary 		!= null
	 * Ensures:
	 * 		if there doesn't exists a staff such that staff.ssid == ssid
	 * 			that there are a staff s with
	 * 				s.firstname	== firstname
	 * 				s.lastname 	== lastname
	 * 				s.job 		== job
	 * 				s.phone 	== phone
	 * 				s.email		== email
	 * 				s.SSID 		== SSID
	 * 				s.contract	== contract
	 * 				s.salary 	== salary
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" jobDataType="org.eclipse.uml2.types.String" jobRequired="true" jobOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" salaryContractTypeDataType="org.eclipse.uml2.types.String" salaryContractTypeRequired="true" salaryContractTypeOrdered="false" salaryRequired="true" salaryOrdered="false"
	 * @generated
	 */
	void addEmployee(String firstname, String lastname, String job, String phone, String email, String SSID, String salaryContractType, double salary) throws InvalidIDException;

} // IStaff
