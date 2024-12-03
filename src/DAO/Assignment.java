/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.AssignmentModel;
import MODEL.Bus;
import MODEL.Route;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Naome
 */
public class Assignment {
   private String dbUrl="jdbc:MYSQL://localhost:3306/transport_managment_system_db";
    private String username="root";
    private String pass="";
    
    public String assingBus(AssignmentModel assign){
    try{
         Connection con = DriverManager.getConnection(dbUrl, username, pass);
    
      String insertSQL = "INSERT INTO  assignedbuses (plate_nbr, route_id, passengers) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, assign.getPlate_nbr().getPlate_nbr());
            preparedStatement.setString(2, assign.getRoute_id().getRoute_id());
            preparedStatement.setInt(3, assign.getPassengers());

             int rowAffected = preparedStatement.executeUpdate();
            con.close();
            if(rowAffected >=1){
                return "Data saved Successful";
            }else{
                return "Data Not saved";
            }
        }
        
    }catch(Exception ex){
            ex.printStackTrace();
            return "server error";
    }
    }
    public String  updateAssignment(AssignmentModel assign) {
   String updateSQL = "UPDATE assignedbuses SET plate_nbr = ?, route_id = ?, passengers = ? WHERE assign_id = ?";

    try (Connection con = DriverManager.getConnection(dbUrl, username, pass);
         PreparedStatement preparedStatement = con.prepareStatement(updateSQL)) {
        preparedStatement.setString(1, assign.getPlate_nbr().getPlate_nbr());
        preparedStatement.setString(2, assign.getRoute_id().getRoute_id());
        preparedStatement.setInt(3, assign.getPassengers());
        preparedStatement.setInt(4, assign.getAssign_id());

        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            return "Assignment updated successfully.";
        } else {
            return "Failed to update assignment.";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        return "Error: " + ex.getMessage();
    }
}

public List<AssignmentModel> getAllAssignedBuses() {
    List<AssignmentModel> assignedBuses = new ArrayList<>();
    String selectSQL = "SELECT assign_id, plate_nbr, route_id, passengers FROM assignedbuses";

    try (Connection con = DriverManager.getConnection(dbUrl, username, pass);
         PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        while (resultSet.next()) {
            int assign_id = resultSet.getInt("assign_id");
            String plate_nbr = resultSet.getString("plate_nbr");
            String route_id = resultSet.getString("route_id");
            int passengers = resultSet.getInt("passengers");

            AssignmentModel assignment = new AssignmentModel();
            assignment.setAssign_id(assign_id);

            Bus thebus = new Bus();
            thebus.setPlate_nbr(plate_nbr); // Set the plate number for the bus

            Route theroute = new Route();
            theroute.setRoute_id(route_id); // Set the route ID for the route

            assignment.setPlate_nbr(thebus);
            assignment.setRoute_id(theroute);
            assignment.setPassengers(passengers);

            assignedBuses.add(assignment);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    return assignedBuses;
}

   

   public List<AssignmentModel> displayAllAssignedBuses() {
    String query = "SELECT a.passengers, b.plate_nbr, b.bus_name, b.driver, b.bus_company, r.* " +
            "FROM assignedbuses a " +
            "INNER JOIN bus b ON a.plate_nbr = b.plate_nbr " +
            "INNER JOIN route r ON a.route_id = r.route_id";

    try (Connection con = DriverManager.getConnection(dbUrl, username, pass);
         PreparedStatement preparedStatement = con.prepareStatement(query);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        List<AssignmentModel> assignedBuses = new ArrayList<>();

        while (resultSet.next()) {
            AssignmentModel assignment = new AssignmentModel();
            assignment.setPassengers(resultSet.getInt("passengers"));
            Bus bus = new Bus();
            bus.setPlate_nbr(resultSet.getString("plate_nbr"));
           bus.setBus_name(resultSet.getString("bus_name"));
            bus.setDriver(resultSet.getString("driver"));
            bus.setBus_company(resultSet.getString("bus_company"));
            assignment.setBus(bus);
            Route route = new Route();
            route.setRoute_id(resultSet.getString("route_id"));
            route.setRoute_name(resultSet.getString("route_name"));
            route.setStarting_point(resultSet.getString("starting_point"));
            route.setEnding_point(resultSet.getString("ending_point"));
            assignment.setRoute(route);
            assignedBuses.add(assignment);
        }

        return assignedBuses;
    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }
}

}






