package com.company.People;

import com.company.Technology.CollegeStudent;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] array = new Person[10];

        Person pesho = new Person("Pesho", 22, true);
        Person mary = new Person("Mary", 23, false);

        Student ivan = new Student("Ivan", 23, true, 6);
        Student galya = new Student("Galya", 24, false, 5.80);

        Employee elena = new Employee("Elena", 20, false, 220);
        Employee georgi = new Employee("Georgi", 23, true, 250);

        elena.setAge(-2);

        CollegeStudent petya = new CollegeStudent("Petya", 24,false,true);
        petya.setAge(-5);

        petya.showPersonInfo();
        petya.showCollegeStudentInfo();
        System.out.println(petya.toString());



        array[0] = georgi;
        array[1] = galya;
        array[2] = elena;
        array[3] = pesho;
        array[4] = ivan;
        array[5] = mary;

        for (int i = 0; i < array.length; i++) {
            Person p = array[i];
            if (p != null && p instanceof Student) {
                ((Student) p).showStudentInfo();
            } else if (p != null && p instanceof Employee) {

                ((Employee) p).showEmployeeInfo();
            } else if (p != null && p instanceof Person) {
                p.showPersonInfo();
            }
        }

        for (int i = 0; i < array.length; i++) {
            Person p = array[i];
            if (p != null && p instanceof Employee) {
                ((Employee) p).showEmployeeInfo();
                System.out.println("Overtime is: " + ((Employee) p).calculateOvertime(2));
            }
        }


    }
}
