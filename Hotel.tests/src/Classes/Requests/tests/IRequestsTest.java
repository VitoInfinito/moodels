package Classes.Requests.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Requests.IRequests;
import Classes.Utils.InvalidIDException;

public class IRequestsTest {
	private static String request1;
	private static String request2;
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() {
		request1 = IRequests.INSTANCE.addRequest("abababababahej");
		request2 = IRequests.INSTANCE.addRequest("lolololololhej");
		IRequests.INSTANCE.addRequest("test");
	}
	
	@After
	public void tearDown() {
		for(String reqID : IRequests.INSTANCE.getAllRequestIDs()) {
			IRequests.INSTANCE.deleteRequest(reqID);
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
		assertTrue(result == 3);
	}

	@Test
	public void testGetRequestDescription() {
		String result = IRequests.INSTANCE.getRequestDescription(request2);
		assertTrue(result.equals("lolololololhej"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRequestDescription_id_not_exists() {
		IRequests.INSTANCE.getRequestDescription("");
	}
	
	@Test
	public void testHasRequestBeenResolved_not_resolved() {
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(request1);
		assertFalse(result);
	}
	
	@Test
	public void testHasRequestBeenResolved_is_resolved() {
		IRequests.INSTANCE.setRequestResolved(request1);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(request1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testHasRequestBeenResolved_id_not_exists() {
		IRequests.INSTANCE.hasRequestBeenResolved("");
	}

	@Test
	public void testSetRequestResolved() {
		IRequests.INSTANCE.setRequestResolved(request1);
		Boolean result = IRequests.INSTANCE.hasRequestBeenResolved(request1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetRequestResolved_id_not_exists() {
		IRequests.INSTANCE.setRequestResolved("");
	}

	@Test
	public void testDeleteRequest() {
		IRequests.INSTANCE.deleteRequest(request1);
		int result = IRequests.INSTANCE.getAllRequestIDs().size();
		assertTrue(result == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testDeleteRequest_id_not_exists() {
		IRequests.INSTANCE.deleteRequest("");
	}

	@Test
	public void testChangeRequestDesc() {
		IRequests.INSTANCE.changeRequestDesc(request1, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(request1);
		assertTrue(result == "bcbcbcbc");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeRequestDesc_id_not_exists() {
		IRequests.INSTANCE.changeRequestDesc("", "");
	}

	@Test
	public void testSearchRequests_requestEmpty_expectEmptyList() {
		tearDown();
		boolean result = IRequests.INSTANCE.searchRequests("ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchFeedback_feedbackNotEmpty_expectEmptyList() {
		boolean result = IRequests.INSTANCE.searchRequests("xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchFeedback_expectsListNonNull() {
		List<String> list = IRequests.INSTANCE.searchRequests("xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchFeedback_idMatchExactly() {
		List<String> list = IRequests.INSTANCE.searchRequests("abababababahej");
		assertTrue(IRequests.INSTANCE.getRequestDescription(list.get(0)).equals("abababababahej"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchFeedback_idMatchSomewhat() {
		List<String> list = IRequests.INSTANCE.searchRequests("bab");
		assertTrue(IRequests.INSTANCE.getRequestDescription(list.get(0)).equals("abababababahej"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchFeedback_multipleMatches() {
		List<String> list = IRequests.INSTANCE.searchRequests("hej");
		assertTrue(list.size() == 2);
	}

	@Test
	public void testSetRequestDescription() {
		IRequests.INSTANCE.setRequestDescription(request1, "bcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(request1);
		assertTrue(result == "bcbcbcbc");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetRequestDescription_id_not_exists() {
		IRequests.INSTANCE.setRequestDescription("", "");
	}

	@Test
	public void testAddRequest() {
		tearDown();
		
		String id = IRequests.INSTANCE.addRequest("bcbcbcbcbc");
		String result = IRequests.INSTANCE.getRequestDescription(id);
		
		assertTrue(result == "bcbcbcbcbc");
	}

}
