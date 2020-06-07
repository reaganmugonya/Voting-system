<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">
    <h:head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="assets/localcss/login.css" rel="stylesheet" type="text/css"></link>
           <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous"></link>
       <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <title>Voting</title>
    </h:head>
    <body>
        <div class="container">
            <div class="loginLayout">
                <h1>SIGN IN</h1>
        <span class="jss448"></span>
        <h5>
          not a member yet ?
          <a href="signup.jsp"> sign up ?</a>
        </h5>
        <form class="form form-horizontal" role="form" method="post" action="j_security_check" name="loginForm">
          <div style="padding: 10px">
              <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping" name="j_username" autocomplete="off" required="true">
          </div>
          <div style="padding: 10px">
              <input type="password" class="form-control" placeholder="Password" aria-label="Username" name="j_password" aria-describedby="addon-wrapping" autocomplete="off" required="true">
          </div>
          <div style="padding: 10px">
              <button class="btn btn-primary" type="submit">Button</button>
          </div>
        </form>
           <div class="forgotpassword">
               <a href="forgot-password.jsp">
                   <h1> Forgot password?</h1>
          </a>
        </div>
        </div>
        </div>
        
        
 
    </body>
</html>
