package com.company.Technology;

import com.company.People.Person;

public class CollegeStudent extends Person {
    private boolean hasJob;
     public CollegeStudent (String name, int age, boolean isMan, boolean hasJob) {
         super(name, age,isMan);
         setName(name);
         setAge(age);
         setMan(isMan);
         this.hasJob = hasJob;
     }

    @Override
    public String toString() {
        return "CollegeStudent:" + getName() +
                " hasJob: " + hasJob; }


    public void showCollegeStudentInfo() {
        System.out.println("CollegeStudent name: " + this.getName() + " , Age: " + this.getAge() + ", Is Man: " + this.isMan() + ", Has a job: " + this.hasJob);
    }
}


