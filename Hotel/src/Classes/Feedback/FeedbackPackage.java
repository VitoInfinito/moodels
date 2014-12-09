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
	int IFEEDBACK___GET_FEEDBACK_DESCRIPTION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_FEEDBACK_IS_RESOLVED__STRING = 2;

	/**
	 * The operation id for the '<em>Get Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___GET_FEEDBACK_IS_NOTED__STRING = 3;

	/**
	 * The operation id for the '<em>Set Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_DESCRIPTION__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Set Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_IS_RESOLVED__STRING_BOOLEAN = 5;

	/**
	 * The operation id for the '<em>Set Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SET_FEEDBACK_IS_NOTED__STRING_BOOLEAN = 6;

	/**
	 * The operation id for the '<em>Search Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___SEARCH_FEEDBACK__STRING = 7;

	/**
	 * The operation id for the '<em>Add Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEEDBACK___ADD_FEEDBACK__STRING_STRING = 8;

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
	 * The feature id for the '<em><b>Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER__FEEDBACKS = IFEEDBACK_FEATURE_COUNT + 0;

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
	int FEEDBACK_MANAGER___GET_FEEDBACK_DESCRIPTION__STRING = IFEEDBACK___GET_FEEDBACK_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_FEEDBACK_IS_RESOLVED__STRING = IFEEDBACK___GET_FEEDBACK_IS_RESOLVED__STRING;

	/**
	 * The operation id for the '<em>Get Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___GET_FEEDBACK_IS_NOTED__STRING = IFEEDBACK___GET_FEEDBACK_IS_NOTED__STRING;

	/**
	 * The operation id for the '<em>Set Feedback Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_DESCRIPTION__STRING_STRING = IFEEDBACK___SET_FEEDBACK_DESCRIPTION__STRING_STRING;

	/**
	 * The operation id for the '<em>Set Feedback Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_IS_RESOLVED__STRING_BOOLEAN = IFEEDBACK___SET_FEEDBACK_IS_RESOLVED__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Set Feedback Is Noted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SET_FEEDBACK_IS_NOTED__STRING_BOOLEAN = IFEEDBACK___SET_FEEDBACK_IS_NOTED__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Search Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___SEARCH_FEEDBACK__STRING = IFEEDBACK___SEARCH_FEEDBACK__STRING;

	/**
	 * The operation id for the '<em>Add Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_MANAGER___ADD_FEEDBACK__STRING_STRING = IFEEDBACK___ADD_FEEDBACK__STRING_STRING;

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
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackDescription(java.lang.String) <em>Get Feedback Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Description</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackDescription(java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackDescription__String();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackIsResolved(java.lang.String) <em>Get Feedback Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Is Resolved</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackIsResolved(java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackIsResolved__String();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#getFeedbackIsNoted(java.lang.String) <em>Get Feedback Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feedback Is Noted</em>' operation.
	 * @see Classes.Feedback.IFeedback#getFeedbackIsNoted(java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__GetFeedbackIsNoted__String();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackDescription(java.lang.String, java.lang.String) <em>Set Feedback Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Description</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackDescription(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackDescription__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackIsResolved(java.lang.String, boolean) <em>Set Feedback Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Is Resolved</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackIsResolved(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackIsResolved__String_boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#setFeedbackIsNoted(java.lang.String, boolean) <em>Set Feedback Is Noted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Feedback Is Noted</em>' operation.
	 * @see Classes.Feedback.IFeedback#setFeedbackIsNoted(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getIFeedback__SetFeedbackIsNoted__String_boolean();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#searchFeedback(java.lang.String) <em>Search Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Feedback</em>' operation.
	 * @see Classes.Feedback.IFeedback#searchFeedback(java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__SearchFeedback__String();

	/**
	 * Returns the meta object for the '{@link Classes.Feedback.IFeedback#addFeedback(java.lang.String, java.lang.String) <em>Add Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Feedback</em>' operation.
	 * @see Classes.Feedback.IFeedback#addFeedback(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIFeedback__AddFeedback__String_String();

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
	 * Returns the meta object for the reference list '{@link Classes.Feedback.FeedbackManager#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedbacks</em>'.
	 * @see Classes.Feedback.FeedbackManager#getFeedbacks()
	 * @see #getFeedbackManager()
	 * @generated
	 */
	EReference getFeedbackManager_Feedbacks();

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
		EOperation IFEEDBACK___GET_FEEDBACK_DESCRIPTION__STRING = eINSTANCE.getIFeedback__GetFeedbackDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get Feedback Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_FEEDBACK_IS_RESOLVED__STRING = eINSTANCE.getIFeedback__GetFeedbackIsResolved__String();

		/**
		 * The meta object literal for the '<em><b>Get Feedback Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___GET_FEEDBACK_IS_NOTED__STRING = eINSTANCE.getIFeedback__GetFeedbackIsNoted__String();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_DESCRIPTION__STRING_STRING = eINSTANCE.getIFeedback__SetFeedbackDescription__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_IS_RESOLVED__STRING_BOOLEAN = eINSTANCE.getIFeedback__SetFeedbackIsResolved__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Feedback Is Noted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SET_FEEDBACK_IS_NOTED__STRING_BOOLEAN = eINSTANCE.getIFeedback__SetFeedbackIsNoted__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Search Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___SEARCH_FEEDBACK__STRING = eINSTANCE.getIFeedback__SearchFeedback__String();

		/**
		 * The meta object literal for the '<em><b>Add Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFEEDBACK___ADD_FEEDBACK__STRING_STRING = eINSTANCE.getIFeedback__AddFeedback__String_String();

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
		 * The meta object literal for the '<em><b>Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_MANAGER__FEEDBACKS = eINSTANCE.getFeedbackManager_Feedbacks();

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

	}

} //FeedbackPackage
