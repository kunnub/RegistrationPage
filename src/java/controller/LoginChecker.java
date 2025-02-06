
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author Pankaj
 */

public class LoginChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try {
            String username = request.getParameter("email");
            System.out.println("email=" +request.getParameter("email"));
            String password = request.getParameter("password");
            
            LoginAuthenticator l1 = new LoginAuthenticator();
            boolean login = false;
            login = l1.isLogin(username, password);
            System.out.println(" username "+ username);
            
            if(login)
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
                
            }
            else
            {
                response.sendRedirect("login.html");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}