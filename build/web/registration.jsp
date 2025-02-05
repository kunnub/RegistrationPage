<%-- 
    Document   : registration
    Created on : Apr 5, 2024, 8:04:53 PM
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
<div class="form">
       <form action="RegController" method="post">
        <h1>Registration Page</h1>
        <div class = box>
            <h3>Create Account</h3>
<!--        <p>* marks the required field </p>-->
         <p>Name : <input type="text" name="name"  placeholder="First and Last Name" required></p>
   
         <p> Email: <input type="email" name ="email" id="email" placeholder="rsharma@gmail.com" required> </p>

         <p>
             Mobile:<input type="tel" name="mobile" placeholder="Mobile Number" required>
         </p> 
         <p>
            Password: <input type ="password" name="password"  placeholder="minimum 8 characters " required>
         </p>
         
         <input type="submit" value="Register ">
         <p>Already have an account? <a href="TestWebMVC28/web/login.html" >Sign in</a></p>
         
         <p>By creating an account or logging in, you agree to Our’s Conditions of Use and Privacy Policy.</p>
         </div>
        </form>
   </div>    </body>
</html>
