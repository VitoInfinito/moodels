/**
 */
package Classes.Feedback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class FeedbackManager implements IFeedback {
	private static final long serialVersionUID = 8609094131455362788L;
	
	private final Logger logger = LoggerFactory.getLogger(FeedbackManager.class);
	public static FeedbackManager INSTANCE = new FeedbackManager();
	private static int IDCounter = 0;

	private HashMap<String, Feedback> feedbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private FeedbackManager() {
		feedbacks = new HashMap<String,Feedback>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public Feedback getFeedback(String id) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getFeedbackDescription(String id) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public boolean getFeedbackIsResolved(String id) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public boolean getFeedbackIsNoted(String id) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void setFeedbackDescription(String id, String desc) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void setFeedbackIsResolved(String id, boolean status) throws InvalidIDException {
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
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void setFeedbackIsNoted(String id, boolean status) throws InvalidIDException {
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

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addFeedback(String desc) {
		String id = generateID();
		Feedback feedback = FeedbackFactory.INSTANCE.createFeedback();

		feedback.setId(id);
		feedback.setDescription(desc);
		feedback.setIsNoted(false);
		feedback.setIsResolved(false);

		feedbacks.put(id, feedback);
	}
	
	@Override
	public void removeFeedback(String id) throws InvalidIDException {
		if (feedbacks.containsKey(id)) {
			feedbacks.remove(id);
		} else {
			logger.warn("A feedback with id {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	private String generateID() {
		return String.format("fe%06d", IDCounter++);
	}
} //FeedbackManagerImpl
