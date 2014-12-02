/**
 */
package Classes.Banking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Banking.BankingPackage#getCustomerProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomerProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	boolean makePayment(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean isCreditCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

} // CustomerProvides
