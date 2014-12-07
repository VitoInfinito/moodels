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
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	boolean hasRequestBeenResolved(String specialRequestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SpecialRequestIdDataType="org.eclipse.uml2.types.String" SpecialRequestIdRequired="true" SpecialRequestIdOrdered="false"
	 * @generated
	 */
	void setRequestResolved(String SpecialRequestId);

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
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void changeRequestDesc(String specialRequestId, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	EList<String> searchRequests(String specialRequestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getAllRequestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void setRequestDescription(String specialRequestId, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addRequest(String specialRequestId, String description);

} // IRequests
