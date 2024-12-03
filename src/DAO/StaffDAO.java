/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Staff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Naome
 */
public class StaffDAO {
    
     private String dbUrl="jdbc:MYSQL://localhost:3306/transport_managment_system_db";
    private String username="root";
    private String pass="";
    
    public String registerStaff(Staff staffObj){
       try{
             Connection con =DriverManager.getConnection(dbUrl,username,pass);
             String sql="insert into staff(role,email,password)values (?,?,?)";
              PreparedStatement pst= con.prepareStatement(sql);
              pst.setString(1,staffObj.getRole());
              pst.setString(2,staffObj.getEmail());
              pst.setString(3,staffObj.getPassword());
                      
            int rowsAffected=pst.executeUpdate();
            con.close();
            if(rowsAffected>=1){
              
                return"staff registered sucessful";
                
            }else{
                return"sorry staff not registered";
            }
         
       } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return"an error occured!!";
        
    }
    public String  loginAuthentication(Staff staffObj){
    try{
        
         Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "SELECT role FROM staff WHERE email = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, staffObj.getEmail());
            pst.setString(2, staffObj.getPassword());

            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                // Authentication succeeded; return the user's role
                return resultSet.getString("role");
            }
    }catch(Exception ex){
            ex.printStackTrace();
        }
        return"an error occured!!";
    
    }
}
