/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uni.logic;

import com.uni.enttity.Users;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Samsung
 */
public class logic {
    private static EntityManagerFactory emf = null;
    private static EntityManager entityMgrObj = null;
    private Users currentUser;
    
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("LoginProject-pu");
        }
        return emf.createEntityManager();
    }
    
    public Users getCurrentUser() {
        return currentUser;
    }

    public void setLoggedPerson(Users currentUser) {
        this.currentUser = currentUser;
    }
       public static void dbConnection(){
            emf = Persistence.createEntityManagerFactory("LoginProject-pu");
            entityMgrObj = emf.createEntityManager();
        }
       
       @SuppressWarnings("unchecked")
	public static Users validateUser(String email,String password) {
               logic.dbConnection();
                Query queryObj = entityMgrObj.createQuery("SELECT s FROM Users s WHERE s.email = :email AND s.password = :password",Users.class).setParameter("email", email.trim()).setParameter("password", password.trim());
		Users user = (Users)queryObj.getSingleResult();
                if(user!=null){
                    return user;
                }
                else {
                    return null;
		}
	}
}
