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
	int IREQUESTS___GET_REQUEST_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Has Request Been Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___HAS_REQUEST_BEEN_RESOLVED = 1;

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
	int IREQUESTS___DELETE_REQUEST = 3;

	/**
	 * The operation id for the '<em>Change Request Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___CHANGE_REQUEST_DESC = 4;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUESTS___SEARCH_REQUESTS = 5;

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
	int REQUESTS_MANAGER___GET_REQUEST_DESCRIPTION = IREQUESTS___GET_REQUEST_DESCRIPTION;

	/**
	 * The operation id for the '<em>Has Request Been Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED = IREQUESTS___HAS_REQUEST_BEEN_RESOLVED;

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
	int REQUESTS_MANAGER___DELETE_REQUEST = IREQUESTS___DELETE_REQUEST;

	/**
	 * The operation id for the '<em>Change Request Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___CHANGE_REQUEST_DESC = IREQUESTS___CHANGE_REQUEST_DESC;

	/**
	 * The operation id for the '<em>Search Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTS_MANAGER___SEARCH_REQUESTS = IREQUESTS___SEARCH_REQUESTS;

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
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___GET_DESC = 1;

	/**
	 * The operation id for the '<em>Get Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___GET_IS_RESOLVED = 2;

	/**
	 * The operation id for the '<em>Set Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___SET_DESC = 3;

	/**
	 * The operation id for the '<em>Set Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___SET_IS_RESOLVED = 4;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 5;


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
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#getRequestDescription() <em>Get Request Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Request Description</em>' operation.
	 * @see Classes.Requests.IRequests#getRequestDescription()
	 * @generated
	 */
	EOperation getIRequests__GetRequestDescription();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#hasRequestBeenResolved() <em>Has Request Been Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Request Been Resolved</em>' operation.
	 * @see Classes.Requests.IRequests#hasRequestBeenResolved()
	 * @generated
	 */
	EOperation getIRequests__HasRequestBeenResolved();

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
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#deleteRequest() <em>Delete Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Request</em>' operation.
	 * @see Classes.Requests.IRequests#deleteRequest()
	 * @generated
	 */
	EOperation getIRequests__DeleteRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#changeRequestDesc() <em>Change Request Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Request Desc</em>' operation.
	 * @see Classes.Requests.IRequests#changeRequestDesc()
	 * @generated
	 */
	EOperation getIRequests__ChangeRequestDesc();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.IRequests#searchRequests() <em>Search Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Requests</em>' operation.
	 * @see Classes.Requests.IRequests#searchRequests()
	 * @generated
	 */
	EOperation getIRequests__SearchRequests();

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
	 * Returns the meta object for the '{@link Classes.Requests.Request#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see Classes.Requests.Request#getID()
	 * @generated
	 */
	EOperation getRequest__GetID();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.Request#getDesc() <em>Get Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Desc</em>' operation.
	 * @see Classes.Requests.Request#getDesc()
	 * @generated
	 */
	EOperation getRequest__GetDesc();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.Request#getIsResolved() <em>Get Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Is Resolved</em>' operation.
	 * @see Classes.Requests.Request#getIsResolved()
	 * @generated
	 */
	EOperation getRequest__GetIsResolved();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.Request#setDesc() <em>Set Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Desc</em>' operation.
	 * @see Classes.Requests.Request#setDesc()
	 * @generated
	 */
	EOperation getRequest__SetDesc();

	/**
	 * Returns the meta object for the '{@link Classes.Requests.Request#setIsResolved() <em>Set Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Resolved</em>' operation.
	 * @see Classes.Requests.Request#setIsResolved()
	 * @generated
	 */
	EOperation getRequest__SetIsResolved();

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
		EOperation IREQUESTS___GET_REQUEST_DESCRIPTION = eINSTANCE.getIRequests__GetRequestDescription();

		/**
		 * The meta object literal for the '<em><b>Has Request Been Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___HAS_REQUEST_BEEN_RESOLVED = eINSTANCE.getIRequests__HasRequestBeenResolved();

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
		EOperation IREQUESTS___DELETE_REQUEST = eINSTANCE.getIRequests__DeleteRequest();

		/**
		 * The meta object literal for the '<em><b>Change Request Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___CHANGE_REQUEST_DESC = eINSTANCE.getIRequests__ChangeRequestDesc();

		/**
		 * The meta object literal for the '<em><b>Search Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREQUESTS___SEARCH_REQUESTS = eINSTANCE.getIRequests__SearchRequests();

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

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___GET_ID = eINSTANCE.getRequest__GetID();

		/**
		 * The meta object literal for the '<em><b>Get Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___GET_DESC = eINSTANCE.getRequest__GetDesc();

		/**
		 * The meta object literal for the '<em><b>Get Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___GET_IS_RESOLVED = eINSTANCE.getRequest__GetIsResolved();

		/**
		 * The meta object literal for the '<em><b>Set Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___SET_DESC = eINSTANCE.getRequest__SetDesc();

		/**
		 * The meta object literal for the '<em><b>Set Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___SET_IS_RESOLVED = eINSTANCE.getRequest__SetIsResolved();

	}

} //RequestsPackage
