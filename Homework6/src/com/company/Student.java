package com.company;

public class Student extends Person {
    double score;



    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.score = score;
    }

    void showStudentInfo() {
        System.out.println("Student name: " + this.name + " , Age: " + this.age + ", Is Man: " + this.isMan + "Score: " + this.score);
    }


}
