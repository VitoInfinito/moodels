/**
 */
package Classes.Requests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRequests</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Requests.RequestsPackage#getIRequests()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRequests extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	String getRequestDescription(String specialRequestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void hasRequestBeenResolved(boolean _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRequestResolved();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	void deleteRequest(String specialRequestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	void changeRequestDesc(String specialRequestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" _DataType="org.eclipse.uml2.types.String" _Many="true" _Ordered="false"
	 * @generated
	 */
	void searchRequests(String specialRequestId, EList<String> _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllRequestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRequestDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRequest();

} // IRequests
