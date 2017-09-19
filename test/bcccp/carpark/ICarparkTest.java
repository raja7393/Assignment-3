/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.season.ISeasonTicket;
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
public class ICarparkTest {
    
    public ICarparkTest() {
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
     * Test of register method, of class ICarpark.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        ICarparkObserver observer = null;
        ICarpark instance = new ICarparkImpl();
        instance.register(observer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregister method, of class ICarpark.
     */
    @Test
    public void testDeregister() {
        System.out.println("deregister");
        ICarparkObserver observer = null;
        ICarpark instance = new ICarparkImpl();
        instance.deregister(observer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ICarpark.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ICarpark instance = new ICarparkImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class ICarpark.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ICarpark instance = new ICarparkImpl();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of issueAdhocTicket method, of class ICarpark.
     */
    @Test
    public void testIssueAdhocTicket() {
        System.out.println("issueAdhocTicket");
        ICarpark instance = new ICarparkImpl();
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.issueAdhocTicket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordAdhocTicketEntry method, of class ICarpark.
     */
    @Test
    public void testRecordAdhocTicketEntry() {
        System.out.println("recordAdhocTicketEntry");
        ICarpark instance = new ICarparkImpl();
        instance.recordAdhocTicketEntry();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdhocTicket method, of class ICarpark.
     */
    @Test
    public void testGetAdhocTicket() {
        System.out.println("getAdhocTicket");
        String barcode = "";
        ICarpark instance = new ICarparkImpl();
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.getAdhocTicket(barcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAddHocTicketCharge method, of class ICarpark.
     */
    @Test
    public void testCalculateAddHocTicketCharge() {
        System.out.println("calculateAddHocTicketCharge");
        long entryDateTime = 0L;
        ICarpark instance = new ICarparkImpl();
        float expResult = 0.0F;
        float result = instance.calculateAddHocTicketCharge(entryDateTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordAdhocTicketExit method, of class ICarpark.
     */
    @Test
    public void testRecordAdhocTicketExit() {
        System.out.println("recordAdhocTicketExit");
        ICarpark instance = new ICarparkImpl();
        instance.recordAdhocTicketExit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerSeasonTicket method, of class ICarpark.
     */
    @Test
    public void testRegisterSeasonTicket() {
        System.out.println("registerSeasonTicket");
        ISeasonTicket seasonTicket = null;
        ICarpark instance = new ICarparkImpl();
        instance.registerSeasonTicket(seasonTicket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterSeasonTicket method, of class ICarpark.
     */
    @Test
    public void testDeregisterSeasonTicket() {
        System.out.println("deregisterSeasonTicket");
        ISeasonTicket seasonTicket = null;
        ICarpark instance = new ICarparkImpl();
        instance.deregisterSeasonTicket(seasonTicket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSeasonTicketValid method, of class ICarpark.
     */
    @Test
    public void testIsSeasonTicketValid() {
        System.out.println("isSeasonTicketValid");
        String ticketId = "";
        ICarpark instance = new ICarparkImpl();
        boolean expResult = false;
        boolean result = instance.isSeasonTicketValid(ticketId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSeasonTicketInUse method, of class ICarpark.
     */
    @Test
    public void testIsSeasonTicketInUse() {
        System.out.println("isSeasonTicketInUse");
        String ticketId = "";
        ICarpark instance = new ICarparkImpl();
        boolean expResult = false;
        boolean result = instance.isSeasonTicketInUse(ticketId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordSeasonTicketEntry method, of class ICarpark.
     */
    @Test
    public void testRecordSeasonTicketEntry() {
        System.out.println("recordSeasonTicketEntry");
        String ticketId = "";
        ICarpark instance = new ICarparkImpl();
        instance.recordSeasonTicketEntry(ticketId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordSeasonTicketExit method, of class ICarpark.
     */
    @Test
    public void testRecordSeasonTicketExit() {
        System.out.println("recordSeasonTicketExit");
        String ticketId = "";
        ICarpark instance = new ICarparkImpl();
        instance.recordSeasonTicketExit(ticketId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICarparkImpl implements ICarpark {

        public void register(ICarparkObserver observer) {
        }

        public void deregister(ICarparkObserver observer) {
        }

        public String getName() {
            return "";
        }

        public boolean isFull() {
            return false;
        }

        public IAdhocTicket issueAdhocTicket() {
            return null;
        }

        public void recordAdhocTicketEntry() {
        }

        public IAdhocTicket getAdhocTicket(String barcode) {
            return null;
        }

        public float calculateAddHocTicketCharge(long entryDateTime) {
            return 0.0F;
        }

        public void recordAdhocTicketExit() {
        }

        public void registerSeasonTicket(ISeasonTicket seasonTicket) {
        }

        public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
        }

        public boolean isSeasonTicketValid(String ticketId) {
            return false;
        }

        public boolean isSeasonTicketInUse(String ticketId) {
            return false;
        }

        public void recordSeasonTicketEntry(String ticketId) {
        }

        public void recordSeasonTicketExit(String ticketId) {
        }
    }
    
}
