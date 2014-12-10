/**
 */
package Classes.Feedback.impl;

import Classes.Feedback.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackFactoryImpl extends EFactoryImpl implements FeedbackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeedbackFactory init() {
		try {
			FeedbackFactory theFeedbackFactory = (FeedbackFactory)EPackage.Registry.INSTANCE.getEFactory(FeedbackPackage.eNS_URI);
			if (theFeedbackFactory != null) {
				return theFeedbackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeedbackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeedbackPackage.FEEDBACK_MANAGER: return createFeedbackManager();
			case FeedbackPackage.FEEDBACK: return createFeedback();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackManager createFeedbackManager() {
		return FeedbackManagerImpl.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPackage getFeedbackPackage() {
		return (FeedbackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeedbackPackage getPackage() {
		return FeedbackPackage.eINSTANCE;
	}

} //FeedbackFactoryImpl
