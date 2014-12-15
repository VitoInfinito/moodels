/**
 */
package Classes.Feedback.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToFeedbackMapImpl;
import Classes.Feedback.Feedback;
import Classes.Feedback.FeedbackFactory;
import Classes.Feedback.FeedbackManager;
import Classes.Feedback.FeedbackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackManagerImpl extends MinimalEObjectImpl.Container implements FeedbackManager {
	private final Logger logger = LoggerFactory.getLogger(FeedbackManagerImpl.class);
	public static FeedbackManagerImpl INSTANCE = new FeedbackManagerImpl();
	private static int IDCounter = 0;

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
		return Collections.unmodifiableList(new ArrayList<String>(feedbacks.keySet()));
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
	 * @generated NOT
	 */
	public List<String> searchFeedback(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (feedbacks.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Feedback> c = feedbacks.values();
		// ID match somewhat. Second Order!
		for (Feedback b : c) {			
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match exactly. Thirs Order!
		for (Feedback b : c) {
			if (b.getDescription().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Feedback b : c) {
			if (regexPattern.matcher(b.getDescription()).matches()) {
				searchResult.add(b.getId());
			}
		}

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addFeedback(String desc) {
		String id = generateID();
		Feedback feedback = FeedbackFactory.eINSTANCE.createFeedback();

		feedback.setId(id);
		feedback.setDescription(desc);
		feedback.setIsNoted(false);
		feedback.setIsResolved(false);

		feedbacks.put(id, feedback);
	}

	private String generateID() {
		return String.format("fe%06d", IDCounter++);
	}
} //FeedbackManagerImpl
