package com.company.People;

public class Person {
    private String name;
    private int age;
    private boolean isMan = false;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }


    public void showPersonInfo() {
        System.out.println("Person name: " + this.name + " , Age: " + this.age + ", Is Man: " + this.isMan);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("The age must be greater than 0.");
        }
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}

