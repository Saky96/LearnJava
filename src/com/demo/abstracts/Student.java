package com.demo.abstracts;

public abstract class Student{
    private String name;
    private int[] test;
    private String result;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getTest() {
        return test;
    }
    public void setTest(int[] test) {
        this.test = test;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    Student(String studentName){
        this.name = studentName;
    }
    //code here
    public abstract void generateResult();

    public void setTestScores(int testNumber, int testScore){

    }
}

class UndergraduateStudent extends Student{
    UndergraduateStudent(String studentName) {
        super(studentName);
    }

    //code here
    @Override
    public void generateResult(){
//        if()
    }
}

class GraduateStudent extends Student{
    GraduateStudent(String studentName) {
        super(studentName);
    }

    //code here
    @Override
    public void generateResult(){
//        if()
    }
}

class Tester{
    public static void main(String[] args) {
        //code here
        Student s1 = new UndergraduateStudent("Abhi");
        s1.setTest(new int[]{0, 44});
        System.out.println(s1.getTest()[1]);
    }
}