package com.company;

/** This is User interface */

public interface IUser {
    /** This is user login method */
    void login();

    /** This is user logout method */
    void logout();

    /** This method gets username */
    String getUsername();

    /** This method gets user registration date */
    String getRegistrationDate();
}
