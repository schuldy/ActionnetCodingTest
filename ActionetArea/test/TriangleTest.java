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
public class TriangleTest {
    
    public TriangleTest() {
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
    public void testBadInitializerSideA() {
        System.out.println("Triabgle negative case - bad sideA initializer");
        try {
            Triangle instance = new Triangle(-4.0, 5.0, 6.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal sideA initializer did not return correct exception");
    }
    
    @Test
    public void testBadInitializerSideB() {
        System.out.println("Triabgle negative case - bad sideB initializer");
        try {
            Triangle instance = new Triangle(4.0, -5.0, 6.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal sideB initializer did not return correct exception");
    }
    
    @Test
    public void testBadInitializerSideC() {
        System.out.println("Triabgle negative case - bad sideC initializer");
        try {
            Triangle instance = new Triangle(4.0, 5.0,-6.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal sideC initializer did not return correct exception");
    }
    
    @Test
    public void testGetSideA() {
        System.out.println("getSideA");
        Triangle instance = new Triangle(4.0, 5.0, 6.0);
        double expResult = 4.0;
        double result = instance.getSideA();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetSideB() {
        System.out.println("getSideB");
        Triangle instance = new Triangle(4.0, 5.0, 6.0);
        double expResult = 5.0;
        double result = instance.getSideB();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetSideC() {
        System.out.println("getSideC");
        Triangle instance = new Triangle(4.0, 5.0, 6.0);
        double expResult = 6.0;
        double result = instance.getSideC();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getArea method, of class Triangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Triangle instance = new Triangle(4.0, 5.0, 6.0);
        double expResult = 9.9216;
        double result = instance.getArea();
        // I could make this more exact... but let's use error margin instead
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getPerimeter method, of class Triangle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Triangle instance = new Triangle(4.0, 5.0, 6.0);
        double expResult = 15.0;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }
    
}
