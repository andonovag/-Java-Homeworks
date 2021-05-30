package com.company;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer hp = new Computer(2008, 1650.5, false, 200, 128,"Windows Vista");
        Computer dell = new Computer(2018, 2850.50, true,512,200,"Windows 7");
        Computer intel = new Computer(2010, 1650.5, 250, 200);

        int comparison = hp.comparePrice(dell);
        System.out.println("Computer from " + hp.year +" is more expensive than one from " + dell.year + ": " + comparison);
        comparison = hp.comparePrice(intel);
        System.out.println("Computer from " + hp.year +" is more expensive than one from " + intel.year + ": " + comparison);

        hp.useMemory(100);
        dell.changeOperationSystem("Windows 10");

        System.out.println(hp.toString());
        System.out.println(dell.toString());
        System.out.println(intel.toString());
    }
}
