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


}
