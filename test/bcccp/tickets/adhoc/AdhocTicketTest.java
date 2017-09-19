
package bcccp.tickets.adhoc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11618519-Ammar Zafar Raja
 */
public class AdhocTicketTest {
    
    public AdhocTicketTest() {
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
     * Test of getBarcode method, of class AdhocTicket.
     */
    @Test
    public void testGetBarcode() {
        System.out.println("getBarcode");
        AdhocTicket instance = null;
        String expResult = "";
        String result = instance.getBarcode();
        assertEquals(expResult, result);
        // TODO review the generated test code.
        
    }

    /**
     * Test of getCarparkId method, of class AdhocTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        AdhocTicket instance = null;
        String expResult = "";
        String result = instance.getCarparkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketNo method, of class AdhocTicket.
     */
    @Test
    public void testGetTicketNo() {
        System.out.println("getTicketNo");
        AdhocTicket instance = null;
        int expResult = 0;
        int result = instance.getTicketNo();
        assertEquals(expResult, result);
        // TODO review the generated test code.
        
    }

    /**
     * Test of enter method, of class AdhocTicket.
     */
    @Test
    public void testEnter() {
        System.out.println("enter");
        long entryDateTime = 0L;
        AdhocTicket instance = null;
        instance.enter(entryDateTime);
        // TODO review the generated test code.
           }

    /**
     * Test of getEntryDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetEntryDateTime() {
        System.out.println("getEntryDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
        long result = instance.getEntryDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pay method, of class AdhocTicket.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        long paidDateTime = 0L;
        float charge = 0.0F;
        AdhocTicket instance = null;
        instance.pay(paidDateTime, charge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaidDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetPaidDateTime() {
        System.out.println("getPaidDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
        long result = instance.getPaidDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class AdhocTicket.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        AdhocTicket instance = null;
        float expResult = 0.0F;
        float result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AdhocTicket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AdhocTicket instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCurrent method, of class AdhocTicket.
     */
    @Test
    public void testIsCurrent() {
        System.out.println("isCurrent");
        AdhocTicket instance = null;
        boolean expResult = false;
        boolean result = instance.isCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaid method, of class AdhocTicket.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        AdhocTicket instance = null;
        boolean expResult = false;
        boolean result = instance.isPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class AdhocTicket.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        long dateTime = 0L;
        AdhocTicket instance = null;
        instance.exit(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetExitDateTime() {
        System.out.println("getExitDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
        long result = instance.getExitDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasExited method, of class AdhocTicket.
     */
    @Test
    public void testHasExited() {
        System.out.println("hasExited");
        AdhocTicket instance = null;
        boolean expResult = false;
        boolean result = instance.hasExited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
