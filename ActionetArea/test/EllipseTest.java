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
public class EllipseTest {
    
    public EllipseTest() {
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
    public void testBadInitializerAxisA() {
        System.out.println("Ellipse negative case - bad axisA initializer");
        try {
            Ellipse instance = new Ellipse(-1.0, 1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal axisA initializer did not return correct exception");
    }
    
    @Test
    public void testBadInitializerAxisB() {
        System.out.println("Elipse negative case - bad axisB initializer");
        try {
            Ellipse instance = new Ellipse(1.0, -1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal axisB initializer did not return correct exception");
    }
    
    @Test
    public void testBadInitializerOrder() {
        System.out.println("Ellipse negative case - axisA < axisB");
        try {
            Ellipse instance = new Ellipse(1.0, 2.0);
        } catch (IllegalArgumentException iae) {
            // TODO check the text is correct
            return;
        }
        fail("AxisA < axisB not detected ");
    }

    @Test
    public void testGetAxisA() {
        System.out.println("getAxisA");
        Ellipse instance = new Ellipse(2.0, 1.0);
        double expResult = 2.0;
        double result = instance.getAxisA();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetAxisB() {
        System.out.println("getAxisB");
        Ellipse instance = new Ellipse(2.0, 1.0);
        double expResult = 1.0;
        double result = instance.getAxisB();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetArea() {
        System.out.println("Ellipse.getArea positive test");
        Ellipse instance = new Ellipse(3.0, 2.0);
        double expResult = 18.85;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);
    }

    @Test
    public void testGetPerimeter() {
        System.out.println("Ellipse.getPerimeter positive test");
        Ellipse instance = new Ellipse(3.0, 2.0);
        double expResult = 15.865;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.1);
    }
    
}
