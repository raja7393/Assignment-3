/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11618519
 */
public class IGateTest {
    
    public IGateTest() {
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
     * Test of raise method, of class IGate.
     */
    @Test
    public void testRaise() {
        System.out.println("raise");
        IGate instance = new IGateImpl();
        instance.raise();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lower method, of class IGate.
     */
    @Test
    public void testLower() {
        System.out.println("lower");
        IGate instance = new IGateImpl();
        instance.lower();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRaised method, of class IGate.
     */
    @Test
    public void testIsRaised() {
        System.out.println("isRaised");
        IGate instance = new IGateImpl();
        boolean expResult = false;
        boolean result = instance.isRaised();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IGateImpl implements IGate {

        public void raise() {
        }

        public void lower() {
        }

        public boolean isRaised() {
            return false;
        }
    }
    
}
