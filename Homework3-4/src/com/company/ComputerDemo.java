package com.company;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer hp = new Computer();
        hp.year = 2008;
        hp.price = 1650.50;
        hp.hardDiskMemory = 200;
        hp.freeMemory = 128;
        hp.operationSystem = "Windows Vista";
        hp.isNotebook = false;

        Computer dell = new Computer();
        dell.year = 2018;
        dell.price = 2850.50;
        dell.hardDiskMemory = 512;
        dell.freeMemory = 200;
        dell.operationSystem = "Winows 7";
        dell.isNotebook = true;

        hp.useMemory(100);
        dell.changeOperationSystem("Windows 10");

        System.out.println("HP configuration:");
        System.out.println("Year: " + hp.year);
        System.out.println("Price: " + hp.price + " lv");
        System.out.println("Hard Disk Memory: " + hp.hardDiskMemory + " GB");
        System.out.println("Free Disk Memory: " + hp.freeMemory + " GB");
        System.out.println("Operation System: " + hp.operationSystem);
        System.out.println("Notebook: " + hp.isNotebook);

        System.out.println("Dell configuration:");
        System.out.println("Year: " + dell.year);
        System.out.println("Price: " + dell.price + " lv");
        System.out.println("Hard Disk Memory: " + dell.hardDiskMemory + " GB");
        System.out.println("Free Disk Memory: " + dell.freeMemory + " GB");
        System.out.println("Operation System: " + dell.operationSystem);
        System.out.println("Notebook: " + dell.isNotebook);
    }
}
