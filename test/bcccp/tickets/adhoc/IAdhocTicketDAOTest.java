/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author 11618519
 */
public class IAdhocTicketDAOTest {
    
    public IAdhocTicketDAOTest() {
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
     * Test of createTicket method, of class IAdhocTicketDAO.
     */
    @Test
    public void testCreateTicket() {
        System.out.println("createTicket");
        String carparkId = "";
        IAdhocTicketDAO instance = new IAdhocTicketDAOImpl();
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.createTicket(carparkId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTicketByBarcode method, of class IAdhocTicketDAO.
     */
    @Test
    public void testFindTicketByBarcode() {
        System.out.println("findTicketByBarcode");
        String barcode = "";
        IAdhocTicketDAO instance = new IAdhocTicketDAOImpl();
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.findTicketByBarcode(barcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTickets method, of class IAdhocTicketDAO.
     */
    @Test
    public void testGetCurrentTickets() {
        System.out.println("getCurrentTickets");
        IAdhocTicketDAO instance = new IAdhocTicketDAOImpl();
        List<IAdhocTicket> expResult = null;
        List<IAdhocTicket> result = instance.getCurrentTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IAdhocTicketDAOImpl implements IAdhocTicketDAO {

        public IAdhocTicket createTicket(String carparkId) {
            return null;
        }

        public IAdhocTicket findTicketByBarcode(String barcode) {
            return null;
        }

        public List<IAdhocTicket> getCurrentTickets() {
            return null;
        }
    }
    
}
