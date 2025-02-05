<%-- 
    Document   : index
    Created on : Apr 8, 2024, 3:14:39 AM

    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Registration page</title>
    </head>
    <body>

        <div class="form">
            <form action="RegChecker.java" method="post">
                <h1>Registration Page</h1>
                <div>
                    <h3>Create Account</h3>
                    <p>* marks the required field </p>
                    <p>Name*: <input type="text" name="name"  placeholder="First and Last Name" required></p>

                    <p>
                        Mobile:*<input type="tel" name="mobile" placeholder="Mobile Number" required></textarea>
                    </p> 
                    <p> Email*: <input type="email" name ="email" id="email" placeholder="rsharma@gmail.com" required> </p>
                    <p>
                        Password*: <input type ="password" name="password"  placeholder="minimum 6 characters " required>
                    </p>

                    <input type="submit" value="Register ">
                    <p>Already have an account? <a href="" >Sign in</a></p>
                    <p>By creating an account or logging in, you agree to Amazon’s Conditions of Use and Privacy Policy.</p>
                </div>
        </div>
    </form>
</body>
</html>
