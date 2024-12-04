import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BVA_TestCases {
	
	// Equilateral Triangle Tests
	private Triangle invalidEquilateral1; // Invalid equilateral triangle
	private Triangle invalidEquilateral2; // Invalid equilateral triangle
	private Triangle validEquilateral;    // Valid equilateral triangle

	// Isosceles Triangle Tests
	private Triangle invalidIsosceles1;   // Invalid isosceles triangle
	private Triangle invalidIsosceles2;   // Invalid isosceles triangle
	private Triangle validIsosceles;      // Valid isosceles triangle

	// Right-Angled Triangle Tests
	private Triangle invalidRightAngled1; // Invalid right triangle
	private Triangle invalidRightAngled2; // Invalid right triangle
	private Triangle validRightAngled;    // Valid right triangle

	// Scalene Triangle Tests
	private Triangle invalidScalene;      // Invalid scalene triangle
	private Triangle validScalene;        // Valid scalene triangle

	// Right-Angled & Scalene Triangle Tests
	private Triangle validScaleneRightAngled; // Valid scalene & right-angled triangle

	// Impossible Triangle Tests
	private Triangle invalidImpossible;   // Invalid impossible triangle
	private Triangle validImpossible;     // Valid impossible triangle

	private Triangle validTriangle;
	private Triangle invalidTriangle;
	
	
	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		// Equilateral Triangle Tests
		invalidEquilateral1 = new Triangle(10, 10, 9);  // Invalid equilateral triangle
		invalidEquilateral2 = new Triangle(10, 10, 11); // Invalid equilateral triangle
		validEquilateral = new Triangle(10, 10, 10);    // Valid equilateral triangle

		// Isosceles Triangle Tests
		invalidIsosceles1 = new Triangle(10, 11, 12);   // Invalid isosceles triangle
		invalidIsosceles2 = new Triangle(10, 9, 12);    // Invalid isosceles triangle
		validIsosceles = new Triangle(10, 10, 12);      // Valid isosceles triangle

		// Right-Angled Triangle Tests
		invalidRightAngled1 = new Triangle(3, 4, 6);    // Invalid right triangle
		invalidRightAngled2 = new Triangle(3, 4, 4);    // Invalid right triangle
		validRightAngled = new Triangle(3, 4, 5);       // Valid right triangle

		// Scalene Triangle Tests
		invalidScalene = new Triangle(10, 10, 10);      // Invalid scalene triangle
		validScalene = new Triangle(10, 11, 12);        // Valid scalene triangle

		// Right-Angled & Scalene Triangle Tests
		validScaleneRightAngled = new Triangle(3, 4, 5); // Valid scalene & right-angled triangle

		// Impossible Triangle Tests
		invalidImpossible = new Triangle(10, 10, 19);
		validImpossible = new Triangle(10, 10, 21);   
		
		  validTriangle = new Triangle(2, 4, 5);   
		    invalidTriangle = new Triangle(1, 4, 5);

	}

	@After
	/*
	 *   Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		invalidEquilateral1 = null;
		invalidEquilateral2 = null;
		validEquilateral = null;

		invalidIsosceles1 = null;
		invalidIsosceles2 = null;
		validIsosceles = null;

		invalidRightAngled1 = null;
		invalidRightAngled2 = null;
		validRightAngled = null;

		invalidScalene = null;
		validScalene = null;

		validScaleneRightAngled = null;

		invalidImpossible = null;
		validImpossible = null;

	}
	
	 // Equilateral Triangle Tests
    @Test
    public void testInvalidEquilateral1() {
        assertFalse(invalidEquilateral1.isEquilateral());
    }

    @Test
    public void testInvalidEquilateral2() {
        assertFalse(invalidEquilateral2.isEquilateral());
    }

    @Test
    public void testValidEquilateral() {
        assertTrue(validEquilateral.isEquilateral());
    }

    // Isosceles Triangle Tests
    @Test
    public void testInvalidIsosceles1() {
        assertFalse(invalidIsosceles1.isIsosceles());
    }

    @Test
    public void testInvalidIsosceles2() {
        assertFalse(invalidIsosceles2.isIsosceles());
    }

    @Test
    public void testValidIsosceles() {
        assertTrue(validIsosceles.isIsosceles());
    }

    // Right-Angled Triangle Tests
    @Test
    public void testInvalidRightAngled1() {
        assertFalse(invalidRightAngled1.isRightAngled());
    }

    @Test
    public void testInvalidRightAngled2() {
        assertFalse(invalidRightAngled2.isRightAngled());
    }

    @Test
    public void testValidRightAngled() {
        assertTrue(validRightAngled.isRightAngled());
    }

    // Scalene Triangle Tests
    @Test
    public void testInvalidScalene() {
        assertFalse(invalidScalene.isScalene());
    }

    @Test
    public void testValidScalene() {
        assertTrue(validScalene.isScalene());
    }

    @Test
    public void testValidScaleneRightAngled() {
        assertTrue(validScaleneRightAngled.isScalene());
    }

    @Test
    public void testValidRightAngledAndScalene() {
        assertTrue(validScaleneRightAngled.isRightAngled());
    }

    // Impossible Triangle Tests
    @Test
    public void testInvalidImpossible() {
        assertFalse(invalidImpossible.isImpossible());
    }
    
    @Test
    public void testValidImpossible() {
        assertTrue(validImpossible.isImpossible());
    }
    
    /********************************************************************/
    
    @Test
    public void testInvalidEquilateral1Classify() {
        assertEquals("isosceles", invalidEquilateral1.classify());
    }

    @Test
    public void testInvalidEquilateral2Classify() {
        assertEquals("isosceles", invalidEquilateral2.classify());
    }

    @Test
    public void testValidEquilateralClassify() {
        assertEquals("equilateral", validEquilateral.classify());
    }

    @Test
    public void testInvalidIsosceles1Classify() {
        assertEquals("scalene", invalidIsosceles1.classify());
    }

    @Test
    public void testInvalidIsosceles2Clagotssify() {
        assertEquals("scalene", invalidIsosceles2.classify());
    }

    @Test
    public void testValidIsoscelesClassify() {
        assertEquals("isosceles", validIsosceles.classify());
    }

    @Test
    public void testInvalidRightAngled1Classify() {
        assertEquals("scalene", invalidRightAngled1.classify());
    }

    @Test
    public void testInvalidRightAngled2Classify() {
        assertEquals("isosceles", invalidRightAngled2.classify());
    }

    @Test
    public void testInvalidScaleneClassify() {
        assertEquals("equilateral", invalidScalene.classify());
    }

    @Test
    public void testValidScaleneClassify() {
        assertEquals("scalene", validScalene.classify());
    }

    @Test
    public void testValidScaleneRightAngledInvalidClassify() {
        assertEquals("scalene", validRightAngled.classify());
    }

    @Test
    public void testValidScaleneRightAngledRightAngledClassify() {
        assertEquals("right-angled", validRightAngled.classify());
    }

    @Test
    public void testInvalidImpossibleClassify() {
        assertEquals("isosceles", invalidImpossible.classify());
    }

    @Test
    public void testValidImpossibleClassify() {
        assertEquals("impossible", validImpossible.classify());
    }
    
    /*************************************************************************/
    
    //area 
    
    @Test
    public void testValidTriangleGetArea() {
        assertEquals(3.8, validTriangle.getArea(), 0.1);
    }

    @Test
    public void testInvalidTriangleGetArea() {
        assertEquals(-1, invalidTriangle.getArea(), 0.1);
    }
    
    //Parameter
    @Test
    public void testValidTriangleGetPerimeter() {
        assertEquals(11, validTriangle.getPerimeter());
    }

    @Test
    public void testInvalidTriangleGetPerimeter() {
        assertEquals(-1, invalidTriangle.getPerimeter());
    }


}
