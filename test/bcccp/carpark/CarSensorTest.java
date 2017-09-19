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
public class CarSensorTest {
    
    public CarSensorTest() {
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
     * Test of main method, of class CarSensor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CarSensor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerResponder method, of class CarSensor.
     */
    @Test
    public void testRegisterResponder() {
        System.out.println("registerResponder");
        ICarSensorResponder responder = null;
        CarSensor instance = null;
        instance.registerResponder(responder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterResponder method, of class CarSensor.
     */
    @Test
    public void testDeregisterResponder() {
        System.out.println("deregisterResponder");
        ICarSensorResponder responder = null;
        CarSensor instance = null;
        instance.deregisterResponder(responder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CarSensor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CarSensor instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carIsDetected method, of class CarSensor.
     */
    @Test
    public void testCarIsDetected() {
        System.out.println("carIsDetected");
        CarSensor instance = null;
        boolean expResult = false;
        boolean result = instance.carIsDetected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
