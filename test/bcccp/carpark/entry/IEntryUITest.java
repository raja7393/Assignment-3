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
public class IEntryUITest {
    
    public IEntryUITest() {
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
     * Test of registerController method, of class IEntryUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IEntryController controller = null;
        IEntryUI instance = new IEntryUIImpl();
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class IEntryUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        IEntryUI instance = new IEntryUIImpl();
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class IEntryUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "";
        IEntryUI instance = new IEntryUIImpl();
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicket method, of class IEntryUI.
     */
    @Test
    public void testPrintTicket() {
        System.out.println("printTicket");
        String id = "";
        int tNo = 0;
        long entryDatetime = 0L;
        String barcode = "";
        IEntryUI instance = new IEntryUIImpl();
        instance.printTicket(id, tNo, entryDatetime, barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketPrinted method, of class IEntryUI.
     */
    @Test
    public void testTicketPrinted() {
        System.out.println("ticketPrinted");
        IEntryUI instance = new IEntryUIImpl();
        boolean expResult = false;
        boolean result = instance.ticketPrinted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discardTicket method, of class IEntryUI.
     */
    @Test
    public void testDiscardTicket() {
        System.out.println("discardTicket");
        IEntryUI instance = new IEntryUIImpl();
        instance.discardTicket();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beep method, of class IEntryUI.
     */
    @Test
    public void testBeep() {
        System.out.println("beep");
        IEntryUI instance = new IEntryUIImpl();
        instance.beep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IEntryUIImpl implements IEntryUI {

        public void registerController(IEntryController controller) {
        }

        public void deregisterController() {
        }

        public void display(String message) {
        }

        public void printTicket(String id, int tNo, long entryDatetime, String barcode) {
        }

        public boolean ticketPrinted() {
            return false;
        }

        public void discardTicket() {
        }

        public void beep() {
        }
    }
    
}
