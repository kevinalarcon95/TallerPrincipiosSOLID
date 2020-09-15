package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class TruckParkingCostTest {

    public TruckParkingCostTest() {
    }

    /**
     * Test of calculateCost method, of class TruckParkingCost.
     */
    @Test
    public void testCalculateCost1() {
        System.out.println("calculateCost");
        Vehicle vehicle = null;
        LocalTime input = null;
        LocalTime output = null;
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 0.0;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testCalculateCost2() {
        System.out.println("calculateCost");
        Vehicle vehicle = null;
        LocalTime input = null;
        LocalTime output = null;
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 0.0;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testCalculateCost3() {
        System.out.println("calculateCost");
        Vehicle vehicle = null;
        LocalTime input = null;
        LocalTime output = null;
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 0.0;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testCalculateCost4() {
        System.out.println("calculateCost");
        Vehicle vehicle = null;
        LocalTime input = null;
        LocalTime output = null;
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 0.0;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
