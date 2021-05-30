package com.company.People;

public class Student extends Person {
    private double score;


    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setName(name);
        setAge(age);
        setMan(isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        System.out.println("Student name: " + this.getName() + " , Age: " + this.getAge() + ", Is Man: " + this.isMan() + "Score: " + this.score);
    }
}
