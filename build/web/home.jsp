<%-- 
    Document   : home
    Created on : Mar 3, 2024, 2:13:32 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<a href="logOut.jsp">Sign Out</a>
        <%
            String name = (String)session.getAttribute("name");
            System.out.println(name);
            if(name==null)
            {
                response.sendRedirect("registration.html");
            }
        %>
        <h1>Hello <%=name%>..!</h1>
        <h2>Sign Up Successful...</h2>    </body>
</html>
