package com.company;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] array = new Person[10];

        Person pesho = new Person("Pesho", 22, true);
        Person mary = new Person("Mary", 23, false);

        Student ivan = new Student("Ivan", 23, true, 6);
        Student galya = new Student("Galya", 24, false, 5.80);

        Employee elena = new Employee("Elena", 30, false, 220);
        Employee georgi = new Employee("Georgi", 32, true, 250);


        array[0] = georgi;
        array[1] = galya;
        array[2] = elena;
        array[3] = pesho;
        array[4] = ivan;
        array[5] = mary;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i] instanceof Student) {
                ((Student) array[i]).showStudentInfo();
            } else if (array[i] != null && array[i] instanceof Employee) {

                ((Employee) array[i]).showEmployeeInfo();
            } else if (array[i] != null && array[i] instanceof Person) {
                array[i].showPersonInfo();
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i] instanceof Employee) {
                ((Employee) array[i]).showEmployeeInfo();
                System.out.println("Overtime is: " + ((Employee) array[i]).calculateOvertime(2));
            }
        }


    }
}
