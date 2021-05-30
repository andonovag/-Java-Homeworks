package com.company.People;


public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        setName(name);
        setAge(age);
        setMan(isMan);
        this.daySalary = daySalary;
    }

    protected double calculateOvertime(double hours) {

        double hoursSalary = daySalary / 8;
        double overtime = hoursSalary * 1.5;
        if (getAge() > 18) {
            return overtime * hours;
        } else {
            return 0;
        }
    }

    public void showEmployeeInfo() {
        System.out.println("Employee name: " + this.getName() + " , Age: " + this.getAge() + ", Is Man: " + this.isMan() + ", Day Salary: " + this.daySalary);
    }
}


