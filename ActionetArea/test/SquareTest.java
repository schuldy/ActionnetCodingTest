/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class SquareTest {
    
    public SquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testBadInitializer() {
        System.out.println("Square negative case - bad side initializer");
        try {
            Square instance = new Square(-1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal side initializer did not return correct exception");
    }
    
    @Test
    public void testGetSide() {
        System.out.println("getSide");
        Square instance = new Square(2.0);
        double expResult = 2.0;
        double result = instance.getSide();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetArea() {
        System.out.println("Square.getArea positive test");
        Square instance = new Square(3.0);
        double expResult = 9.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetPerimeter() {
        System.out.println("Square.getPerimeter positive test");
        Square instance = new Square(2.0);
        double expResult = 8.0;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }
    
}
