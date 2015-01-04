/**
 */
package Classes.Utils;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Utils.CreditCard#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link Classes.Utils.CreditCard#getCcv <em>Ccv</em>}</li>
 *   <li>{@link Classes.Utils.CreditCard#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link Classes.Utils.CreditCard#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link Classes.Utils.CreditCard#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.Utils.CreditCard#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreditCard implements Serializable {
	private static final long serialVersionUID = 448100270906663086L;
	private String ccNumber;
	private String ccv;
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcNumber() {
		return ccNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcNumber(String newCcNumber) {
		ccNumber = newCcNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(String newCcv) {
		ccv = newCcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryMonth(int newExpiryMonth) {
		expiryMonth = newExpiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryYear() {
		return expiryYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryYear(int newExpiryYear) {
		expiryYear = newExpiryYear;
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
		firstName = newFirstName;
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
		lastName = newLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ccNumber: ");
		result.append(ccNumber);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(", expiryMonth: ");
		result.append(expiryMonth);
		result.append(", expiryYear: ");
		result.append(expiryYear);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //CreditCardImpl
