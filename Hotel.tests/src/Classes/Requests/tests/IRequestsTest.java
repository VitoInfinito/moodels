package Classes.Requests.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Feedback.IFeedback;
import Classes.Requests.IRequests;
import Classes.Utils.InvalidIDException;

public class IRequestsTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IRequests.INSTANCE.addRequest("abababababa");
	}
	
	@After
	public void tearDown() throws Exception {
		if (IRequests.INSTANCE.getAllRequestIDs().size() > 0) {
			String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
			IRequests.INSTANCE.deleteRequest(id);
		}
	}
	
	@Test
	public void testGetAllRequestIDsEmptyExpectEmpty() throws Exception {
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

	@Test
	public void testSetRequestResolved() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.setRequestResolved(id);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(id);
		assertTrue(result);
	}

	@Test
	public void testDeleteRequest() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.deleteRequest(id);
		int result = IRequests.INSTANCE.getAllRequestIDs().size();
		assertTrue(result == 0);
	}

	@Test
	public void testChangeRequestDesc() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.changeRequestDesc(id, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(id);
		assertTrue(result == "bcbcbcbc");
	}

	@Test
	public void testSearchRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRequestDescription() {
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		IRequests.INSTANCE.changeRequestDesc(id, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(id);
		assertTrue(result == "bcbcbcbc");
	}

	@Test
	public void testAddRequest() throws Exception {
		tearDown();
		
		IRequests.INSTANCE.addRequest("bcbcbcbcbc");
		String id = IRequests.INSTANCE.getAllRequestIDs().get(0);
		String result = IRequests.INSTANCE.getRequestDescription(id);
		
		assertTrue(result == "bcbcbcbcbc");
	}

}
