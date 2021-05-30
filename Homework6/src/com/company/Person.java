package com.company;

public class Person {
    String name;
    int age;
    boolean isMan = false;

    Person(String name, int age, boolean isMan) {
    this.name = name;
    this.age = age;
    this.isMan = isMan;
    }


    void showPersonInfo() {
        System.out.println("Person name: " + this.name + " , Age: " + this.age + ", Is Man: " + this.isMan);
    }

}
