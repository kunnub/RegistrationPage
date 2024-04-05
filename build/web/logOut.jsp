<%-- 
    Document   : logOut
    Created on : Mar 3, 2024, 2:15:19 AM
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
  <%
        session.invalidate();
        response.sendRedirect("registration.html");
    %>    </body>
</html>
