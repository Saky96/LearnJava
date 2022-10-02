package com.demo.interfaces;


interface Student{
   int TOTAL_MAXIMUM_MARKS = 400;
   void calcPercentage();
}

class Intern implements Student {
    int marksSecured;
    int projectMarks;

    public Intern(int marksheet, int projectMarks) {
        this.marksSecured = marksheet;
        this.projectMarks = projectMarks;
    }

    public int getMarksSecured() {
        return marksSecured;
    }

    public void setMarksSecured(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    public int getProjectMarks() {
        return projectMarks;
    }

    public void setProjectMarks(int projectMarks) {
        this.projectMarks = projectMarks;
    }

    public void calcPercentage(){
        if(this.marksSecured > TOTAL_MAXIMUM_MARKS){
            System.out.println("Invalid marks");
            return;
        }
        double percentage = (double) (this.marksSecured + this.projectMarks)/TOTAL_MAXIMUM_MARKS * 100;
        System.out.println("Total percentage: "+ percentage);
    }
}

class Trainee implements Student{
    int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    public int getMarksSecured() {
        return marksSecured;
    }

    public void setMarksSecured(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    public void calcPercentage(){
        if(this.marksSecured > TOTAL_MAXIMUM_MARKS){
            System.out.println("Invalid marks");
        }
        double percentage = (double) this.marksSecured / TOTAL_MAXIMUM_MARKS * 100;
        System.out.println("Total percentage: "+ percentage);
    }

}

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Intern(283, 77);
        s1.calcPercentage();
        Student s2 = new Trainee(370);
        s2.calcPercentage();
    }
}
