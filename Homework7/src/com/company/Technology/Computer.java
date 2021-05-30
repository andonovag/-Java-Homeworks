package com.company.Technology;

public class Computer {
    private int year;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemory;
    private double freeMemory;
    final private String OPERATIONSYSTEM = "Windows 7";


    protected void useMemory(double memory) {
        if (freeMemory > memory) {
            freeMemory -= memory;
            System.out.println(freeMemory + "GB");
        } else {
            System.out.println("Not enough free memory!");
        }
    }

    public Computer() {
        isNotebook = false;
    }

    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory) {
        this(year, price, hardDiskMemory, freeMemory);
        this.isNotebook = isNotebook;

    }

    public int comparePrice(Computer otherComp) {
        if (this.price > otherComp.price) {
            return -1;
        }
        if (this.price < otherComp.price) {
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
                ", Operation System:" + OPERATIONSYSTEM +
                ", Notebook:" + isNotebook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public double getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(double hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }

    public String getOPERATIONSYSTEM() {
        return OPERATIONSYSTEM;
    }
    public String setOPERATIONSYSTEM(String NewOperationSystem) {
        return NewOperationSystem;
    }


}
