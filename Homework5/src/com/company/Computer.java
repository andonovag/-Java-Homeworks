package com.company;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        {
            System.out.println("New operation system is: " + operationSystem);
        }
    }

    void useMemory(double memory) {
        if (freeMemory > memory) {
            freeMemory -= memory;
            System.out.println(freeMemory + "GB");
        } else {
            System.out.println("Not enough free memory!");
        }
    }

    Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this(year, price, hardDiskMemory, freeMemory);
    }

    int comparePrice(Computer otherComp) {
        if (this.price > otherComp.price){
            return -1;
        }
        if (this.price < otherComp.price){
                return 1;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "Computer configuration:" +
                ", Year:" + year +
                ", Price:" + price +
                ", Hard Disk Memory:" + hardDiskMemory +
                ", Free Disk Memory:" + freeMemory +
                ", Operation System:" + operationSystem +
                ", Notebook:" + isNotebook;
    }

}
