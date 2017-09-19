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
public class GateTest {
    
    public GateTest() {
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
     * Test of main method, of class Gate.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Gate.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of raise method, of class Gate.
     */
    @Test
    public void testRaise() {
        System.out.println("raise");
        Gate instance = null;
        instance.raise();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lower method, of class Gate.
     */
    @Test
    public void testLower() {
        System.out.println("lower");
        Gate instance = null;
        instance.lower();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRaised method, of class Gate.
     */
    @Test
    public void testIsRaised() {
        System.out.println("isRaised");
        Gate instance = null;
        boolean expResult = false;
        boolean result = instance.isRaised();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
