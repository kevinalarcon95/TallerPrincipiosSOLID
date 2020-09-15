package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Clase que implementa el metodo calculateCost para el calculo del total a
 * pagar de un camion que hace uso del servicio de parqueadero.
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class TruckParkingCost implements IParkingCost {

    /**
     * Metodo que realiza el calculo del total a pagar de un camion.
     *
     * @param vehicle Objeto vehiculo.
     * @param input Hora de entrada del camion.
     * @param output Hora de salida del camion.
     * @return retorna el total a pagar de un camion (result).
     */
    @Override
    public double calculateCost(Vehicle vehicle, LocalTime input, LocalTime output) {

        long minutes = ChronoUnit.MINUTES.between(input, output);
        double result = 0.0;
        int rand1 = (int) (Math.random() * 1000 + 1);
        int rand2 = (int) (Math.random() * 1000 + 1);

        if (rand2 == rand1) {
            System.out.println("FELICIDADES!!! Ganaste un servicio de parqueadero gratis.");
            return result;
        }
        if (minutes <= 720) {
            return 10000;
        } else {
            result = (minutes * vehicle.getTotal()) / 60;
            return result;
        }
    }
}
