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
public class RectangleTest {
    
    public RectangleTest() {
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
    public void testBadInitializerHeight() {
        System.out.println("Rectangle negative case - bad height initializer");
        try {
            Rectangle instance = new Rectangle(-1.0, 1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal height initializer did not return correct exception");
    }
    
    @Test
    public void testBadInitializerWidth() {
        System.out.println("Rectangle negative case - bad width initializer");
        try {
            Rectangle instance = new Rectangle(1.0, -1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal width initializer did not return correct exception");
    }

    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = new Rectangle(1.0, 2.0);
        double expResult = 1.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle(1.0, 2.0);
        double expResult = 2.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetArea() {
        System.out.println("Rectangle.getArea positive test");
        Rectangle instance = new Rectangle(3.0, 2.0);
        double expResult = 6.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetPerimeter() {
        System.out.println("Rectangle.getPerimeter positive test");
        Rectangle instance = new Rectangle(2.0, 3.0);
        double expResult = 10.0;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }
    
}
