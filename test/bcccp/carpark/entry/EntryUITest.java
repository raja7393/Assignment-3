/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.entry;

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
public class EntryUITest {
    
    public EntryUITest() {
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
     * Test of main method, of class EntryUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EntryUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerController method, of class EntryUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IEntryController controller = null;
        EntryUI instance = null;
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class EntryUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        EntryUI instance = null;
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class EntryUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "";
        EntryUI instance = null;
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beep method, of class EntryUI.
     */
    @Test
    public void testBeep() {
        System.out.println("beep");
        EntryUI instance = null;
        instance.beep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicket method, of class EntryUI.
     */
    @Test
    public void testPrintTicket() {
        System.out.println("printTicket");
        String carparkId = "";
        int tNo = 0;
        long datetime = 0L;
        String barcode = "";
        EntryUI instance = null;
        instance.printTicket(carparkId, tNo, datetime, barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discardTicket method, of class EntryUI.
     */
    @Test
    public void testDiscardTicket() {
        System.out.println("discardTicket");
        EntryUI instance = null;
        instance.discardTicket();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketPrinted method, of class EntryUI.
     */
    @Test
    public void testTicketPrinted() {
        System.out.println("ticketPrinted");
        EntryUI instance = null;
        boolean expResult = false;
        boolean result = instance.ticketPrinted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
