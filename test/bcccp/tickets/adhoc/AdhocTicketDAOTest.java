/*
 11618519- Ammar Zafar Raja
 Junit Testing
 */
package bcccp.tickets.adhoc;

import java.util.List;
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
public class AdhocTicketDAOTest {
    
    public AdhocTicketDAOTest() {
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
     * Test of createTicket method, of class AdhocTicketDAO.
     */
    @Test
    public void testCreateTicket() {
        System.out.println("Ticket created");
        String carparkId = "";
        AdhocTicketDAO instance = null;
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.createTicket(carparkId);
        assertEquals(expResult, result);
        // TODO review the generated test code.
        
    }

    /**
     * Test of findTicketByBarcode method, of class AdhocTicketDAO.
     */
    @Test
    public void testFindTicketByBarcode() {
        System.out.println("findTicketByBarcode");
        String barcode = "";
        AdhocTicketDAO instance = null;
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.findTicketByBarcode(barcode);
        assertEquals(expResult, result);
        // TODO review the generated test code.
        
    }

    /**
     * Test of getCurrentTickets method, of class AdhocTicketDAO.
     */
    @Test
    public void testGetCurrentTickets() {
        System.out.println("getCurrentTickets");
        AdhocTicketDAO instance = null;
        List<IAdhocTicket> expResult = null;
        List<IAdhocTicket> result = instance.getCurrentTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code.
        
    }
    
}
