package com.demo.set;

import com.demo.arrayList.Employee;

import java.util.*;

public //Make necessary changes to the Student class
class Student implements Comparable<Student> {

    private Integer studentId;
    private String studentName;
    private Integer studentSemester;

    public Student(String studentName, Integer studentSemester, Integer studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentSemester = studentSemester;
    }

    //Getters and setters
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(Integer studentSemester) {
        this.studentSemester = studentSemester;
    }

    @Override
    public int compareTo(Student student) {
        if (student.studentId == this.studentId){
            return 0;
        }
        else if(student.studentId > this.studentId){
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        if(student.studentName.equals(this.studentName)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.studentId;
    }
}


class Tester {
    public static void main(String[] args) {

        Student student1 = new Student("Ron", 1, 101);
        Student student2 = new Student("Angela", 9, 102);
        Student student3 = new Student("Hazel", 5, 103);
        Student student4 = new Student("David", 3, 104);
        Student student5 = new Student("Alan", 4, 105);
        Student student6 = new Student("Hazel", 5, 103);
        Student student7 = new Student("Ron", 1, 101);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);

        //Implement your logic here
        Set<Student> studentSet = new LinkedHashSet<>();
        Set<Student> defaulterSet = new LinkedHashSet<>();

//        studentSet.addAll(studentList);
//        System.out.println(studentSet);

        for(Student stu : studentList){
            if(!studentSet.add(stu)){
                defaulterSet.add(stu);
//                System.out.println("Duplicate student: "+stu.getStudentName());
            }
            else {
//                System.out.println("Same student: "+ stu.getStudentName());
                System.out.println("Student Id: "+ stu.getStudentId());
                System.out.println("Student Name: "+ stu.getStudentName());
                System.out.println("Student Semester: "+ stu.getStudentSemester());
                System.out.println("");
            }

        }


        System.out.println("List of students who applied for re-evaluation for more than one subject:");
        for(Student student : defaulterSet){
//            System.out.println(student);
            System.out.println(student.getStudentName());
        }


    }
}
