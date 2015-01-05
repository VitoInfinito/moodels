package Classes.Feedback.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Feedback.IFeedback;
import Classes.Utils.InvalidIDException;

public class IFeedbackTest {
	private String feedback1;
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() {
		feedback1 = IFeedback.INSTANCE.addFeedback("abababababahej");
		IFeedback.INSTANCE.addFeedback("lolololololhej");
		IFeedback.INSTANCE.addFeedback("test");
	}
	
	@After
	public void tearDown() {
		for(String feedID : IFeedback.INSTANCE.getAllFeedbackIDs()) {
			IFeedback.INSTANCE.removeFeedback(feedID);
		}
	}
	
	@Test
	public void testGetAllFeedbackIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllFeedbackIDsNotEmpty() {
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 3);
	}

	@Test
	public void testGetFeedbackDescription() {
		String result = IFeedback.INSTANCE.getFeedbackDescription(feedback1);
		assertTrue(result == "abababababahej");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetFeedbackDescription_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackDescription("");
	}
	
	@Test
	public void testGetFeedbackIsResolved_not_resolved() {
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(feedback1);
		assertFalse(result);
	}
	
	@Test
	public void testGetFeedbackIsResolved_is_resolved() {
		IFeedback.INSTANCE.setFeedbackIsResolved(feedback1, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(feedback1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetFeedbackResolved_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackIsResolved("");
	}

	@Test
	public void testGetFeedbackIsNoted_not_noted() {
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(feedback1);
		assertFalse(result);
	}
	
	@Test
	public void testGetFeedbackIsNoted_is_noted() {
		IFeedback.INSTANCE.setFeedbackIsNoted(feedback1, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(feedback1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotedResolved_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackIsNoted("");
	}

	@Test
	public void testSetFeedbackDescription() {
		IFeedback.INSTANCE.setFeedbackDescription(feedback1, "bcbcbcbc");
		String result = IFeedback.INSTANCE.getFeedbackDescription(feedback1);
		assertTrue(result == "bcbcbcbc");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetFeedbackDescription_id_not_exists() {
		IFeedback.INSTANCE.setFeedbackDescription("", "");
	}

	@Test
	public void testSetFeedbackIsResolved() {
		IFeedback.INSTANCE.setFeedbackIsResolved(feedback1, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(feedback1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetFeedbackIsResolved_id_not_exists() {
		IFeedback.INSTANCE.setFeedbackIsResolved("", true);
	}

	@Test
	public void testSetFeedbackIsNoted() {
		IFeedback.INSTANCE.setFeedbackIsNoted(feedback1, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(feedback1);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetFeedbackIsNoted_id_not_exists() {
		IFeedback.INSTANCE.setFeedbackIsNoted("", true);
	}

	@Test
	public void testSearchFeedback_feedbackEmpty_expectEmptyList() {
		tearDown();
		boolean result = IFeedback.INSTANCE.searchFeedback("ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchFeedback_feedbackNotEmpty_expectEmptyList() {
		boolean result = IFeedback.INSTANCE.searchFeedback("xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchFeedback_expectsListNonNull() {
		List<String> list = IFeedback.INSTANCE.searchFeedback("xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchFeedback_idMatchExactly() {
		List<String> list = IFeedback.INSTANCE.searchFeedback("abababababahej");
		assertTrue(IFeedback.INSTANCE.getFeedbackDescription(list.get(0)).equals("abababababahej"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchFeedback_idMatchSomewhat() {
		List<String> list = IFeedback.INSTANCE.searchFeedback("bab");
		assertTrue(IFeedback.INSTANCE.getFeedbackDescription(list.get(0)).equals("abababababahej"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchFeedback_multipleMatches() {
		List<String> list = IFeedback.INSTANCE.searchFeedback("hej");
		assertTrue(list.size() == 2);
	}

	@Test
	public void testAddFeedback() {
		tearDown();
		
		String feedbackID = IFeedback.INSTANCE.addFeedback("bcbcbcbcbc");
		String result = IFeedback.INSTANCE.getFeedbackDescription(feedbackID);
		
		assertTrue(result == "bcbcbcbcbc");
	}
	
	@Test
	public void testRemoveFeedback() {
		IFeedback.INSTANCE.removeFeedback(feedback1);
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveFeedback_id_not_exists() {
		IFeedback.INSTANCE.removeFeedback("");
	}

}