/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;

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
public class ICarparkObserverTest {
    
    public ICarparkObserverTest() {
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
     * Test of notifyCarparkEvent method, of class ICarparkObserver.
     */
    @Test
    public void testNotifyCarparkEvent() {
        System.out.println("notifyCarparkEvent");
        ICarparkObserver instance = new ICarparkObserverImpl();
        instance.notifyCarparkEvent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICarparkObserverImpl implements ICarparkObserver {

        public void notifyCarparkEvent() {
        }
    }
    
}
