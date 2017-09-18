/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.paystation;

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
public class PaystationUITest {
    
    public PaystationUITest() {
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
     * Test of main method, of class PaystationUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PaystationUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerController method, of class PaystationUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IPaystationController controller = null;
        PaystationUI instance = null;
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class PaystationUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        PaystationUI instance = null;
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class PaystationUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "";
        PaystationUI instance = null;
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beep method, of class PaystationUI.
     */
    @Test
    public void testBeep() {
        System.out.println("beep");
        PaystationUI instance = null;
        instance.beep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicket method, of class PaystationUI.
     */
    @Test
    public void testPrintTicket() {
        System.out.println("printTicket");
        String carparkId = "";
        int tNo = 0;
        long entryTime = 0L;
        long paidTime = 0L;
        float charge = 0.0F;
        String barcode = "";
        PaystationUI instance = null;
        instance.printTicket(carparkId, tNo, entryTime, paidTime, charge, barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
