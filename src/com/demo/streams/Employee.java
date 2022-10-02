package com.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String id;
    String name;
    String department;

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class EmployeeOps{
    public static void main(String[] args) {
//        List<Employee> empList = new ArrayList<>();
//        empList.add(new Employee("101", "Saksham", "fullstack"));
//        empList.add(new Employee("102", "Pallav", "python"));
//        empList.add(new Employee("103", "Priyanka", "java"));
//        empList.add(new Employee("104", "Jay", "mobile"));
//        empList.add(new Employee("105", "navneet", "fullstack"));
//        empList.add(new Employee("106", "jiban", "java"));
//
//        empList.stream()
//                .filter(emp -> emp.department.equals("java"))
//                .filter(emp -> emp.name.charAt(0) == 'j')
//                .map(emp -> emp.name + " patro")
//                .forEach(emp -> System.out.println(emp));

        String name = "Saksham Saigal";

        String[] arr = name.split(" ");
//        for(String str: arr){
//            char[] chrArr = str.toLowerCase().toCharArray();
//            int begin=0;
//            int end=chrArr.length-1;
//            char temp;
//            while(end>begin){
//                temp = chrArr[begin];
//                chrArr[begin]=chrArr[end];
//                if(begin == 0){
//                    chrArr[begin] = Character.toUpperCase(chrArr[begin]);
//                }
//                chrArr[end] = temp;
//                end--;
//                begin++;
//            }
//            System.out.print(new String(chrArr) + " ");
//        }
        String reverseName = "";
        for (String str: arr) {
            char[] chrArr = str.toLowerCase().toCharArray();
            int charLen = chrArr.length;

            for (int i = charLen - 1; i >= 0; i--) {
                System.out.println(chrArr[i] + "-> " + i + " ->" + (charLen - i - 1));
                if (i == charLen - 1) {
                    chrArr[i] = Character.toUpperCase(chrArr[i]);
                }
                reverseName = reverseName + chrArr[i];
            }
            reverseName = reverseName + " ";

        }
        System.out.println(reverseName);
    }
}
