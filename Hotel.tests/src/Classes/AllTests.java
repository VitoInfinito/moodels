package Classes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Classes.Accounts.tests.IAccountsAccessTest;
import Classes.Accounts.tests.IManageAccountsTest;
import Classes.Bills.tests.IBillsTest;
import Classes.Bookables.tests.IBookablesAccessTest;
import Classes.Bookables.tests.IBookablesManageTest;
import Classes.Bookings.tests.IBookingsTest;
import Classes.Customers.tests.ICustomersTest;
import Classes.Feedback.tests.IFeedbackTest;
import Classes.Guests.tests.IManageGuestsTest;
import Classes.Inventory.tests.IInventoryAccessTest;
import Classes.Inventory.tests.IManageInventoryTest;
import Classes.Requests.tests.IRequestsTest;
import Classes.Restaurants.tests.IRestaurantsAccessTest;
import Classes.Restaurants.tests.IRestaurantsManageTest;
import Classes.Services.tests.IServicesAccessTest;
import Classes.Services.tests.IServicesManagerTest;
import Classes.Staff.tests.IStaffTest;
import Classes.Statistics.tests.IStatisticsGeneratorTest;
import Classes.Stays.tests.IStaysTest;

@RunWith(Suite.class)
@SuiteClasses({ IAccountsAccessTest.class, IManageAccountsTest.class, IBillsTest.class, IBookablesAccessTest.class, IBookablesManageTest.class, IBookingsTest.class, ICustomersTest.class, IFeedbackTest.class, IManageGuestsTest.class, IInventoryAccessTest.class, IManageInventoryTest.class, IRequestsTest.class, IRestaurantsAccessTest.class, IRestaurantsManageTest.class, IServicesAccessTest.class, IServicesManagerTest.class, IStaffTest.class, IStatisticsGeneratorTest.class, IStaysTest.class })
public class AllTests {

}
