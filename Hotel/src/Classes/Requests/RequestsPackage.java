/**
 */
package Classes.Requests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Requests.RequestsFactory
 * @model kind="package"
 * @generated
 */
public interface RequestsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Requests";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Requests.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Requests";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestsPackage eINSTANCE = Classes.Requests.impl.RequestsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Requests.IRequests <em>IRequests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Requests.IRequests
	 * @see Classes.Requests.impl.RequestsPackageImpl#getIRequests()
	 * @generated
	 */
	int IREQUESTS = 0;

	/**
	 * The number of structural features of the '<em>IRequests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Request Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___GET_REQUEST_DESCRIPTION__STRING = 0;

	/**
	 * The operation id for the '<em>Has Request Been Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__STRING = 1;

	/**
	 * The operation id for the '<em>Set Request Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SET_REQUEST_RESOLVED__STRING = 2;

	/**
	 * The operation id for the '<em>Delete Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___DELETE_REQUEST__STRING = 3;

	/**
	 * The operation id for the '<em>Change Request Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___CHANGE_REQUEST_DESC__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SEARCH_REQUESTS__STRING = 5;

	/**
	 * The operation id for the '<em>Get All Request IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___GET_ALL_REQUEST_IDS = 6;

	/**
	 * The operation id for the '<em>Set Request Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SET_REQUEST_DESCRIPTION__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___ADD_REQUEST__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Create Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___CREATE_REQUEST__STRING = 9;

	/**
	 * The number of operations of the '<em>IRequests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link Classes.Requests.impl.RequestsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Requests.impl.RequestsManagerImpl
	 * @see Classes.Requests.impl.RequestsPackageImpl#getRequestsManager()
	 * @generated
	 */
	int REQUESTS_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Special Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER__SPECIAL_REQUEST = IREQUESTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER_FEATURE_COUNT = IREQUESTS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Request Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___GET_REQUEST_DESCRIPTION__STRING = IREQUESTS___GET_REQUEST_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Has Request Been Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED__STRING = IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__STRING;

	/**
	 * The operation id for the '<em>Set Request Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SET_REQUEST_RESOLVED__STRING = IREQUESTS___SET_REQUEST_RESOLVED__STRING;

	/**
	 * The operation id for the '<em>Delete Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___DELETE_REQUEST__STRING = IREQUESTS___DELETE_REQUEST__STRING;

	/**
	 * The operation id for the '<em>Change Request Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___CHANGE_REQUEST_DESC__STRING_STRING = IREQUESTS___CHANGE_REQUEST_DESC__STRING_STRING;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SEARCH_REQUESTS__STRING = IREQUESTS___SEARCH_REQUESTS__STRING;

	/**
	 * The operation id for the '<em>Get All Request IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___GET_ALL_REQUEST_IDS = IREQUESTS___GET_ALL_REQUEST_IDS;

	/**
	 * The operation id for the '<em>Set Request Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SET_REQUEST_DESCRIPTION__STRING_STRING = IREQUESTS___SET_REQUEST_DESCRIPTION__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___ADD_REQUEST__STRING_STRING = IREQUESTS___ADD_REQUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Create Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___CREATE_REQUEST__STRING = IREQUESTS___CREATE_REQUEST__STRING;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER_OPERATION_COUNT = IREQUESTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Requests.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Requests.impl.RequestImpl
	 * @see Classes.Requests.impl.RequestsPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__IS_RESOLVED = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Classes.Requests.IRequests <em>IRequests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRequests</em>'.
	 * @see Classes.Requests.IRequests
	 * @generated
	 */
	EClass getIRequests();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#getRequestDescription(java.lang.String) <em>Get Request Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Request Description</em>' operation.
	 * @see Classes.Requests.IRequests#getRequestDescription(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__GetRequestDescription__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#hasRequestBeenResolved(java.lang.String) <em>Has Request Been Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Request Been Resolved</em>' operation.
	 * @see Classes.Requests.IRequests#hasRequestBeenResolved(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__HasRequestBeenResolved__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#setRequestResolved(java.lang.String) <em>Set Request Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Request Resolved</em>' operation.
	 * @see Classes.Requests.IRequests#setRequestResolved(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__SetRequestResolved__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#deleteRequest(java.lang.String) <em>Delete Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Request</em>' operation.
	 * @see Classes.Requests.IRequests#deleteRequest(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__DeleteRequest__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#changeRequestDesc(java.lang.String, java.lang.String) <em>Change Request Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Request Desc</em>' operation.
	 * @see Classes.Requests.IRequests#changeRequestDesc(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__ChangeRequestDesc__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#searchRequests(java.lang.String) <em>Search Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Requests</em>' operation.
	 * @see Classes.Requests.IRequests#searchRequests(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__SearchRequests__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#getAllRequestIDs() <em>Get All Request IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Request IDs</em>' operation.
	 * @see Classes.Requests.IRequests#getAllRequestIDs()
	 * @generated
	 */
	EOperation getIRequests__GetAllRequestIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#setRequestDescription(java.lang.String, java.lang.String) <em>Set Request Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Request Description</em>' operation.
	 * @see Classes.Requests.IRequests#setRequestDescription(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__SetRequestDescription__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#addRequest(java.lang.String, java.lang.String) <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see Classes.Requests.IRequests#addRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__AddRequest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#createRequest(java.lang.String) <em>Create Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Request</em>' operation.
	 * @see Classes.Requests.IRequests#createRequest(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__CreateRequest__String();

	/**
	 * Returns the meta object for class '{@link Classes.Requests.RequestsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Requests.RequestsManager
	 * @generated
	 */
	EClass getRequestsManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Requests.RequestsManager#getSpecialRequest <em>Special Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Special Request</em>'.
	 * @see Classes.Requests.RequestsManager#getSpecialRequest()
	 * @see #getRequestsManager()
	 * @generated
	 */
	EReference getRequestsManager_SpecialRequest();

	/**
	 * Returns the meta object for class '{@link Classes.Requests.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see Classes.Requests.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Requests.Request#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Requests.Request#getId()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Requests.Request#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.Requests.Request#getDescription()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Description();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Requests.Request#isResolved <em>Is Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Resolved</em>'.
	 * @see Classes.Requests.Request#isResolved()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_IsResolved();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequestsFactory getRequestsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Requests.IRequests <em>IRequests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Requests.IRequests
		 * @see Classes.Requests.impl.RequestsPackageImpl#getIRequests()
		 * @generated
		 */
		EClass IREQUESTS = eINSTANCE.getIRequests();

		/**
		 * The meta object literal for the '<em><b>Get Request Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___GET_REQUEST_DESCRIPTION__STRING = eINSTANCE.getIRequests__GetRequestDescription__String();

		/**
		 * The meta object literal for the '<em><b>Has Request Been Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__STRING = eINSTANCE.getIRequests__HasRequestBeenResolved__String();

		/**
		 * The meta object literal for the '<em><b>Set Request Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SET_REQUEST_RESOLVED__STRING = eINSTANCE.getIRequests__SetRequestResolved__String();

		/**
		 * The meta object literal for the '<em><b>Delete Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___DELETE_REQUEST__STRING = eINSTANCE.getIRequests__DeleteRequest__String();

		/**
		 * The meta object literal for the '<em><b>Change Request Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___CHANGE_REQUEST_DESC__STRING_STRING = eINSTANCE.getIRequests__ChangeRequestDesc__String_String();

		/**
		 * The meta object literal for the '<em><b>Search Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SEARCH_REQUESTS__STRING = eINSTANCE.getIRequests__SearchRequests__String();

		/**
		 * The meta object literal for the '<em><b>Get All Request IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___GET_ALL_REQUEST_IDS = eINSTANCE.getIRequests__GetAllRequestIDs();

		/**
		 * The meta object literal for the '<em><b>Set Request Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SET_REQUEST_DESCRIPTION__STRING_STRING = eINSTANCE.getIRequests__SetRequestDescription__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___ADD_REQUEST__STRING_STRING = eINSTANCE.getIRequests__AddRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___CREATE_REQUEST__STRING = eINSTANCE.getIRequests__CreateRequest__String();

		/**
		 * The meta object literal for the '{@link Classes.Requests.impl.RequestsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Requests.impl.RequestsManagerImpl
		 * @see Classes.Requests.impl.RequestsPackageImpl#getRequestsManager()
		 * @generated
		 */
		EClass REQUESTS_MANAGER = eINSTANCE.getRequestsManager();

		/**
		 * The meta object literal for the '<em><b>Special Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTS_MANAGER__SPECIAL_REQUEST = eINSTANCE.getRequestsManager_SpecialRequest();

		/**
		 * The meta object literal for the '{@link Classes.Requests.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Requests.impl.RequestImpl
		 * @see Classes.Requests.impl.RequestsPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ID = eINSTANCE.getRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__DESCRIPTION = eINSTANCE.getRequest_Description();

		/**
		 * The meta object literal for the '<em><b>Is Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__IS_RESOLVED = eINSTANCE.getRequest_IsResolved();

	}

} //RequestsPackage
