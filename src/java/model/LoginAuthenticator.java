package model;

import database.DBConnector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAuthenticator {

    public boolean isLogin(String username , String password) throws SQLException {

        ResultSet rs = null;
        String tablePassword = "";
        System.out.println("forom the servlet datat "+username );

        Connection con =DBConnector.getConnection();
        Statement st =con.createStatement();
          rs = st.executeQuery("SELECT password FROM db28.registration WHERE Email = '" + username + "';");
          System.out.println("username in model "+username);
        if (rs.next()) {
            tablePassword = rs.getString(1);
        } else {
            return false;
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
        {
            return true;
        }
        else{
        return false;
        }
    }

}
