/**
 */
package Classes.Requests;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.InvalidIDException;

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
@NonNullByDefault
public interface IRequests extends EObject {
	
	IRequests INSTANCE = Classes.Requests.impl.RequestsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	String getRequestDescription(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	boolean hasRequestBeenResolved(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SpecialRequestIdDataType="org.eclipse.uml2.types.String" SpecialRequestIdRequired="true" SpecialRequestIdOrdered="false"
	 * @generated
	 */
	void setRequestResolved(String SpecialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	void deleteRequest(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void changeRequestDesc(String specialRequestId, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRequests(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllRequestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void setRequestDescription(String specialRequestId, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	String addRequest(String description);

} // IRequests
