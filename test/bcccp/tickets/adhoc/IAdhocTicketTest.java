/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

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
public class IAdhocTicketTest {
    
    public IAdhocTicketTest() {
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
     * Test of getTicketNo method, of class IAdhocTicket.
     */
    @Test
    public void testGetTicketNo() {
        System.out.println("getTicketNo");
        IAdhocTicket instance = new IAdhocTicketImpl();
        int expResult = 0;
        int result = instance.getTicketNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarcode method, of class IAdhocTicket.
     */
    @Test
    public void testGetBarcode() {
        System.out.println("getBarcode");
        IAdhocTicket instance = new IAdhocTicketImpl();
        String expResult = "";
        String result = instance.getBarcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarparkId method, of class IAdhocTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        IAdhocTicket instance = new IAdhocTicketImpl();
        String expResult = "";
        String result = instance.getCarparkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enter method, of class IAdhocTicket.
     */
    @Test
    public void testEnter() {
        System.out.println("enter");
        long dateTime = 0L;
        IAdhocTicket instance = new IAdhocTicketImpl();
        instance.enter(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntryDateTime method, of class IAdhocTicket.
     */
    @Test
    public void testGetEntryDateTime() {
        System.out.println("getEntryDateTime");
        IAdhocTicket instance = new IAdhocTicketImpl();
        long expResult = 0L;
        long result = instance.getEntryDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCurrent method, of class IAdhocTicket.
     */
    @Test
    public void testIsCurrent() {
        System.out.println("isCurrent");
        IAdhocTicket instance = new IAdhocTicketImpl();
        boolean expResult = false;
        boolean result = instance.isCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pay method, of class IAdhocTicket.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        long dateTime = 0L;
        float charge = 0.0F;
        IAdhocTicket instance = new IAdhocTicketImpl();
        instance.pay(dateTime, charge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaidDateTime method, of class IAdhocTicket.
     */
    @Test
    public void testGetPaidDateTime() {
        System.out.println("getPaidDateTime");
        IAdhocTicket instance = new IAdhocTicketImpl();
        long expResult = 0L;
        long result = instance.getPaidDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaid method, of class IAdhocTicket.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        IAdhocTicket instance = new IAdhocTicketImpl();
        boolean expResult = false;
        boolean result = instance.isPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class IAdhocTicket.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        IAdhocTicket instance = new IAdhocTicketImpl();
        float expResult = 0.0F;
        float result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class IAdhocTicket.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        long dateTime = 0L;
        IAdhocTicket instance = new IAdhocTicketImpl();
        instance.exit(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitDateTime method, of class IAdhocTicket.
     */
    @Test
    public void testGetExitDateTime() {
        System.out.println("getExitDateTime");
        IAdhocTicket instance = new IAdhocTicketImpl();
        long expResult = 0L;
        long result = instance.getExitDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasExited method, of class IAdhocTicket.
     */
    @Test
    public void testHasExited() {
        System.out.println("hasExited");
        IAdhocTicket instance = new IAdhocTicketImpl();
        boolean expResult = false;
        boolean result = instance.hasExited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IAdhocTicketImpl implements IAdhocTicket {

        public int getTicketNo() {
            return 0;
        }

        public String getBarcode() {
            return "";
        }

        public String getCarparkId() {
            return "";
        }

        public void enter(long dateTime) {
        }

        public long getEntryDateTime() {
            return 0L;
        }

        public boolean isCurrent() {
            return false;
        }

        public void pay(long dateTime, float charge) {
        }

        public long getPaidDateTime() {
            return 0L;
        }

        public boolean isPaid() {
            return false;
        }

        public float getCharge() {
            return 0.0F;
        }

        public void exit(long dateTime) {
        }

        public long getExitDateTime() {
            return 0L;
        }

        public boolean hasExited() {
            return false;
        }
    }
    
}
