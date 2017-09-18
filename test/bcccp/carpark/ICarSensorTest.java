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
public class ICarSensorTest {
    
    public ICarSensorTest() {
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
     * Test of registerResponder method, of class ICarSensor.
     */
    @Test
    public void testRegisterResponder() {
        System.out.println("registerResponder");
        ICarSensorResponder responder = null;
        ICarSensor instance = new ICarSensorImpl();
        instance.registerResponder(responder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterResponder method, of class ICarSensor.
     */
    @Test
    public void testDeregisterResponder() {
        System.out.println("deregisterResponder");
        ICarSensorResponder responder = null;
        ICarSensor instance = new ICarSensorImpl();
        instance.deregisterResponder(responder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class ICarSensor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ICarSensor instance = new ICarSensorImpl();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carIsDetected method, of class ICarSensor.
     */
    @Test
    public void testCarIsDetected() {
        System.out.println("carIsDetected");
        ICarSensor instance = new ICarSensorImpl();
        boolean expResult = false;
        boolean result = instance.carIsDetected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICarSensorImpl implements ICarSensor {

        public void registerResponder(ICarSensorResponder responder) {
        }

        public void deregisterResponder(ICarSensorResponder responder) {
        }

        public String getId() {
            return "";
        }

        public boolean carIsDetected() {
            return false;
        }
    }
    
}
