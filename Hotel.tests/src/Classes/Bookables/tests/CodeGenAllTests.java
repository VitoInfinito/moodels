/**
 */
package Classes.Bookables.tests;

import Classes.Accounts.tests.AccountsTests;

import Classes.Banking.tests.BankingTests;

import Classes.Bills.tests.BillsTests;

import Classes.Bookings.tests.BookingsTests;

import Classes.Customers.tests.CustomersTests;

import Classes.Feedback.tests.FeedbackTests;

import Classes.Guests.tests.GuestsTests;

import Classes.Inventory.tests.InventoryTests;

import Classes.Requests.tests.RequestsTests;

import Classes.Restaurants.tests.RestaurantsTests;

import Classes.Services.tests.ServicesTests;

import Classes.Staff.tests.StaffTests;

import Classes.Statistics.tests.StatisticsTests;

import Classes.Stays.tests.StaysTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CodeGen</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeGenAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CodeGenAllTests("CodeGen Tests");
		suite.addTest(BookablesTests.suite());
		suite.addTest(StaysTests.suite());
		suite.addTest(BankingTests.suite());
		suite.addTest(BillsTests.suite());
		suite.addTest(GuestsTests.suite());
		suite.addTest(AccountsTests.suite());
		suite.addTest(BookingsTests.suite());
		suite.addTest(CustomersTests.suite());
		suite.addTest(StatisticsTests.suite());
		suite.addTest(StaffTests.suite());
		suite.addTest(InventoryTests.suite());
		suite.addTest(RestaurantsTests.suite());
		suite.addTest(ServicesTests.suite());
		suite.addTest(FeedbackTests.suite());
		suite.addTest(RequestsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGenAllTests(String name) {
		super(name);
	}

} //CodeGenAllTests
