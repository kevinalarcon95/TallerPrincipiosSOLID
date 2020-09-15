package co.unicauca.tallerprincipiossolid.domain.access;

import co.unicauca.tallerprincipiossolid.domain.Vehicle;
import java.util.List;

/**
 * Interface que permite guardar los diferentes vehiculos
 * en una lista.
 * @author Kevin Alarcón, Santiago Cordoba
 */
public interface IVehicleRepository {

    boolean save(Vehicle newProduct);

    List<Vehicle> list();
}
