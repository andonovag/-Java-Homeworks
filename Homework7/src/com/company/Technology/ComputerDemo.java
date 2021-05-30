package com.company.Technology;

public class ComputerDemo {
    public static void main(String[] args) {
       Computer hp = new Computer(2008, 1650, false, 200, 128);
        Computer dell = new Computer(2018, 2850.50, true, 512, 200);
        Computer intel = new Computer(2010, 1650.5, 250, 200);

        int comparison = hp.comparePrice(dell);
        System.out.println("Computer from " + hp.getYear() + " is more expensive than one from " + dell.getYear() + ": " + comparison);
        comparison = hp.comparePrice(intel);
        System.out.println("Computer from " + hp.getYear() + " is more expensive than one from " + intel.getYear() + ": " + comparison);

        hp.useMemory(100);


        System.out.println(hp.getOPERATIONSYSTEM());
        hp.setOPERATIONSYSTEM("Windows 10");
        System.out.println(hp.getOPERATIONSYSTEM());

        System.out.println(dell.getOPERATIONSYSTEM());
        dell.setOPERATIONSYSTEM("Windows 10");
        System.out.println(dell.getOPERATIONSYSTEM());

        System.out.println(intel.getOPERATIONSYSTEM());
        intel.setOPERATIONSYSTEM("Windows 10");
        System.out.println(intel.getOPERATIONSYSTEM());

        System.out.println(hp.toString());
        System.out.println(dell.toString());
        System.out.println(intel.toString());
    }
}
