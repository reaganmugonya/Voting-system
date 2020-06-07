/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uni.loginproject;

import com.uni.enttity.Users;
import com.uni.logic.logic;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.logging.Level;
import javax.persistence.Query;
/**
 *
 * @author Samsung
 */
@Named(value = "userManage")
@RequestScoped
public class UserManage {

    /**
     * Creates a new instance of UserManage
     */
    public UserManage() {
        //logic.dbConnection();
    }
    private String username;
  private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
        
    public void login(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(this.username != null && !this.username.isEmpty() && this.password != null && !this.password.isEmpty()) 
        { 
            Users user=logic.validateUser(this.username,this.password);
            if(user!=null){
                Principal principal =context.getExternalContext().getUserPrincipal();
                context.getExternalContext().getSessionMap().put("user", username);
	      try {
                    context.getExternalContext().redirect("abc2.xhtml");
                    } catch (IOException e) {
					e.printStackTrace();
                    }
            }
            else  {
                    //Send an error message on Login Failure 
	            context.addMessage(null, new FacesMessage("Authentication Failed. Check username or password."));
            }
        
        }
	  else  {
                    //Send an error message on Login Failure 
	            context.addMessage(null, new FacesMessage("Authentication Failed. Check username or password."));

            }
    
    
    }

}

