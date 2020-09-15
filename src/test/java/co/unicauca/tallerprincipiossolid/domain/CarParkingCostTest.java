package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import org.junit.Test;

/**
 *
 * @author Kevin Alarcón,Santiago Cordoba
 */
public class CarParkingCostTest {
    
    public CarParkingCostTest() {
    }
  
    /**
     * Test of calculateCost method, of class CarParkingCost.
     */
    @Test
    public void testCalculateCost1() {
        System.out.println("calculateCost 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR, "2009", "KID-177", "Mazda",2000);
        LocalTime input = LocalTime.parse("01:25:00");
        LocalTime output = LocalTime.parse("23:33:00");
        CarParkingCost instance = new CarParkingCost();
        double expResult = 23133;
        double result = instance.calculateCost(vehicle, input, output);
    }
    
    @Test
    public void testCalculateCost2() {
        System.out.println("calculateCost 2");
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR, "2000", "CVY-000", "Chevrolet",2000);
        LocalTime input = LocalTime.parse("01:00:00");
        LocalTime output = LocalTime.parse("04:00:00");
        CarParkingCost instance = new CarParkingCost();
        double expResult = 4250;
        double result = instance.calculateCost(vehicle, input, output);
    }
    
    @Test
    public void testCalculateCost3() {
        System.out.println("calculateCost 3");
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR, "2004", "MAK - 281", "KIA",2000);
        LocalTime input = LocalTime.parse("12:57:00");
        LocalTime output = LocalTime.parse("03:15:00");
        CarParkingCost instance = new CarParkingCost();
        double expResult = 3300;
        double result = instance.calculateCost(vehicle, input, output);
    }
    
    @Test
    public void testCalculateCost4() {
        System.out.println("calculateCost 4");
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR, "2009", "KID-177", "Mazda",2000);
        LocalTime input = LocalTime.parse("01:00:00");
        LocalTime output = LocalTime.parse("01:30:00");
        CarParkingCost instance = new CarParkingCost();
        double expResult = 2500;
        double result = instance.calculateCost(vehicle, input, output);
    }
    
}
