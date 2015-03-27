/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.shapes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tbrad_000
 */
public class ShapesTest {
    
    public ShapesTest() {
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

    /**
     * Test of label method, of class Shapes.
     */
    @Test
    public void testLabel() {
        System.out.println("label");
        int width = 0;
        Shapes instance = new Shapes();
        instance.label(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of halfBody method, of class Shapes.
     */
    @Test
    public void testHalfBody() {
        System.out.println("halfBody");
        int width = 0;
        Shapes instance = new Shapes();
        String expResult = "";
        String result = instance.halfBody(width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody method, of class Shapes.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        Shapes instance = new Shapes();
        char expResult = ' ';
        char result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody method, of class Shapes.
     */
    @Test
    public void testSetBody() {
        System.out.println("setBody");
        Shapes instance = new Shapes();
        instance.setBody();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShape method, of class Shapes.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        Shapes instance = new Shapes();
        String expResult = "";
        String result = instance.getShape();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShape method, of class Shapes.
     */
    @Test
    public void testSetShape() {
        System.out.println("setShape");
        Shapes instance = new Shapes();
        instance.setShape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Shapes.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Shapes instance = new Shapes();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Shapes.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        Shapes instance = new Shapes();
        instance.setHeight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLine method, of class Shapes.
     */
    @Test
    public void testGetLine() {
        System.out.println("getLine");
        Shapes instance = new Shapes();
        int expResult = 0;
        int result = instance.getLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLine method, of class Shapes.
     */
    @Test
    public void testSetLine() {
        System.out.println("setLine");
        Shapes instance = new Shapes();
        instance.setLine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Shapes.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Shapes instance = new Shapes();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class Shapes.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        Shapes instance = new Shapes();
        instance.setLabel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
