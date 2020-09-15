package co.unicauca.tallerprincipiossolid.domain;

/**
 * Clase principal donde se definen todas las caracteristicas de un vehiculo
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class Vehicle {

    /**
     * Atributos de la clase Vehicle typeVehicle: Tipo de vehiclo, puede variar
     * entre un Carro, Moto o Camión. vehicleModel: Modelo del vehiculo.
     * numberPlate: Número de placa del vehiculo. vehicleBrand: Marca del
     * vehiculo.
     */
    private VehicleEnum typeVehicle;
    private String vehicleModel;
    private String numberPlate;
    private String vehicleBrand;
    private int total;

    /**
     * Constructor por defecto.
     */
    public Vehicle() {
    }

    /**
     * Constructor Parametrizado.
     *
     * @param typeVehicle
     * @param vehicleModel
     * @param numberPlate
     * @param vehicleBrand
     */
    public Vehicle(VehicleEnum typeVehicle, String vehicleModel, String numberPlate, String vehicleBrand, int total) {
        this.typeVehicle = typeVehicle;
        this.vehicleModel = vehicleModel;
        this.numberPlate = numberPlate;
        this.vehicleBrand = vehicleBrand;
        this.total = total;
    }

    //Getters and Setters
    public VehicleEnum getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(VehicleEnum typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
