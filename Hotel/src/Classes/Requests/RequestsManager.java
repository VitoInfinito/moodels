/**
 */
package Classes.Requests;

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
 class RequestsManager implements IRequests {
	private static final long serialVersionUID = 7130622335757269180L;
	
	private final Logger logger = LoggerFactory.getLogger(RequestsManager.class);
	public static RequestsManager INSTANCE = new RequestsManager();
	private static int counterID = 1;
	
	private HashMap<String, Request> specialRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private RequestsManager() {
		super();
		specialRequest = new HashMap<String,Request>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getRequestDescription(String specialRequestId) throws InvalidIDException {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		return req.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public boolean hasRequestBeenResolved(String specialRequestId) throws InvalidIDException {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		return req.isResolved();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void setRequestResolved(String specialRequestId) throws InvalidIDException {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		req.setIsResolved(true);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void deleteRequest(String specialRequestId) throws InvalidIDException {
		Request req = specialRequest.remove(specialRequestId);
		if(req == null){
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", specialRequestId);
			throw new InvalidIDException("The id was not found!");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeRequestDesc(String specialRequestId, String description) throws InvalidIDException {
		setRequestDescription(specialRequestId, description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchRequests(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		// Exact ID match. First Order!
		
		if (specialRequest.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Request> tmpC = specialRequest.values();
		
		// Some property match exactly. Second Order!
		for (Request sp : tmpC) {
			if (sp.getDescription().equalsIgnoreCase(keyword)) {
				searchResult.add(sp.getId());
			} 
		}
		
		// ID match somewhat. Third Order!
		for (Request sp : tmpC) {
			if (regexPattern.matcher(sp.getId()).matches()) {
				searchResult.add(sp.getId());
			}
		}
		
		// Some property match somewhat. Fourth Order.
		for (Request sp : tmpC) {
			if (regexPattern.matcher(sp.getDescription()).matches()) {
				searchResult.add(sp.getId());
			}
		}
		
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllRequestIDs() {
		return new ArrayList<String>(specialRequest.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void setRequestDescription(String specialRequestId, String description) throws InvalidIDException {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		req.setDescription(description);
	}

	
	private String generateID(){
		return String.format("re%06d", counterID++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String addRequest(String description) {
		String specialRequestId = generateID();
		Request req = RequestsFactory.INSTANCE.createRequest();
		req.setDescription(description);
		req.setId(specialRequestId);
		req.setIsResolved(false);
		
		specialRequest.put(specialRequestId,req);
		
		return specialRequestId;
	}
} //RequestsManagerImpl
