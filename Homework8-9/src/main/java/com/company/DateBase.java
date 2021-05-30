package com.company;
/** This is user database class */
public class DateBase {
    /** users array declaration */
        public AbstractUser[] users;

/** This constructor sets size and initializes array */
    public DateBase(int size) {
        this.users = new AbstractUser[size];
    }

    /** This method gets all users from the array */
    public AbstractUser[] getUsers() {
        return users;
    }
}
