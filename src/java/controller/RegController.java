
package controller;

import java.io.IOException;
import java.sql.SQLException;
import model.Registrator;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class RegController extends HttpServlet {

    public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException{
        response.sendRedirect("registration.html");
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException{
      
           
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            String password = request.getParameter("password");
            
            Registrator rg = new Registrator();
        boolean register = false;
        try {
            register = rg.isRegister(name,email,mobile,password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        if(register)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("name", name);
            response.sendRedirect("home.jsp");
        }
        else
        {
            response.sendRedirect("registration.html");
        }
        
    }
   
}


