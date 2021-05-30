package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/** This is abstract user class */

public abstract class AbstractUser implements IUser{

/** @param registrationDate
 * @param username
 * @param isAdmin
 * @param isLoggedin
 * */
    private String registrationDate;
    private String username;
    private boolean isAdmin;
    private boolean isLoggedin;

/** This is AbstractUser constructor */
    public AbstractUser(boolean isAdmin, String username) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:ssss");
        Date currentDate = new Date();
        this.registrationDate = Instant.now().toString();
        this.username = username;
        this.isAdmin = isAdmin;
    }

    /** This is user login method */
    @Override
    public void login() {
        System.out.println("User " + username + " has logged in successfully.");
        this.isLoggedin = true;
    }

    /** This is user logout method */
    @Override
    public void logout() {
        System.out.println("User " + username + " has logged out successfully.");
        this.isLoggedin = false;
    }

    /** This method gets username */
    @Override
    public String getUsername() {
        return this.username;
    }

    /** This method gets user registration date */
    @Override
    public String getRegistrationDate() {
        return registrationDate;
    }

    /** This method sets user registration date */
    protected void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** This boolean method returns admin status */
    public boolean isAdmin() {
        return isAdmin;
    }

    /** This method shows details for all users */
    public String showUserInfo(){
        return getUsername() + " admin: " + isAdmin() + ", isLoggedIn= " + isLoggedin + ", registration date: " + getRegistrationDate();
    }


}
