/*
 11618519- Ammar Zafar Raja
 Junit Testing of Entry Controller module.
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
 * @author 11618519- Ammar Zafar Raja
 */
public class EntryControllerTest {
    
    public EntryControllerTest() {
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
     * Test of carEventDetected method, of class EntryController.
     */
    @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        String detectorId = "";
        boolean carDetected = false;
        EntryController instance = null;
        instance.carEventDetected(detectorId, carDetected);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buttonPushed method, of class EntryController.
     */
    @Test
    public void testButtonPushed() {
        System.out.println("buttonPushed");
        EntryController instance = null;
        instance.buttonPushed();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ticketInserted method, of class EntryController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String barcode = "";
        EntryController instance = null;
        instance.ticketInserted(barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketTaken method, of class EntryController.
     */
    @Test
    public void testTicketTaken() {
        System.out.println("ticketTaken");
        EntryController instance = null;
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of notifyCarparkEvent method, of class EntryController.
     */
    @Test
    public void testNotifyCarparkEvent() {
        System.out.println("notifyCarparkEvent");
        EntryController instance = null;
        instance.notifyCarparkEvent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
