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
	int IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Set Request Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SET_REQUEST_RESOLVED = 2;

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
	int IREQUESTS___CHANGE_REQUEST_DESC__STRING = 4;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SEARCH_REQUESTS__STRING_ELIST = 5;

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
	int IREQUESTS___SET_REQUEST_DESCRIPTION = 7;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___ADD_REQUEST = 8;

	/**
	 * The number of operations of the '<em>IRequests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS_OPERATION_COUNT = 9;

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
	int REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED__BOOLEAN = IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Request Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SET_REQUEST_RESOLVED = IREQUESTS___SET_REQUEST_RESOLVED;

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
	int REQUESTS_MANAGER___CHANGE_REQUEST_DESC__STRING = IREQUESTS___CHANGE_REQUEST_DESC__STRING;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SEARCH_REQUESTS__STRING_ELIST = IREQUESTS___SEARCH_REQUESTS__STRING_ELIST;

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
	int REQUESTS_MANAGER___SET_REQUEST_DESCRIPTION = IREQUESTS___SET_REQUEST_DESCRIPTION;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___ADD_REQUEST = IREQUESTS___ADD_REQUEST;

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
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#hasRequestBeenResolved(boolean) <em>Has Request Been Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Request Been Resolved</em>' operation.
	 * @see Classes.Requests.IRequests#hasRequestBeenResolved(boolean)
	 * @generated
	 */
	EOperation getIRequests__HasRequestBeenResolved__boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#setRequestResolved() <em>Set Request Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Request Resolved</em>' operation.
	 * @see Classes.Requests.IRequests#setRequestResolved()
	 * @generated
	 */
	EOperation getIRequests__SetRequestResolved();

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
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#changeRequestDesc(java.lang.String) <em>Change Request Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Request Desc</em>' operation.
	 * @see Classes.Requests.IRequests#changeRequestDesc(java.lang.String)
	 * @generated
	 */
	EOperation getIRequests__ChangeRequestDesc__String();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#searchRequests(java.lang.String, org.eclipse.emf.common.util.EList) <em>Search Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Requests</em>' operation.
	 * @see Classes.Requests.IRequests#searchRequests(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIRequests__SearchRequests__String_EList();

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
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#setRequestDescription() <em>Set Request Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Request Description</em>' operation.
	 * @see Classes.Requests.IRequests#setRequestDescription()
	 * @generated
	 */
	EOperation getIRequests__SetRequestDescription();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#addRequest() <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see Classes.Requests.IRequests#addRequest()
	 * @generated
	 */
	EOperation getIRequests__AddRequest();

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
		EOperation IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__BOOLEAN = eINSTANCE.getIRequests__HasRequestBeenResolved__boolean();

		/**
		 * The meta object literal for the '<em><b>Set Request Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SET_REQUEST_RESOLVED = eINSTANCE.getIRequests__SetRequestResolved();

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
		EOperation IREQUESTS___CHANGE_REQUEST_DESC__STRING = eINSTANCE.getIRequests__ChangeRequestDesc__String();

		/**
		 * The meta object literal for the '<em><b>Search Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SEARCH_REQUESTS__STRING_ELIST = eINSTANCE.getIRequests__SearchRequests__String_EList();

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
		EOperation IREQUESTS___SET_REQUEST_DESCRIPTION = eINSTANCE.getIRequests__SetRequestDescription();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___ADD_REQUEST = eINSTANCE.getIRequests__AddRequest();

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
