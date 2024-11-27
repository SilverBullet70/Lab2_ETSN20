import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EP_TestCases {
	
	private Triangle rightAngledTriangle;
	
	
	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		rightAngledTriangle = new Triangle(3, 4, 5);
	}

	@After
	/*
	 *   Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		rightAngledTriangle = null;
	}
	
	@Test
	public void testIsRightAngledValid() {
		assertTrue(rightAngledTriangle.isRightAngled());
		
	}
}
