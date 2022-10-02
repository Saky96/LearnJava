package com.demo.arrayList;

import com.demo.abstracts.Student;

import java.util.ArrayList;
import java.util.Arrays;


public class Tester {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("Saksham", 101, "Development"));
        empList.add(new Employee("Shaurya", 102, "Finance"));
        empList.add(new Employee("Avi", 101, "Sales"));

//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Sonali");
//        names.add("Sachin");
//        names.add("Sujata");

        String[] names = {"Sonali", "Sachin", "Sujata"};

        System.out.println(empList);
        System.out.println(names);
        System.out.println(Arrays.toString(names));
    }


}
