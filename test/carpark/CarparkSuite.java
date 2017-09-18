/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;

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
@Suite.SuiteClasses({bcccp.carpark.CarparkTest.class, bcccp.carpark.ICarparkObserverTest.class, bcccp.carpark.IGateTest.class, carpark.exit.ExitSuite.class, bcccp.carpark.ICarparkTest.class, carpark.paystation.PaystationSuite.class, carpark.entry.EntrySuite.class, bcccp.carpark.ICarSensorTest.class, bcccp.carpark.CarSensorTest.class, bcccp.carpark.ICarSensorResponderTest.class, bcccp.carpark.GateTest.class})
public class CarparkSuite {

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
