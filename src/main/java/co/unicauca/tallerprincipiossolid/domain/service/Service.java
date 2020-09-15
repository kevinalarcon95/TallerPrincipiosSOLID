package co.unicauca.tallerprincipiossolid.domain.service;

import co.unicauca.tallerprincipiossolid.domain.access.IVehicleRepository;
import co.unicauca.tallerprincipiossolid.domain.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class Service {

    private IVehicleRepository repository;

    public Service(IVehicleRepository repository) {
        this.repository = repository;
    }

    /* logica de negocio
   public double calculateProductTax(Vehicle vehicle) {

        //Validate product.
        if (vehicle == null) {
            return 0;
        }
        double TAX = 0.19d;
        double productTax = vehicle.getPrice() * TAX;
        return productTax;
    } */
    public boolean saveVehicle(Vehicle newVehicle) {

        //Validate product
        if (newVehicle == null || newVehicle.getVehicleModel().isBlank()
                || newVehicle.getNumberPlate().isBlank() || newVehicle.getVehicleBrand().isBlank()) {
            return false;
        }

        repository.save(newVehicle);
        return true;
    }

    public List<Vehicle> listVehicle() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles = repository.list();;

        return vehicles;
    }
}
