package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;

/**
 * Interfaz que define el metodo IParkingCost el cual debe ser implementado por
 * la clase que use la interfaz
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public interface IParkingCost {
    double calculateCost(Vehicle vehicle,LocalTime input,LocalTime output);
}
