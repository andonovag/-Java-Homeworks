package com.company;

public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student() {
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    void upYear() {
        if (yearInCollege <= 2) {
            yearInCollege++;
            System.out.println(this.name + " year in college: " + yearInCollege);
        } else {
            isDegree = true;
            System.out.println("The student has graduated.");
        }
    }

    double receiveScholarship(double min, double amount) {
        if (grade >= min && age < 30) {
            return money += amount;
        } else {
            return money;
        }
    }

    public String toString() {
        return "Student:" + name;
    }

}

