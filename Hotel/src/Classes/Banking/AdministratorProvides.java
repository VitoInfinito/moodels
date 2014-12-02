/**
 */
package Classes.Banking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Banking.BankingPackage#getAdministratorProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdministratorProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean addCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean removeCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	double getBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

} // AdministratorProvides
