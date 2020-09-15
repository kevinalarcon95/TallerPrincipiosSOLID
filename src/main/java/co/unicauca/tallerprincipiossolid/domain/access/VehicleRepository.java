package co.unicauca.tallerprincipiossolid.domain.access;

import co.unicauca.tallerprincipiossolid.domain.Vehicle;
import co.unicauca.tallerprincipiossolid.domain.VehicleEnum;
import co.unicauca.tallerprincipiossolid.domain.service.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Alarcón, Santiago Cordoba
 */
public class VehicleRepository implements IVehicleRepository {

    private Connection conn;

    public VehicleRepository() {
        initDatabase();
    }

    @Override
    public boolean save(Vehicle newVehicle) {

        try {
            //Validate product
            if (newVehicle == null || newVehicle.getVehicleModel().isBlank()
                    || newVehicle.getNumberPlate().isBlank() || newVehicle.getVehicleBrand().isBlank()) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO Vehicle (NumberPlate,TypeVehicle,VehicleModel, VehicleBrand ) "
                    + "VALUES ( ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newVehicle.getNumberPlate());
            pstmt.setString(2, newVehicle.getTypeVehicle().toString());
            pstmt.setString(3, newVehicle.getVehicleModel());
            pstmt.setString(4, newVehicle.getVehicleBrand());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Vehicle> list() {
        List<Vehicle> vehicles = new ArrayList<>();
        try {

            String sql = "SELECT NumberPlate, TypeVehicle, VehicleModel, VehicleBrand FROM Vehicle";
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Vehicle newVehicle = new Vehicle();
                newVehicle.setNumberPlate(rs.getString("NumberPlate"));
                newVehicle.setTypeVehicle((VehicleEnum) rs.getObject("TypeVehicle"));
                newVehicle.setVehicleModel(rs.getString("VehicleModel"));
                newVehicle.setVehicleBrand(rs.getString("VehicleBrand"));

                vehicles.add(newVehicle);
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehicles;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Vehicle (\n"
                + "	NumberPlate text PRIMARY KEY,\n"
                + "     TypeVehicle text NOT NULL,\n"
                + "	VehicleModel text NOT NULL,\n"
                + "	VehicleBrand text\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:./mydatabase.db";
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
