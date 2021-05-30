package com.company;
/** This is Demo class */
public class Demo {
    public static void main(String[] args) {

        AdminUserImpl admin = new AdminUserImpl(true, "Plamen");
//        admin.createUser(true, "Petar");
//        admin.createUser(true, "Ivan");
//        admin.createUser(false, "Nasko");
//        admin.createUser(false, "Stoyan");
//        admin.createUser(false, "Marin");
//        admin.createUser(false, "Stoyan");
//        admin.createUser(false, "Viktoiya");
//        admin.createUser(false, "Mariya");
        admin.createUser(true, "Eli");
        admin.createUser(false, "Dani");
        admin.createUser(false, "Vasil");
        admin.createUser(false, "Martin");

//        admin.deleteUser("Vasil");
//        admin.deleteUser("Eli");
//        admin.deleteUser("Martin");
//        admin.deleteUser("Dani");



        admin.viewAllUsers();

        admin.deleteUser("Mariya");


        UserImpl Vili = new UserImpl(false, "Vili");
        Vili.login();

        System.out.println(Vili.showUserInfo());

        admin.deleteUser("Dani");



    }
}