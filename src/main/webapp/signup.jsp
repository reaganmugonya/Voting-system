
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="assets/localcss/signup.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
       <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="signupLayout">
                 <p class="title">Sign up</p>
                       <span class="jss448"></span>
                        <p>
                         <a href="login.jsp">
                              Already have an account?
                           </a>
                        </p>
                        <div class="firstnamecontainer">
                             <input type="text" class="form-control" placeholder="Firstname" aria-label="Username" aria-describedby="addon-wrapping">
                        </div>
                        <div class='lastnamecontainer'>
                            <input type="text" class="form-control" placeholder="Lastname" aria-label="Username" aria-describedby="addon-wrapping">
                        </div>
                        <div class="emailconatiner">
                            <input type="email" class="form-control" placeholder="Email" aria-label="Username" aria-describedby="addon-wrapping">
                        </div>  
                        <div class="passwordcontainer">
                            <input type="password" class="form-control" placeholder="Password" aria-label="Username" aria-describedby="addon-wrapping">
                        </div>
                        <div class="input-group mb-3">
                            <select class="custom-select" id="inputGroupSelect02">
                              <option selected>Select Type</option>
                              <option value="1">Student</option>
                              <option value="2">Participant</option>
          
                            </select>
                        </div>
                        <div class="submitbutton">
                             <button class="btn btn-primary" type="submit">Button</button>
                        </div>
            </div>
        </div>
    </body>
</html>
