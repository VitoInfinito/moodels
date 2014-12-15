/**
 */
package Classes.Feedback.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Feedback.Feedback;
import Classes.Feedback.FeedbackFactory;
import Classes.Feedback.FeedbackManager;
import Classes.Feedback.FeedbackPackage;

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
	private FeedbackFactoryImpl() {
		super();
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
} //FeedbackFactoryImpl
