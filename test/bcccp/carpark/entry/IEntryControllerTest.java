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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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