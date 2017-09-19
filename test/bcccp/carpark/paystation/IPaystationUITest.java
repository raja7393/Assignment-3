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
public class IPaystationUITest {
    
    public IPaystationUITest() {
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
     * Test of registerController method, of class IPaystationUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IPaystationController controller = null;
        IPaystationUI instance = new IPaystationUIImpl();
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class IPaystationUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        IPaystationUI instance = new IPaystationUIImpl();
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicket method, of class IPaystationUI.
     */
    @Test
    public void testPrintTicket() {
        System.out.println("printTicket");
        String carparkId = "";
        int ticketNo = 0;
        long entryTime = 0L;
        long paidTime = 0L;
        float charge = 0.0F;
        String barcode = "";
        IPaystationUI instance = new IPaystationUIImpl();
        instance.printTicket(carparkId, ticketNo, entryTime, paidTime, charge, barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class IPaystationUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "";
        IPaystationUI instance = new IPaystationUIImpl();
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beep method, of class IPaystationUI.
     */
    @Test
    public void testBeep() {
        System.out.println("beep");
        IPaystationUI instance = new IPaystationUIImpl();
        instance.beep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPaystationUIImpl implements IPaystationUI {

        public void registerController(IPaystationController controller) {
        }

        public void deregisterController() {
        }

        public void printTicket(String carparkId, int ticketNo, long entryTime, long paidTime, float charge, String barcode) {
        }

        public void display(String message) {
        }

        public void beep() {
        }
    }
    
}
