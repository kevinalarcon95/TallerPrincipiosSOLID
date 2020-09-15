package co.unicauca.tallerprincipiossolid.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kevin Alarcón
 */
public class VehicleTest {
    
    public VehicleTest() {
    }
   
    /**
     * Test of getTypeVehicle method, of class Vehicle.
     */
    @Test
    public void testVehicle() {
        System.out.println("Total a pagar Carro 1");
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR,"2009","KID-177","Mazda",2000);
        assertEquals(VehicleEnum.CAR, vehicle.getTypeVehicle());
        assertEquals("2009", vehicle.getVehicleModel());
        assertEquals("KID-177", vehicle.getNumberPlate());
        assertEquals("Mazda", vehicle.getVehicleBrand());
        assertEquals(2.000, vehicle.getTotal());
    }

}
