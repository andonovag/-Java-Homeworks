package com.company;

public class StudentDemo {
    public static void main(String[] args) {
        Student pesho = new Student("Pesho", "Finance", 24);
        pesho.yearInCollege = 3;
        pesho.upYear();
        System.out.println(pesho.isDegree);
        pesho.money = 20;
        pesho.grade = 5.80;
        System.out.println("Pesho's grade is: " + pesho.grade);
        pesho.receiveScholarship(5.5, 30);
        System.out.println("Pesho's current amount: " + pesho.money);

        Student mary = new Student("Mary", "Finance", 20);
        mary.upYear();
        System.out.println("Mary's grade is: " + mary.grade);
        System.out.println("Mary's current amount: " + mary.money);

    }
}
