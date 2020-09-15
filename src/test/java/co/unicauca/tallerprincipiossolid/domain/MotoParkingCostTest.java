package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class MotoParkingCostTest {

    public MotoParkingCostTest() {
    }

    /**
     * Test of calculateCost method, of class MotoParkingCost.
     */
    @Test
    public void testCalculateCost1() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.MOTORCYCLE, "2010", "GTO-07D", "Honda", 1000);
        LocalTime input = LocalTime.parse("03:30:00");
        LocalTime output = LocalTime.parse("05:15:00");
        MotoParkingCost instance = new MotoParkingCost();
        double expResult = 1375;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 1000);
    }

    @Test
    public void testCalculateCost2() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.MOTORCYCLE, "2012", "HHH-345", "Kawasaki", 1000);
        LocalTime input = LocalTime.parse("04:15:00");
        LocalTime output = LocalTime.parse("06:37:00");
        MotoParkingCost instance = new MotoParkingCost();
        double expResult = 1683;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 1000);
    }

    @Test
    public void testCalculateCost3() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.MOTORCYCLE, "2009", "BLM-074", "Suzuki", 1000);
        LocalTime input = LocalTime.parse("13:08:00");
        LocalTime output = LocalTime.parse("17:25:00");
        MotoParkingCost instance = new MotoParkingCost();
        double expResult = 2641;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 1000);
    }

    @Test
    public void testCalculateCost4() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.MOTORCYCLE, "2006", "EDN-984", "Pulsar", 1000);
        LocalTime input = LocalTime.parse("02:09:00");
        LocalTime output = LocalTime.parse("11:59:00");
        MotoParkingCost instance = new MotoParkingCost();
        double expResult = 5416;
        double result = instance.calculateCost(vehicle, input, output);
        assertEquals(expResult, result, 1000);
    }

}
