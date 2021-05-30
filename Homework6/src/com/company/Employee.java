package com.company;

public class Employee extends Person {
    double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
        double hoursSalary = daySalary / 8;
        double overtime = hoursSalary * 1.5;
        if (age > 18) {
            return overtime * hours;
        } else {
         return 0;
        }
    }

    void showEmployeeInfo() {
        System.out.println("Employee name: " + this.name + " , Age: " + this.age + ", Is Man: " + this.isMan + ", Day Salary: " + this.daySalary);
    }
}


