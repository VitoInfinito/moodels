/**
 */
package Classes.Services;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Service Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Services.RoomServiceOrder#getService <em>Service</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#isDelivered <em>Is Delivered</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#getItems <em>Items</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Services.RoomServiceOrder#getBill <em>Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Services.ServicesPackage#getRoomServiceOrder()
 * @model
 * @generated
 */
public interface RoomServiceOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link Classes.Services.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_Service()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Is Delivered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Delivered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delivered</em>' attribute.
	 * @see #setIsDelivered(boolean)
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_IsDelivered()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDelivered();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceOrder#isDelivered <em>Is Delivered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delivered</em>' attribute.
	 * @see #isDelivered()
	 * @generated
	 */
	void setIsDelivered(boolean value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_DeliveryDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceOrder#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Bookable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookable</em>' attribute.
	 * @see #setBookable(String)
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_Bookable()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookable();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceOrder#getBookable <em>Bookable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookable</em>' attribute.
	 * @see #getBookable()
	 * @generated
	 */
	void setBookable(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_Items()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getItems();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceOrder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' attribute.
	 * @see #setBill(String)
	 * @see Classes.Services.ServicesPackage#getRoomServiceOrder_Bill()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBill();

	/**
	 * Sets the value of the '{@link Classes.Services.RoomServiceOrder#getBill <em>Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' attribute.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getIsDelivered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setIsDelivered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeliveryDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBookable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBill();

} // RoomServiceOrder
