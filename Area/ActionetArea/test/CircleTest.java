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
public class CircleTest {
    
    public CircleTest() {
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
        System.out.println("Circle negative case - bad initializer");
        try {
            Circle instance = new Circle(-1.0);
        } catch (IllegalArgumentException iae) {
            // TODO check that the text of the exception is correct
            return;
        }
        fail("Illegal radius initializer did not return correct exception");
    }
    
    @Test
        public void testInitializer() {
        System.out.println("Circle constructor test");
        Circle instance = new Circle(23.2);
        assertEquals(23.2, instance.getRadius(), 0.0);
    }
    
    @Test
    public void testGetAreaSuccess() {
        System.out.println("Circle.getArea positive case");
        Circle instance = new Circle(1.0);
        double expResult = Math.PI;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testEdgeConditionRadiusZero() {
        System.out.println("Circle.getArea radius zero");
        Circle instance = new Circle(0.0);
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetPerimeterSuccess() {
        System.out.println("Circle.getPerimeter positive case");
        Circle instance = new Circle(1.0);
        double expResult = 2*Math.PI;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }
       
    @Test
    public void testEdgeConditionPerimeterZero() {
        System.out.println("Circle.getPerimeter radius zero");
        Circle instance = new Circle(0.0);
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }
}
