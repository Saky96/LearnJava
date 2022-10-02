package com.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExcercise{
    public static void main(String[] args) {
        //Input

        List<String> names=new ArrayList<String>();
        names.add("Jack");
        names.add("John");
        names.add("Jill");
        names.add("Jim");
        names.add("Garry");
        names.add("Frank");
        names.add("Joseph");

        // Write your code here
        names.stream().filter(name -> name.length() == 4 && name.charAt(0) == 'J').
                sorted().
                forEach(System.out::println);
    }

}