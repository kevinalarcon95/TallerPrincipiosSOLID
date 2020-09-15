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
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.TRUCK, "2000", "OPH-098", "Toyota", 15000);
        LocalTime input = LocalTime.parse("03:00:00");
        LocalTime output = LocalTime.parse("14:17:00");
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 10000;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 15000);
    }

    public void testCalculateCost2() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.TRUCK, "2002", "LKG-765", "Mazda", 15000);
        LocalTime input = LocalTime.parse("02:23:00");
        LocalTime output = LocalTime.parse("20:12:00");
        TruckParkingCost instance = new TruckParkingCost();
        double expResult = 15000;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 15000);
    }
}
