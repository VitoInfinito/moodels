/**
 */
package Classes.Guests.impl;

import java.util.ArrayList;
import java.util.Collection;
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
import Classes.StringUtils;
import Classes.Accounts.AccountType;
import Classes.Accounts.IManageAccounts;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToGuestMapImpl;
import Classes.Guests.Guest;
import Classes.Guests.GuestsFactory;
import Classes.Guests.GuestsManager;
import Classes.Guests.GuestsPackage;
import Classes.Requests.IRequests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuestsManagerImpl extends MinimalEObjectImpl.Container implements GuestsManager {
	private final Logger logger = LoggerFactory.getLogger(GuestsManagerImpl.class);
	public static GuestsManagerImpl INSTANCE = new GuestsManagerImpl();
	
	private EMap<String, Guest> guests;

	private IManageAccounts iManageAccounts;
	private IRequests iRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private GuestsManagerImpl() {
		super();
		guests = new EcoreEMap<String,Guest>(ECoreMapEntriesPackage.Literals.STRING_TO_GUEST_MAP, StringToGuestMapImpl.class, this, GuestsPackage.GUESTS_MANAGER__GUESTS);
		iManageAccounts = IManageAccounts.INSTANCE;
		iRequests = IRequests.INSTANCE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires: 
	 * 		nothing
	 * Ensures:
	 * 		A List<String> of all guest ID:s is returned.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllGuestIDs() {
		return new ArrayList<String>(guests.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Requires: 
	 * 		all parameters are non null.
	 * Ensures:
	 * 		if guests.containsKey(SSID)
	 * 			InvalidIDException is thrown.
	 * 		Otherwise
	 * 			A new guest is added.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addGuest(String SSID, String firstname, String lastname, String title, String email, String phone) {
		
		if (guests.containsKey(SSID)) {
			logger.warn("There is already a guest added with the SSID {}. The SSID can not be used as a unique ID!", SSID);
			throw new InvalidIDException("There is already a SSID added with the SSID " + SSID + ". The SSID can not be used as a unique ID!");
		}
		
		Guest guest = GuestsFactory.eINSTANCE.createGuest();
		
		guest.setSsid(SSID);
		guest.setFirstname(firstname);
		guest.setLastname(lastname);
		guest.setTitle(title);
		guest.setEmail(email);
		guest.setPhone(phone);
		
		guests.put(SSID, guest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestFirstName(String SSID, String firstName) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).setFirstname(firstName);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestLastName(String SSID, String lastName) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).setLastname(lastName);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestTitle(String SSID, String title) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).setTitle(title);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestEmail(String SSID, String eMail) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).setEmail(eMail);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestPhone(String SSID, String phoneNr) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).setPhone(phoneNr);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestFirstName(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getFirstname();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestLastName(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getLastname();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestTitle(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getTitle();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestEmail(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getEmail();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestPhone(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getPhone();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchGuests(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (guests.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Guest> c = guests.values();
		
		// Some property match exactly. Second Order!
		for (Guest b : c) {
			if (b.getFirstname().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getLastname().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getTitle().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getEmail().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getPhone().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getStays().contains(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getRequests().contains(keyword)) {
				searchResult.add(b.getSsid());
			}
		}
		
		// ID match somewhat. Third Order!
		for (Guest b : c) {			
			if (regexPattern.matcher(b.getSsid()).matches()) {
				searchResult.add(b.getSsid());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Guest b : c) {
			if (regexPattern.matcher(b.getFirstname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getLastname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getTitle()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getFirstname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getEmail()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getPhone()).matches()) {
				searchResult.add(b.getSsid());
			} else {
				for (String stay : b.getStays()) {
					if (regexPattern.matcher(stay).matches()) {
						searchResult.add(b.getSsid());
					}
				}
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getGuestStays(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getStays();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getGuestRequests(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getRequests();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeGuestStay(String SSID, String stayID) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).removeStay(stayID);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addGuestRequest(String SSID, String description) {
		if(guests.containsKey(SSID)) {
			guests.get(SSID).addRequest(iRequests.addRequest(description));
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeGuestRequest(String SSID, String requestID) {
		if(guests.containsKey(SSID)) {
			iRequests.deleteRequest(requestID);
			guests.get(SSID).removeRequest(requestID);
		} else {
			logger.warn("A guest with SSID {} could not be found");
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestAccountUsername(String SSID) {
		if(guests.containsKey(SSID)) {
			return guests.get(SSID).getAccount();
		} else {
			logger.warn("A guest with SSID {} could not be found");
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestAccountPassword(String SSID) {
		if(guests.containsKey(SSID)) {
			return iManageAccounts.getAccountPassword(guests.get(SSID).getAccount());
		} else {
			logger.warn("A guest with SSID {} could not be found");
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void generateGuestAccount(String SSID) {
		if(guests.containsKey(SSID)) {
			iManageAccounts.addAccount(SSID, StringUtils.generateRandomPassword(6) , AccountType.GUEST);
			guests.get(SSID).setAccount(SSID);
		} else {
			logger.warn("A guest with SSID {} could not be found");
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeGuestAccount(String SSID) {
		if(guests.containsKey(SSID)) {
			iManageAccounts.deleteAccount(SSID);
			guests.get(SSID).setAccount("");
		} else {
			logger.warn("A guest with SSID {} could not be found");
			throw new InvalidIDException();
		}
	}
} //GuestsManagerImpl
