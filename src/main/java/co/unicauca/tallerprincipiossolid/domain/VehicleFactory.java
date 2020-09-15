package co.unicauca.tallerprincipiossolid.domain;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class VehicleFactory {

    private Map<VehicleEnum, IParkingCost> vehicleDictionary;

    private static VehicleFactory instance;

    private VehicleFactory() {
        vehicleDictionary = new EnumMap<>(VehicleEnum.class);
        vehicleDictionary.put(VehicleEnum.CAR, new CarParkingCost());
        vehicleDictionary.put(VehicleEnum.MOTORCYCLE, new MotoParkingCost());
        vehicleDictionary.put(VehicleEnum.TRUCK, new TruckParkingCost());
    }

    /**
     * Devuelve la instancia de la clase
     *
     * @return instancia unica de la la fábrica
     */
    public static VehicleFactory getInstance() {
        if (instance == null) {
            instance = new VehicleFactory();
        }
        return instance;
    }

    /**
     * Para un pais determina la clase que se encarga de calcular el costo del
     * envío.
     *
     * @param country
     * @return
     */
    public IParkingCost getDelivery(VehicleEnum vehicle) {

        IParkingCost result = null;

        if (vehicleDictionary.containsKey(vehicle)) {
            result = vehicleDictionary.get(vehicle);
        }

        return result;
    }
}
