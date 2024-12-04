import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EP_TestCases {

	private Triangle validEqualateralTriangle;
	private Triangle invalidEqualateralTriangle;
	private Triangle validIsoscelesTriangle;
	private Triangle invalidIsoscelesTriangle;
	private Triangle validRightTriangle;
	private Triangle invalidRightTriangle;
	private Triangle validScaleneTriangle;
	private Triangle invalidScaleneTriangle;
	private Triangle validImpossibleTriangle;
	private Triangle invalidImpossibleTriangle;
	private Triangle equalateralTriangle;
	private Triangle isoscelesTriangle;
	private Triangle rightTriangle;
	private Triangle scaleneTriangle;
	private Triangle impossibleTriangle;
	private Triangle triangleArea;
	private Triangle invalidTriangleArea;
	private Triangle perimeter;
	private Triangle invalidPerimeter;

	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		validEqualateralTriangle = new Triangle(10, 10, 10);
		invalidEqualateralTriangle = new Triangle(10, 4, 5);
		validIsoscelesTriangle = new Triangle(10, 10, 5);
		invalidIsoscelesTriangle = new Triangle(10, 5, 3);
		validRightTriangle = new Triangle(3, 4, 5);
		invalidRightTriangle = new Triangle(2, 4, 6);
		validScaleneTriangle = new Triangle(10, 4, 5);
		invalidScaleneTriangle = new Triangle(10, 10, 10);
		validImpossibleTriangle = new Triangle(3, 5, 9);
		invalidImpossibleTriangle = new Triangle(3, 3, 3);
		equalateralTriangle = new Triangle(10, 10, 10);
		isoscelesTriangle = new Triangle(10, 10, 5);
		rightTriangle = new Triangle(3, 4, 5);
		scaleneTriangle = new Triangle(10, 4, 5);
		impossibleTriangle = new Triangle(1, 1, 3);
		triangleArea = new Triangle(3, 4, 5);
		invalidTriangleArea = new Triangle(-1, 3, 4);
		perimeter = new Triangle(3, 4, 5);
		invalidPerimeter = new Triangle(-1, 3, 4);

	}

	@After
	/*
	 * Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		validEqualateralTriangle = null;
	}

	@Test
	public void testIsEqualateralValid() {
		assertTrue(validEqualateralTriangle.isEquilateral());

	}

	@Test
	public void testIsEqualateralInvalid() {
		assertFalse(invalidEqualateralTriangle.isEquilateral());

	}

	@Test
	public void testIsIsoscelesValid() {
		assertTrue(validIsoscelesTriangle.isIsosceles());

	}

	@Test
	public void testIsIsoscelesInvalid() {
		assertFalse(invalidIsoscelesTriangle.isIsosceles());

	}

	@Test
	public void testIsRightTriangleValid() {
		assertTrue(validRightTriangle.isRightAngled());

	}

	@Test
	public void testIsRightTriangleInvalid() {
		assertFalse(invalidRightTriangle.isRightAngled());

	}

	@Test
	public void testIsScaleneTriangleValid() {
		assertTrue(validScaleneTriangle.isScalene());
		
	}
	@Test
	public void testIsScaleneTriangleInvalid() {
		assertFalse(invalidScaleneTriangle.isScalene());

	}

	@Test
	public void testImpossibleTriangleValid() {
		assertTrue(validImpossibleTriangle.isImpossible());

	}

	@Test
	public void testImpossibleTriangleInvalid() {
		assertFalse(invalidImpossibleTriangle.isImpossible());

	}

	@Test
	public void testEqualateralTriangle() {
		assertEquals(equalateralTriangle.classify(), "equilateral");

	}

	@Test
	public void testIsoscelesTriangle() {
		assertEquals(isoscelesTriangle.classify(), "isosceles");

	}

	@Test
	public void testRightTriangle() {
		assertEquals(rightTriangle.classify(), "right-angled");

	}

	@Test
	public void testScaleneTriangle() {
		assertEquals(scaleneTriangle.classify(), "scalene");

	}

	@Test
	public void testImpossibleTriangle() {
		assertEquals(impossibleTriangle.classify(), "impossible");

	}

	@Test
	public void testgetArea() {
		assertEquals(triangleArea.getArea(), 6.0, 1);

	}

	@Test
	public void testInvalidgetArea() {
		assertEquals(invalidTriangleArea.getArea(), -1.0, 1);

	}

	@Test
	public void testPerimeter() {
		assertEquals(perimeter.getPerimeter(), 12, 1);

	}

	@Test
	public void testInvalidPerimeter() {
		assertEquals(invalidPerimeter.getPerimeter(), -1.0, 1);

	}
}