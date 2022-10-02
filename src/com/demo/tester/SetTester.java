package com.demo.tester;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetTester {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "five");
//        List<String> str2 = List.copyOf(strings); // Creates an immutable list.
//        str2.add(4, "Eight");
//        System.out.println(str2);
        Set<String> set = new HashSet<>();
        set.addAll(strings);
        set.forEach(System.out::println);
    }
}
