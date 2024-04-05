/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class RegDBController {
    
    static Connection con=null;
    static PreparedStatement pst = null;
    
    
    static
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db28","root","root");
            System.out.println("database connected");
            
        } 
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return con;
    }
//    public static PreparedStatement getStatement(){
//        return pst;
//    }
    
    
}
