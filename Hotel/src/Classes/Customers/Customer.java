/**
 */
package Classes.Customers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Customers.Customer#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getLastname <em>Lastname</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getTitle <em>Title</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getPhone <em>Phone</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getSsid <em>Ssid</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Classes.Customers.Customer#getRequests <em>Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Customers.CustomersPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Firstname()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Lastname()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Title()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Phone()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see Classes.Customers.CustomersPackage#getCustomer_Ssid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link Classes.Customers.Customer#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' attribute list.
	 * @see Classes.Customers.CustomersPackage#getCustomer_Bookings()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getBookings();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' attribute list.
	 * @see Classes.Customers.CustomersPackage#getCustomer_Requests()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getLastName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSSID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLastName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEmail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPhone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRequest();

} // Customer
