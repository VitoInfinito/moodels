package Classes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Classes.Accounts.tests.IAccountsAccessTest;
import Classes.Accounts.tests.IManageAccountsTest;
import Classes.Bills.tests.IBillsTest;
import Classes.Bookables.tests.IBookablesAccessTest;
import Classes.Bookables.tests.IBookablesManageTest;

@RunWith(Suite.class)
@SuiteClasses({ IAccountsAccessTest.class, IManageAccountsTest.class, IBillsTest.class, IBookablesAccessTest.class, IBookablesManageTest.class })
public class AllTests {

}
