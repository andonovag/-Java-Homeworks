package com.company;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;


    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void adStudent(Student s) {
        if (s.subject == groupSubject && freePlaces > 0 ) {
           students[5-freePlaces] = s;
            freePlaces--;
        }
    }

    void emptyGroup(){
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    String theBestStudent(){
        if (this.students[0] != null){
            Student bestStudent = this.students[0];
            for (int i = 1; i < this.students.length; i++) {
                if (students[i] != null && students[i].grade > bestStudent.grade){
                    bestStudent = students[i];
                }
            }
            return bestStudent.name + " " + bestStudent.grade;
        }
        return "";
    }

    void printStudentsInGroup(){
        System.out.println("Group " + groupSubject + ":");
        for (int i = 0; i < this.students.length; i++) {
            System.out.println(students[i]);
        }
    }
}



