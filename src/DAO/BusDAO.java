/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Bus;
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
public class BusDAO {
    
     private String dbUrl="jdbc:MYSQL://localhost:3306/transport_managment_system_db";
    private String username="root";
    private String pass="";
    // let's first register buses
        public String registerBuses(Bus Busobj){
    try{
        Connection con =DriverManager.getConnection(dbUrl,username,pass);
           
            String sql="insert into bus (plate_nbr,bus_name,driver,bus_company,nbr_passengers) values (?,?,?,?,?)";
           PreparedStatement pst= con.prepareStatement(sql);
             pst.setString(1,Busobj.getPlate_nbr());
             pst.setString(2, Busobj.getBus_name());
             pst.setString(3,Busobj.getDriver());
             pst.setString(4,Busobj.getBus_company());
             pst.setInt(5,Busobj.getNbr_passengers());
               
            int rowsAffected=pst.executeUpdate();
            con.close();
            if(rowsAffected>=1){
              
                return"bus registered succesful";
                
            }else{
                return"couldn't save the bus";
            }
       
    } catch(Exception ex){
            ex.printStackTrace();
    } 
    return "failed to perform";
    }
         public String deleteBus(Bus Busobj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "delete from bus where plate_nbr=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Busobj.getPlate_nbr());
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "bus Deleted";
           }else{
               return "bus couldn't be deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
          public String updateStudent(Bus Busobj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,pass);
           String sql ="update bus set bus_name=?,driver=?,bus_company=?,nbr_passengers=? where plate_nbr=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, Busobj.getBus_name());
        pst.setString(2, Busobj.getDriver());
        pst.setString(3, Busobj.getBus_company());
        pst.setInt(4, Busobj.getNbr_passengers());
        pst.setString(5, Busobj.getPlate_nbr());
          
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
//               
                return "Data update Successful";
            }else{
//               
                return "Data Not updated";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "Server Error!!";
    }
          
          public List<Bus> displaybuses(){
    try{
    Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "select * from bus";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<Bus> busList = new ArrayList<>();
            while(result.next()){
                Bus busobj=new Bus();
               
               busobj.setPlate_nbr(result.getString("plate_nbr"));
                busobj.setBus_name(result.getString("bus_name"));
                  busobj.setDriver(result.getString("driver"));
                busobj.setBus_company(result.getString("bus_company"));
                busobj.setNbr_passengers(result.getInt("nbr_passengers"));
                busList.add(busobj);
              
            }
               con.close();
             return busList;
    }catch(Exception ex){
            ex.printStackTrace();
    }
    return null;
    } 
       
    public int getAvailablePassengerCapacity(Bus busObj) {
        int availableCapacity = 0;

        try {
               
                  Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "SELECT nbr_passengers FROM Bus WHERE plate_nbr = ?";
             PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,busObj.getPlate_nbr());
                ResultSet resultSet = pst.executeQuery();
                    while (resultSet.next()) {
                        int totalCapacity = resultSet.getInt("nbr_passengers");

                    }
                }
            
         catch (Exception e) {
            e.printStackTrace(); 
        }

        return availableCapacity;
    }   
}
