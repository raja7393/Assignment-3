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
public class AdhocTicketFactoryTest {
    
    public AdhocTicketFactoryTest() {
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
     * Test of make method, of class AdhocTicketFactory.
     */
    @Test
    public void testMake() {
        System.out.println("make");
        String carparkId = "";
        int ticketNo = 0;
        AdhocTicketFactory instance = new AdhocTicketFactory();
        IAdhocTicket expResult = null;
        IAdhocTicket result = instance.make(carparkId, ticketNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
