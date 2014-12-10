/**
 */
package Classes.Feedback.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToFeedbackMapImpl;
import Classes.Feedback.Feedback;
import Classes.Feedback.FeedbackManager;
import Classes.Feedback.FeedbackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Feedback.impl.FeedbackManagerImpl#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackManagerImpl extends MinimalEObjectImpl.Container implements FeedbackManager {
	private final Logger logger = LoggerFactory.getLogger(FeedbackManagerImpl.class);
	public static FeedbackManagerImpl INSTANCE = new FeedbackManagerImpl();
	
	
	private static int IDCounter = 0;
	
	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Feedback> feedbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private FeedbackManagerImpl() {
		super();
		feedbacks = new EcoreEMap<String,Feedback>(ECoreMapEntriesPackage.Literals.STRING_TO_FEEDBACK_MAP, StringToFeedbackMapImpl.class, this, FeedbackPackage.FEEDBACK_MANAGER__FEEDBACKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.FEEDBACK_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Feedback> getFeedbacks() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feedback getFeedback(String id) {
		if (feedbacks.containsKey(id)) {
			return feedbacks.get(id);
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllFeedbackIDs() {
		return new ArrayList<String>(feedbacks.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFeedbackDescription(String id) {
		if (feedbacks.containsKey(id)) {
			return feedbacks.get(id).getDescription();
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getFeedbackIsResolved(String id) {
		if (feedbacks.containsKey(id)) {
			return feedbacks.get(id).isResolved();
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getFeedbackIsNoted(String id) {
		if (feedbacks.containsKey(id)) {
			return feedbacks.get(id).isNoted();
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeedbackDescription(String id, String desc) {
		if (feedbacks.containsKey(id)) {
			feedbacks.get(id).setDescription(desc);
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeedbackIsResolved(String id, boolean status) {
		if (feedbacks.containsKey(id)) {
			feedbacks.get(id).setIsResolved(status);
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeedbackIsNoted(String id, boolean status) {
		if (feedbacks.containsKey(id)) {
			feedbacks.get(id).setIsNoted(status);
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchFeedback(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addFeedback(String desc) {
		String id = IDCounter++ + "";
		
		if (!feedbacks.containsKey(id)) {
			Feedback feedback = new FeedbackImpl();
			
			feedback.setId(id);
			feedback.setDescription(desc);
			
			feedbacks.put(id, feedback);
		} else {
			logger.warn("A feedback with ID {} already exists.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}
} //FeedbackManagerImpl
