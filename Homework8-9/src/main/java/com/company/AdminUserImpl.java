package com.company;
/** This is admin user class */
public class AdminUserImpl extends AbstractUser implements IAdminUser {
    private DateBase dataBase;

    /** This is AdminUserImpl constructor */
    public AdminUserImpl(boolean isAdmin, String username) {
        super(isAdmin, username);
        this.dataBase = new DateBase(10);
    }

    /** This method removes user by username */
    @Override
    public void deleteUser(String username) {
        for (int i = 0; i < dataBase.users.length; i++) {
            if (dataBase.users[i] != null) {
                if (dataBase.users[i].getUsername().equalsIgnoreCase(username)) {
                    dataBase.users[i] = null;
                    System.out.println("User " + username + " was deleted successfully.");
                    return;
                }
            }
        }
        System.out.println("There is nothing to delete. Username not found or null.");
    }

    /** This method creates standard user or admin with username */
    public AbstractUser createUser(boolean isAdmin, String username) {
        AbstractUser user;
        if (isAdmin) {
            user = new AdminUserImpl(true, username);
        } else {
            user = new UserImpl(false, username);
        }
        boolean isFull = true;
        for (int i = 0; i < dataBase.users.length; i++) {
            if (dataBase.users[i] != null && user.getUsername().equals(dataBase.users[i].getUsername())) {
                System.out.println("Username " + user.getUsername() + " already exists!");
            }
            if (dataBase.users[i] == null) {
                this.dataBase.users[i] = user;
                isFull = false;
                break;
            }
        }
        if (isFull) {
            System.out.println("No more space for new users!");
        }
        return user;
    }

    /** This method prints all information about each user */
    public void viewAllUsers() {
        for (int i = 0; i < dataBase.users.length; i++) {
            if (dataBase.users[i] != null) {
                System.out.println(dataBase.users[i].showUserInfo());
            }
        }
    }
}

