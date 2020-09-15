package co.unicauca.tallerprincipiossolid.domain.main;

import co.unicauca.tallerprincipiossolid.domain.CarParkingCost;
import co.unicauca.tallerprincipiossolid.domain.MotoParkingCost;
import co.unicauca.tallerprincipiossolid.domain.TruckParkingCost;
import co.unicauca.tallerprincipiossolid.domain.Vehicle;
import co.unicauca.tallerprincipiossolid.domain.VehicleEnum;
import java.time.LocalTime;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalTime l1 = LocalTime.parse("01:25:00");
        LocalTime l2 = LocalTime.parse("23:33:00");
        
        Vehicle vehicle = new Vehicle(VehicleEnum.CAR, "2009", "KID-177", "Mazda",2000);
        CarParkingCost costoCar = new CarParkingCost();
        double result = costoCar.calculateCost(vehicle, l1, l2);
        System.out.println("Car: " + vehicle.getNumberPlate());
        System.out.println("El costo es:" + result);
        LocalTime l3 = LocalTime.parse("00:00:00");
        LocalTime l4 = LocalTime.parse("23:00:00");

        Vehicle vehicle2 = new Vehicle(VehicleEnum.TRUCK, "2016", "LLM-46E", "Toyota",15000);
        TruckParkingCost costoTruck = new TruckParkingCost();
        double resultTruck = costoTruck.calculateCost(vehicle2, l3 , l4);
        System.out.println("Truck: " + vehicle2.getNumberPlate());
        System.out.println("El costo es:" + resultTruck);


        LocalTime l5 = LocalTime.parse("02:09:00");
        LocalTime l6 = LocalTime.parse("11:59:00");
        
        Vehicle vehicle3 = new Vehicle(VehicleEnum.MOTORCYCLE, "2018", "MFD-23E", "Honda",1000);
        MotoParkingCost costoMoto = new MotoParkingCost();
        double resultMoto = costoMoto.calculateCost(vehicle3, l5, l6);
        System.out.println("Motocycle: " + vehicle3.getNumberPlate());
        System.out.println("Costo es: " + resultMoto);
    }
}
