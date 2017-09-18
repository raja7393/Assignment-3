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
public class ICarSensorResponderTest {
    
    public ICarSensorResponderTest() {
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
     * Test of carEventDetected method, of class ICarSensorResponder.
     */
    @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        String detectorId = "";
        boolean detected = false;
        ICarSensorResponder instance = new ICarSensorResponderImpl();
        instance.carEventDetected(detectorId, detected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICarSensorResponderImpl implements ICarSensorResponder {

        public void carEventDetected(String detectorId, boolean detected) {
        }
    }
    
}
