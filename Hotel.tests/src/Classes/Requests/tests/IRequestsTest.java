package Classes.Requests.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Requests.IRequests;
import Classes.Utils.InvalidIDException;

public class IRequestsTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() {
		IRequests.INSTANCE.addRequest("abababababa");
	}
	
	@After
	public void tearDown() {
		if (IRequests.INSTANCE.getAllRequestIDs().size() > 0) {
			String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
			IRequests.INSTANCE.deleteRequest(id);
		}
	}
	
	@Test
	public void testGetAllRequestIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IRequests.INSTANCE.getAllRequestIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllRequestIDsNotEmpty() {
		int result = IRequests.INSTANCE.getAllRequestIDs().size();
		assertTrue(result == 1);
	}

	@Test
	public void testGetRequestDescription() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		String result = IRequests.INSTANCE.getRequestDescription(id);
		assertTrue(result == "abababababa");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRequestDescription_id_not_exists() {
		IRequests.INSTANCE.getRequestDescription("");
	}
	
	@Test
	public void testHasRequestBeenResolved_not_resolved() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(id);
		assertFalse(result);
	}
	
	@Test
	public void testHasRequestBeenResolved_is_resolved() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.setRequestResolved(id);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(id);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testHasRequestBeenResolved_id_not_exists() {
		IRequests.INSTANCE.hasRequestBeenResolved("");
	}

	@Test
	public void testSetRequestResolved() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.setRequestResolved(id);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(id);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetRequestResolved_id_not_exists() {
		IRequests.INSTANCE.setRequestResolved("");
	}

	@Test
	public void testDeleteRequest() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.deleteRequest(id);
		int result = IRequests.INSTANCE.getAllRequestIDs().size();
		assertTrue(result == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testDeleteRequest_id_not_exists() {
		IRequests.INSTANCE.deleteRequest("");
	}

	@Test
	public void testChangeRequestDesc() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.changeRequestDesc(id, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(id);
		assertTrue(result == "bcbcbcbc");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeRequestDesc_id_not_exists() {
		IRequests.INSTANCE.changeRequestDesc("", "");
	}

	@Test
	public void testSearchRequests() {
		fail("Not yet implemented");
		// TODO
	}

	@Test
	public void testSetRequestDescription() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.setRequestDescription(id, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(id);
		assertTrue(result == "bcbcbcbc");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetRequestDescription_id_not_exists() {
		IRequests.INSTANCE.setRequestDescription("", "");
	}

	@Test
	public void testAddRequest() {
		tearDown();
		
		IRequests.INSTANCE.addRequest("bcbcbcbcbc");
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		String result = IRequests.INSTANCE.getRequestDescription(id);
		
		assertTrue(result == "bcbcbcbcbc");
	}

}
