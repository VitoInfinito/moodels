/**
 */
package Classes.Feedback;

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
 * @see Classes.Feedback.FeedbackFactory
 * @model kind="package"
 * @generated
 */
public interface FeedbackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Feedback";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Feedback.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Feedback";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeedbackPackage eINSTANCE = Classes.Feedback.impl.FeedbackPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Feedback.IFeedback <em>IFeedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Feedback.IFeedback
	 * @see Classes.Feedback.impl.FeedbackPackageImpl#getIFeedback()
	 * @generated
	 */
	int IFEEDBACK = 0;

	/**
	 * The number of structural features of the '<em>IFeedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Feedback IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_ALL_FEEDBACK_IDS = 0;

	/**
	 * The operation id for the '<em>Get Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_FEEDBACK_DESCRIPTION = 1;

	/**
	 * The operation id for the '<em>Get Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_FEEDBACK_IS_RESOLVED = 2;

	/**
	 * The operation id for the '<em>Get Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_FEEDBACK_IS_NOTED = 3;

	/**
	 * The operation id for the '<em>Set Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_DESCRIPTION = 4;

	/**
	 * The operation id for the '<em>Set Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_IS_RESOLVED = 5;

	/**
	 * The operation id for the '<em>Set Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_IS_NOTED = 6;

	/**
	 * The operation id for the '<em>Search Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SEARCH_FEEDBACK = 7;

	/**
	 * The operation id for the '<em>Add Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___ADD_FEEDBACK = 8;

	/**
	 * The number of operations of the '<em>IFeedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link Classes.Feedback.impl.FeedbackManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Feedback.impl.FeedbackManagerImpl
	 * @see Classes.Feedback.impl.FeedbackPackageImpl#getFeedbackManager()
	 * @generated
	 */
	int FEEDBACK_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER__FEEDBACK = IFEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER_FEATURE_COUNT = IFEEDBACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Feedback IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_ALL_FEEDBACK_IDS = IFEEDBACK___GET_ALL_FEEDBACK_IDS;

	/**
	 * The operation id for the '<em>Get Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_FEEDBACK_DESCRIPTION = IFEEDBACK___GET_FEEDBACK_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_FEEDBACK_IS_RESOLVED = IFEEDBACK___GET_FEEDBACK_IS_RESOLVED;

	/**
	 * The operation id for the '<em>Get Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_FEEDBACK_IS_NOTED = IFEEDBACK___GET_FEEDBACK_IS_NOTED;

	/**
	 * The operation id for the '<em>Set Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_DESCRIPTION = IFEEDBACK___SET_FEEDBACK_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_IS_RESOLVED = IFEEDBACK___SET_FEEDBACK_IS_RESOLVED;

	/**
	 * The operation id for the '<em>Set Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_IS_NOTED = IFEEDBACK___SET_FEEDBACK_IS_NOTED;

	/**
	 * The operation id for the '<em>Search Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SEARCH_FEEDBACK = IFEEDBACK___SEARCH_FEEDBACK;

	/**
	 * The operation id for the '<em>Add Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___ADD_FEEDBACK = IFEEDBACK___ADD_FEEDBACK;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER_OPERATION_COUNT = IFEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Feedback.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Feedback.impl.FeedbackImpl
	 * @see Classes.Feedback.impl.FeedbackPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Is Noted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__IS_NOTED = 1;

	/**
	 * The feature id for the '<em><b>Is Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__IS_RESOLVED = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ID = 3;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___GET_DESC = 0;

	/**
	 * The operation id for the '<em>Get Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___GET_IS_NOTED = 1;

	/**
	 * The operation id for the '<em>Get Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___GET_IS_RESOLVED = 2;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___GET_ID = 3;

	/**
	 * The operation id for the '<em>Set Desc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___SET_DESC = 4;

	/**
	 * The operation id for the '<em>Set Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___SET_IS_NOTED = 5;

	/**
	 * The operation id for the '<em>Set Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK___SET_IS_RESOLVED = 6;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link Classes.Feedback.IFeedback <em>IFeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFeedback</em>'.
	 * @see Classes.Feedback.IFeedback
	 * @generated
	 */
	EClass getIFeedback();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getAllFeedbackIDs() <em>Get All Feedback IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Feedback IDs</em>' operation.
	 * @see Classes.Feedback.IFeedback#getAllFeedbackIDs()
	 * @generated
	 */
	EOperation getIFeedback__GetAllFeedbackIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackDescription() <em>Get Feedback Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Description</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackDescription()
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackDescription();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackIsResolved() <em>Get Feedback Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Is Resolved</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackIsResolved()
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackIsResolved();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackIsNoted() <em>Get Feedback Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Is Noted</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackIsNoted()
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackIsNoted();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackDescription() <em>Set Feedback Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Description</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackDescription()
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackDescription();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackIsResolved() <em>Set Feedback Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Is Resolved</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackIsResolved()
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackIsResolved();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackIsNoted() <em>Set Feedback Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Is Noted</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackIsNoted()
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackIsNoted();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#searchFeedback() <em>Search Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Feedback</em>' operation.
	 * @see Classes.Feedback.IFeedback#searchFeedback()
	 * @generated
	 */
	EOperation getIFeedback__SearchFeedback();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#addFeedback() <em>Add Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Feedback</em>' operation.
	 * @see Classes.Feedback.IFeedback#addFeedback()
	 * @generated
	 */
	EOperation getIFeedback__AddFeedback();

	/**
	 * Returns the meta object for class '{@link Classes.Feedback.FeedbackManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Feedback.FeedbackManager
	 * @generated
	 */
	EClass getFeedbackManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Feedback.FeedbackManager#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see Classes.Feedback.FeedbackManager#getFeedback()
	 * @see #getFeedbackManager()
	 * @generated
	 */
	EReference getFeedbackManager_Feedback();

	/**
	 * Returns the meta object for class '{@link Classes.Feedback.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see Classes.Feedback.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Feedback.Feedback#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.Feedback.Feedback#getDescription()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Description();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Feedback.Feedback#isNoted <em>Is Noted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Noted</em>'.
	 * @see Classes.Feedback.Feedback#isNoted()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_IsNoted();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Feedback.Feedback#isResolved <em>Is Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Resolved</em>'.
	 * @see Classes.Feedback.Feedback#isResolved()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_IsResolved();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Feedback.Feedback#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Feedback.Feedback#getId()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Id();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#getDesc() <em>Get Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Desc</em>' operation.
	 * @see Classes.Feedback.Feedback#getDesc()
	 * @generated
	 */
	EOperation getFeedback__GetDesc();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#getIsNoted() <em>Get Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Is Noted</em>' operation.
	 * @see Classes.Feedback.Feedback#getIsNoted()
	 * @generated
	 */
	EOperation getFeedback__GetIsNoted();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#getIsResolved() <em>Get Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Is Resolved</em>' operation.
	 * @see Classes.Feedback.Feedback#getIsResolved()
	 * @generated
	 */
	EOperation getFeedback__GetIsResolved();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see Classes.Feedback.Feedback#getID()
	 * @generated
	 */
	EOperation getFeedback__GetID();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#setDesc() <em>Set Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Desc</em>' operation.
	 * @see Classes.Feedback.Feedback#setDesc()
	 * @generated
	 */
	EOperation getFeedback__SetDesc();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#setIsNoted() <em>Set Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Noted</em>' operation.
	 * @see Classes.Feedback.Feedback#setIsNoted()
	 * @generated
	 */
	EOperation getFeedback__SetIsNoted();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.Feedback#setIsResolved() <em>Set Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Is Resolved</em>' operation.
	 * @see Classes.Feedback.Feedback#setIsResolved()
	 * @generated
	 */
	EOperation getFeedback__SetIsResolved();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeedbackFactory getFeedbackFactory();

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
		 * The meta object literal for the '{@link Classes.Feedback.IFeedback <em>IFeedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Feedback.IFeedback
		 * @see Classes.Feedback.impl.FeedbackPackageImpl#getIFeedback()
		 * @generated
		 */
		EClass IFEEDBACK = eINSTANCE.getIFeedback();

		/**
		 * The meta object literal for the '<em><b>Get All Feedback IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_ALL_FEEDBACK_IDS = eINSTANCE.getIFeedback__GetAllFeedbackIDs();

		/**
		 * The meta object literal for the '<em><b>Get Feedback Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_FEEDBACK_DESCRIPTION = eINSTANCE.getIFeedback__GetFeedbackDescription();

		/**
		 * The meta object literal for the '<em><b>Get Feedback Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_FEEDBACK_IS_RESOLVED = eINSTANCE.getIFeedback__GetFeedbackIsResolved();

		/**
		 * The meta object literal for the '<em><b>Get Feedback Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_FEEDBACK_IS_NOTED = eINSTANCE.getIFeedback__GetFeedbackIsNoted();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_DESCRIPTION = eINSTANCE.getIFeedback__SetFeedbackDescription();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_IS_RESOLVED = eINSTANCE.getIFeedback__SetFeedbackIsResolved();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_IS_NOTED = eINSTANCE.getIFeedback__SetFeedbackIsNoted();

		/**
		 * The meta object literal for the '<em><b>Search Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SEARCH_FEEDBACK = eINSTANCE.getIFeedback__SearchFeedback();

		/**
		 * The meta object literal for the '<em><b>Add Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___ADD_FEEDBACK = eINSTANCE.getIFeedback__AddFeedback();

		/**
		 * The meta object literal for the '{@link Classes.Feedback.impl.FeedbackManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Feedback.impl.FeedbackManagerImpl
		 * @see Classes.Feedback.impl.FeedbackPackageImpl#getFeedbackManager()
		 * @generated
		 */
		EClass FEEDBACK_MANAGER = eINSTANCE.getFeedbackManager();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_MANAGER__FEEDBACK = eINSTANCE.getFeedbackManager_Feedback();

		/**
		 * The meta object literal for the '{@link Classes.Feedback.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Feedback.impl.FeedbackImpl
		 * @see Classes.Feedback.impl.FeedbackPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__DESCRIPTION = eINSTANCE.getFeedback_Description();

		/**
		 * The meta object literal for the '<em><b>Is Noted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__IS_NOTED = eINSTANCE.getFeedback_IsNoted();

		/**
		 * The meta object literal for the '<em><b>Is Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__IS_RESOLVED = eINSTANCE.getFeedback_IsResolved();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__ID = eINSTANCE.getFeedback_Id();

		/**
		 * The meta object literal for the '<em><b>Get Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___GET_DESC = eINSTANCE.getFeedback__GetDesc();

		/**
		 * The meta object literal for the '<em><b>Get Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___GET_IS_NOTED = eINSTANCE.getFeedback__GetIsNoted();

		/**
		 * The meta object literal for the '<em><b>Get Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___GET_IS_RESOLVED = eINSTANCE.getFeedback__GetIsResolved();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___GET_ID = eINSTANCE.getFeedback__GetID();

		/**
		 * The meta object literal for the '<em><b>Set Desc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___SET_DESC = eINSTANCE.getFeedback__SetDesc();

		/**
		 * The meta object literal for the '<em><b>Set Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___SET_IS_NOTED = eINSTANCE.getFeedback__SetIsNoted();

		/**
		 * The meta object literal for the '<em><b>Set Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEEDBACK___SET_IS_RESOLVED = eINSTANCE.getFeedback__SetIsResolved();

	}

} //FeedbackPackage
