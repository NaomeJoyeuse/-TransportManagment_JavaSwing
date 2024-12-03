/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.company;
import VIEW.Company;
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
public class CompanyDAO {
    
    
     private String dbUrl="jdbc:MYSQL://localhost:3306/transport_managment_system_db";
    private String username="root";
    private String pass="";
    
    public String registerCompany(company companyObj){
    try{
        Connection con =DriverManager.getConnection(dbUrl,username,pass);
           
            String sql="insert into  company (company_name,owner) values (?,?)";
           PreparedStatement pst= con.prepareStatement(sql);
             pst.setString(1,companyObj.getCompany_name());
                pst.setString(2,companyObj.getOwner());
               
            int rowsAffected=pst.executeUpdate();
            con.close();
            if(rowsAffected>=1){
              
                return"successful data saved";
                
            }else{
                return"data not saved";
            }
       
    } catch(Exception ex){
            ex.printStackTrace();
    } 
    return "failed to perform";
    }
public List<company> displayCompany(){
    try{
    Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "select * from company";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<company> companyList = new ArrayList<>();
            while(result.next()){
                company campanyObj=new company();
                campanyObj.setComp_id(result.getInt("comp_id"));
                campanyObj.setCompany_name(result.getString("company_name"));
                campanyObj.setOwner(result.getString("owner"));
               companyList.add(campanyObj);
            }
               con.close();
             return companyList;
    }catch(Exception ex){
            ex.printStackTrace();
    }
    return null;
    } 
 public String removeCompany(company companyObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, pass);
            String sql = "delete from company where comp_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, companyObj.getComp_id());
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "company Deleted";
           }else{
               return "company couldn't be deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
