/**
 */
package Classes.Staff.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Staff.SalaryContract;
import Classes.Staff.Staff;
import Classes.Staff.StaffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffImpl extends MinimalEObjectImpl.Container implements Staff {

	private SalaryContract salaryContract;
	private String firstName;
	private String lastName;
	private String job;
	private String phone;
	private String email;
	private String ssid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalaryContract getSalaryContract() {
		if (salaryContract != null && salaryContract.eIsProxy()) {
			InternalEObject oldSalaryContract = (InternalEObject)salaryContract;
			salaryContract = (SalaryContract)eResolveProxy(oldSalaryContract);
			if (salaryContract != oldSalaryContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaffPackage.STAFF__SALARY_CONTRACT, oldSalaryContract, salaryContract));
			}
		}
		return salaryContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalaryContract basicGetSalaryContract() {
		return salaryContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalaryContract(SalaryContract newSalaryContract) {
		SalaryContract oldSalaryContract = salaryContract;
		salaryContract = newSalaryContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__SALARY_CONTRACT, oldSalaryContract, salaryContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJob(String newJob) {
		String oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__JOB, oldJob, job));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsid(String newSsid) {
		String oldSsid = ssid;
		ssid = newSsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF__SSID, oldSsid, ssid));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", job: ");
		result.append(job);
		result.append(", phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(", ssid: ");
		result.append(ssid);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
