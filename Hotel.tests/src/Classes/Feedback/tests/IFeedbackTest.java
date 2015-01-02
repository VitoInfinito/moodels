package Classes.Feedback.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Feedback.IFeedback;
import Classes.Utils.InvalidIDException;

public class IFeedbackTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IFeedback.INSTANCE.addFeedback("abababababa");
	}
	
	@After
	public void tearDown() throws Exception {
		if (IFeedback.INSTANCE.getAllFeedbackIDs().size() > 0) {
			String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
			IFeedback.INSTANCE.removeFeedback(id);
		}
	}
	
	@Test
	public void testGetAllFeedbackIDsEmptyExpectEmpty() throws Exception {
		tearDown();
		
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllFeedbackIDsNotEmpty() {
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 1);
	}

	@Test
	public void testGetFeedbackDescription() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		String result = IFeedback.INSTANCE.getFeedbackDescription(id);
		assertTrue(result == "abababababa");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetFeedbackDescription_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackDescription("");
	}
	
	@Test
	public void testGetFeedbackIsResolved_not_resolved() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(id);
		assertFalse(result);
	}
	
	@Test
	public void testGetFeedbackIsResolved_is_resolved() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.setFeedbackIsResolved(id, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(id);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetFeedbackResolved_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackIsResolved("");
	}

	@Test
	public void testGetFeedbackIsNoted_not_noted() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(id);
		assertFalse(result);
	}
	
	@Test
	public void testGetFeedbackIsNoted_is_noted() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.setFeedbackIsNoted(id, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(id);
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNotedResolved_id_not_exists() {
		IFeedback.INSTANCE.getFeedbackIsNoted("");
	}

	@Test
	public void testSetFeedbackDescription() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.setFeedbackDescription(id, "bcbcbcbc");
		String result = IFeedback.INSTANCE.getFeedbackDescription(id);
		assertTrue(result == "bcbcbcbc");
	}

	@Test
	public void testSetFeedbackIsResolved() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.setFeedbackIsResolved(id, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsResolved(id);
		assertTrue(result);
	}

	@Test
	public void testSetFeedbackIsNoted() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.setFeedbackIsNoted(id, true);
		Boolean result = IFeedback.INSTANCE.getFeedbackIsNoted(id);
		assertTrue(result);
	}

	@Test
	public void testSearchFeedback() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddFeedback() throws Exception {
		tearDown();
		
		IFeedback.INSTANCE.addFeedback("bcbcbcbcbc");
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		String result = IFeedback.INSTANCE.getFeedbackDescription(id);
		
		assertTrue(result == "bcbcbcbcbc");
	}
	
	@Test
	public void testRemoveFeedback() {
		String id = IFeedback.INSTANCE.getAllFeedbackIDs().get(0);
		IFeedback.INSTANCE.removeFeedback(id);
		int result = IFeedback.INSTANCE.getAllFeedbackIDs().size();
		assertTrue(result == 0);
	}

}