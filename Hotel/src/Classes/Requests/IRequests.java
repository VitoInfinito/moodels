/**
 */
package Classes.Requests;

import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

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
public interface IRequests extends Serializable {
	
	IRequests INSTANCE = Classes.Requests.RequestsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a request such that request.id == id
	 * 			the non null description of the request is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	String getRequestDescription(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a request such that request.id == id
	 * 			the non null resolved status of the request is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	boolean hasRequestBeenResolved(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a request such that request.id == id
	 * 			the resolved status of the request is set to resolved
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * @throws InvalidIDException 
	 * @model SpecialRequestIdDataType="org.eclipse.uml2.types.String" SpecialRequestIdRequired="true" SpecialRequestIdOrdered="false"
	 * @generated
	 */
	void setRequestResolved(String SpecialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		that the request r with r.id == id are no more
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false"
	 * @generated
	 */
	void deleteRequest(String specialRequestId) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		desc != null
	 * Ensures:
	 * 		if there exists a request such that request.id == id
	 * 			the desc of the request is set to the desc
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void changeRequestDesc(String specialRequestId, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		//TODO
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRequests(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		if there are more than zero stored request
	 * 			return a list of all the stored request IDs
	 * 		otherwise
	 * 			return an empty list
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllRequestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		desc != null
	 * Ensures:
	 * 		if there exists a request such that request.id == id
	 * 			the desc of the request is set to the desc
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void setRequestDescription(String specialRequestId, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		desc != null
	 * Ensures:
	 * 		that there are a request r with r.desc == desc
	 * <!-- end-user-doc -->
	 * @return 
	 * @model specialRequestIdDataType="org.eclipse.uml2.types.String" specialRequestIdRequired="true" specialRequestIdOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	String addRequest(String description);

} // IRequests
