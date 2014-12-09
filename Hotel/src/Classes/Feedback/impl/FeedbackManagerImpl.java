/**
 */
package Classes.Feedback.impl;

import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToFeedbackMapImpl;
import Classes.Feedback.Feedback;
import Classes.Feedback.FeedbackManager;
import Classes.Feedback.FeedbackPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
	protected FeedbackManagerImpl() {
		super();
		feedbacks = (EMap<String, Feedback>) new HashMap<String, Feedback>();
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedbacks() {
		if (feedbacks == null) {
			feedbacks = new EObjectResolvingEList<Feedback>(Feedback.class, this, FeedbackPackage.FEEDBACK_MANAGER__FEEDBACKS);
		}
		return feedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EcoreEMap<String,Feedback>(ECoreMapEntriesPackage.Literals.STRING_TO_FEEDBACK_MAP, StringToFeedbackMapImpl.class, this, FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllFeedbackIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedbackDescription(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getFeedbackIsResolved(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getFeedbackIsNoted(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackDescription(String id, String desc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackIsResolved(String id, boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackIsNoted(String id, boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchFeedback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFeedback(String id, String desc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK:
				return ((InternalEList<?>)getFeedback()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK:
				if (coreType) return getFeedback();
				else return getFeedback().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK:
				((EStructuralFeature.Setting)getFeedback()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK:
				getFeedback().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK_MANAGER__FEEDBACK:
				return feedback != null && !feedback.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FeedbackPackage.FEEDBACK_MANAGER___GET_ALL_FEEDBACK_IDS:
				return getAllFeedbackIDs();
			case FeedbackPackage.FEEDBACK_MANAGER___GET_FEEDBACK_DESCRIPTION__STRING:
				return getFeedbackDescription((String)arguments.get(0));
			case FeedbackPackage.FEEDBACK_MANAGER___GET_FEEDBACK_IS_RESOLVED__STRING:
				return getFeedbackIsResolved((String)arguments.get(0));
			case FeedbackPackage.FEEDBACK_MANAGER___GET_FEEDBACK_IS_NOTED__STRING:
				return getFeedbackIsNoted((String)arguments.get(0));
			case FeedbackPackage.FEEDBACK_MANAGER___SET_FEEDBACK_DESCRIPTION__STRING_STRING:
				setFeedbackDescription((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case FeedbackPackage.FEEDBACK_MANAGER___SET_FEEDBACK_IS_RESOLVED__STRING_BOOLEAN:
				setFeedbackIsResolved((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case FeedbackPackage.FEEDBACK_MANAGER___SET_FEEDBACK_IS_NOTED__STRING_BOOLEAN:
				setFeedbackIsNoted((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case FeedbackPackage.FEEDBACK_MANAGER___SEARCH_FEEDBACK:
				searchFeedback();
				return null;
			case FeedbackPackage.FEEDBACK_MANAGER___ADD_FEEDBACK__STRING_STRING:
				addFeedback((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeedbackManagerImpl
