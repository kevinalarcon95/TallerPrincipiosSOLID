package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Clase que implementa el metodo calculateCost para el calculo del total a
 * pagar de un carro que hace uso del servicio de parqueadero.
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class CarParkingCost implements IParkingCost {

    /**
     * Metodo que realiza el calculo del total a pagar de un carro.
     *
     * @param vehicle Objeto vehiculo.
     * @param input Hora de entrada del carro.
     * @param output Hora de salida del carro.
     * @return retorna el total a pagar de un carro (result).
     */
    @Override
    public double calculateCost(Vehicle vehicle, LocalTime input, LocalTime output) {

        long minutes = ChronoUnit.MINUTES.between(input, output);
        double result = 0.0;

        if (minutes <= 60) {
            return vehicle.getTotal();
        } else {
            result = vehicle.getTotal() + ((minutes - 60) * 1000) / 60;
            return result;
        }
    }
}
