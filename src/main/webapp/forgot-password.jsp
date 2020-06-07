<%-- 
    Document   : forgot-password
    Created on : 15 May 2020, 03:40:26
    Author     : vinaykashyap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="assets/localcss/forgotpassword.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="forgotLayout">
                 <p class="title">Forgot your password ?</p>
                    <span class="jss448"></span>
                        <p>
                          Enter your Email address below and we'll send you a link to reset your
                          password.
                        </p>
                        <div style="padding: 10px">
                             <input type="text" class="form-control" placeholder="Email" aria-label="Username" aria-describedby="addon-wrapping">
                        </div>
                        <div class="submitbutton">
                            <button class="btn btn-primary" type="submit">SEND RESET LINK</button>
                        </div>
            </div>
        </div>
    </body>
</html>
