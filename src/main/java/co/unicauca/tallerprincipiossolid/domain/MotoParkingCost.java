package co.unicauca.tallerprincipiossolid.domain;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Clase que implementa el metodo calculateCost para el calculo del total a
 * pagar de una moto que hace uso del servicio de parqueadero.
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class MotoParkingCost implements IParkingCost{

    /**
     * Metodo que realiza el calculo del total a pagar de una moto.
     *
     * @param vehicle Objeto vehiculo.
     * @param input Hora de entrada de la moto.
     * @param output Hora de salida de la moto.
     * @return retorna el total a pagar de una moto (result).
     */
    @Override
    public double calculateCost(Vehicle vehicle,LocalTime input,LocalTime output) {
        long minutes = ChronoUnit.MINUTES.between(input, output);
        double result = 0.0;
        if(minutes <= 59){
           return vehicle.getTotal();
        }else{
            result = vehicle.getTotal() + ((minutes - 60) * 500)/60;
            return Math.ceil(result);
        }
    }
}
