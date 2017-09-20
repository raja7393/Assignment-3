/*
 11618519- Ammar Zafar Raja
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
public class IEntryControllerTest {
    
    public IEntryControllerTest() {
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
     * Test of buttonPushed method, of class IEntryController.
     */
    @Test
    public void testButtonPushed() {
        System.out.println("buttonPushed");
        IEntryController instance = new IEntryControllerImpl();
        instance.buttonPushed();
        // TODO review the generated test code.
        
    }

    /**
     * Test of ticketInserted method, of class IEntryController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String barcode = "";
        IEntryController instance = new IEntryControllerImpl();
        instance.ticketInserted(barcode);
        // TODO review the generated test code.
        
    }

    /**
     * Test of ticketTaken method, of class IEntryController.
     */
    @Test
    public void testTicketTaken() {
        System.out.println("ticketTaken");
        IEntryController instance = new IEntryControllerImpl();
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class IEntryControllerImpl implements IEntryController {

        public void buttonPushed() {
        }

        public void ticketInserted(String barcode) {
        }

        public void ticketTaken() {
        }
    }
    
}
