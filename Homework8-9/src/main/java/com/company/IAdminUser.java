package com.company;

/** This is AdminUser interface */
public interface IAdminUser extends IUser {
    /** This method removes user by username */
    void deleteUser(String username);

    /** This method creates standard user or admin with username */
    IUser createUser(boolean isAdmin, String username);

/** This method prints all information about each user */
    void viewAllUsers();

}