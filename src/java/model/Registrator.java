
package model;

import java.sql.PreparedStatement;
import database.DBConnector;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Registrator {

     public boolean isRegister(String name, String email, String mobile, String password) throws SQLException
     {
          boolean register;
 
        int i=0;
        if(!name.trim().equals("") && !mobile.trim().equals("")  && (password.trim().length()>=8))
        {
           Connection con= DBConnector.getConnection();
           
           PreparedStatement pst = con.prepareStatement("INSERT INTO db28.registration(Name,Email,Number,password) VALUES(?,?,?,?);");
         
           pst.setString(1,name);
           pst.setString(2,email);
           pst.setString(3,mobile);
           pst.setString(4,password);
           
         i = pst.executeUpdate();
         
         if(i>0){
             
            return true;    
            }
         else{
               return false;
         }       
        }
        else{
            return false;        
        }
     }
        
        
        
     

}
