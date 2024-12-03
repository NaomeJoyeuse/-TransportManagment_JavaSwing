/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class RouteDAO {
   
     private String dbUrl="jdbc:MYSQL://localhost:3306/transport_managment_system_db";
    private String username="root";
    private String pass="";
    
    public String registerRoutes(Route routeobj){
       try{
             Connection con =DriverManager.getConnection(dbUrl,username,pass);
             String sql="insert into route(route_id,route_name,starting_point,ending_point)values (?,?,?,?)";
              PreparedStatement pst= con.prepareStatement(sql);
              pst.setString(1,routeobj.getRoute_id());
              pst.setString(2,routeobj.getRoute_name());
              pst.setString(3,routeobj.getStarting_point());
               pst.setString(4,routeobj.getEnding_point());
                      
            int rowsAffected=pst.executeUpdate();
            con.close();
            if(rowsAffected>=1){
              
                return"route registered sucessful";
                
            }else{
                return"sorry route not registered";
            }
         
       } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return"an error occured!!";
        
    }
      public String deleteRoutes(Route routeobj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "delete from route where route_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,routeobj.getRoute_id());
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "route Deleted";
           }else{
               return "route couldn't be deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public String updateRoutes(Route routeobj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,pass);
           String sql ="update route set route_name=?,starting_point=?,ending_point=? where route_id=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, routeobj.getRoute_name());
        pst.setString(2, routeobj.getStarting_point());
        pst.setString(3, routeobj.getEnding_point());
        pst.setString(4, routeobj.getRoute_id());
        
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
       
          
          public List<Route> displayAllroutes(){
    try{
    Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "select * from route";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<Route> routeList = new ArrayList<>();
            while(result.next()){
            Route routeobj=new Route(); 
              routeobj.setRoute_id(result.getString("route_id"));
                routeobj.setRoute_name(result.getString("route_name"));
                  routeobj.setStarting_point(result.getString("starting_point"));
                routeobj.setEnding_point(result.getString("ending_point"));
                
                routeList.add(routeobj);
              
            }
               con.close();
             return routeList;
    }catch(Exception ex){
            ex.printStackTrace();
    }
    return null;
    } 
          
}
