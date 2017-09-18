/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark.paystation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 11618519
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({bcccp.carpark.paystation.PaystationControllerTest.class, bcccp.carpark.paystation.PaystationUITest.class, bcccp.carpark.paystation.IPaystationUITest.class, bcccp.carpark.paystation.IPaystationControllerTest.class})
public class PaystationSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
