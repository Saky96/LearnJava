package com.demo.maps;

import java.util.*;

public class Project {
    public static void main(String[] args) {
        ArrayList<String> empList = new ArrayList<>(Arrays.asList("Ajay","Sachin","Kamal","Swati","Ajay","Rahul","Amit")) ;
        Map<String,Integer> empDetails = new HashMap<>();

        //write the solution for the above mentioned problem

        for (String emp: empList) {
            empDetails.put(emp, emp.length());
        }
        System.out.println(empDetails);

        Set<Map.Entry<String, Integer>> empEntry = empDetails.entrySet();
        System.out.println(empEntry);

        int valueLen = 0;
        for(Map.Entry empE : empEntry){
            System.out.println(empE.getKey()+"-"+empE.getValue());
            if(valueLen < (int) empE.getValue()){
                valueLen = (int) empE.getValue();
            }
        }
        for(Map.Entry empE : empEntry){
            if(valueLen == (int) empE.getValue()){
                System.out.println("Employee with maximum number of projects: "+empE.getKey());
            }
        }

//        Map.Entry max = Collections.max();

    }
}
