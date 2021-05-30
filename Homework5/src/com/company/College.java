package com.company;

public class College {
    public static void main(String[] args) {
        Student yordan = new Student("Yordan", "Economics", 23);
        yordan.grade = 5.30;
        yordan.upYear();
        yordan.receiveScholarship(5.5, 30);
        System.out.println("Money: " + yordan.money);

        Student elena = new Student("Elena", "Economics", 22);
        elena.grade = 5.68;
        elena.upYear();
        elena.receiveScholarship(5.5, 30);
        System.out.println("Money: " + elena.money);

        Student penka = new Student("Penka", "Economics", 22);
        penka.grade = 5.40;
        penka.upYear();
        penka.receiveScholarship(5.5, 30);
        System.out.println("Money: " + penka.money);

        Student georgi = new Student("Georgi", "Economics", 22);
        georgi.grade = 5.50;
        georgi.upYear();
        georgi.receiveScholarship(5.5, 30);
        System.out.println("Money: " + georgi.money);

        Student iva = new Student("Iva", "Economics", 22);
        iva.grade = 5.60;
        iva.upYear();
        iva.receiveScholarship(5.5, 30);
        System.out.println("Money: " + iva.money);

        Student gery = new Student("Gery", "Economics", 22);
        gery.grade = 5.70;
        gery.upYear();
        gery.receiveScholarship(5.5, 30);
        System.out.println("Money: " + gery.money);

        Student pesho = new Student("Pesho", "Finance", 24);
        pesho.grade = 5.80;
        pesho.upYear();
        pesho.receiveScholarship(5.5, 30);
        System.out.println("Money: " + pesho.money);

        Student mary = new Student("Mary", "Finance", 20);
        mary.grade = 5.90;
        mary.upYear();
        mary.upYear();
        mary.upYear();
        mary.receiveScholarship(5.5, 30);
        System.out.println("Money: " + mary.money);


        Student[] candidates = {yordan, elena, penka, georgi, iva, gery, pesho, mary};

        StudentGroup finance = new StudentGroup("Finance");
        StudentGroup economics = new StudentGroup("Economics");

        StudentGroup[] availableGroups = {finance, economics};


        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < availableGroups.length; j++) {
                availableGroups[j].adStudent(candidates[i]);
            }
        }

        for (int i = 0; i < availableGroups.length; i++) {
            availableGroups[i].printStudentsInGroup();
        }

        System.out.println("The best student in Economics: " + economics.theBestStudent());
        System.out.println("The best student in Finance: " + finance.theBestStudent());

        economics.emptyGroup();
        economics.printStudentsInGroup();


    }
}
