/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.paystation;

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
public class IPaystationControllerTest {
    
    public IPaystationControllerTest() {
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
     * Test of ticketInserted method, of class IPaystationController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String barcode = "";
        IPaystationController instance = new IPaystationControllerImpl();
        instance.ticketInserted(barcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketPaid method, of class IPaystationController.
     */
    @Test
    public void testTicketPaid() {
        System.out.println("ticketPaid");
        IPaystationController instance = new IPaystationControllerImpl();
        instance.ticketPaid();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketTaken method, of class IPaystationController.
     */
    @Test
    public void testTicketTaken() {
        System.out.println("ticketTaken");
        IPaystationController instance = new IPaystationControllerImpl();
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPaystationControllerImpl implements IPaystationController {

        public void ticketInserted(String barcode) {
        }

        public void ticketPaid() {
        }

        public void ticketTaken() {
        }
    }
    
}
