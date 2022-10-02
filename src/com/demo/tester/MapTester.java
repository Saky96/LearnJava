package com.demo.tester;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapTester {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", null);
//        map.put("three", 3);
//        map.put("four", 4);
//        map.put("five", 5);
//
//        for (var val: map.values()) {
//            System.out.println("val: "+ val);
//        }

//        Map<String, Integer> map = new HashMap<>();

//        map.put("one", 1);
//        map.put("two", null);
//        map.put("three", 3);
//        map.put("four", 4);
//        map.put("five", 5);

//        for (var key: map.keySet()) {
//            map.putIfAbsent(key, -1);
//            System.out.println("key = "+key);
//        }
//
//        for (var value : map.values()) {
//            System.out.println("value = " + value);
//        }
        Map<Integer, String> map = new HashMap<>();

        map.put(1 ,"one");
        map.put(2 ,"two");
        map.put(3 ,"three");
        map.put(4 ,"four");
        map.put(5 ,"five");

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(6, "six");
        otherMap.put(7, "seven");

        map.putAll(otherMap);

//        System.out.println(map.getOrDefault("five", "UNDEFINED"));
//        map.remove(4, "four");
//        map.forEach((key, val) -> System.out.println(key + ": "+ val));
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        System.out.println("entries = " + entries);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry);
        }

        List<String> intList = IntStream.range(0, 5).mapToObj(idx -> map.getOrDefault(idx, "undefined")).collect(Collectors.toList());
        System.out.println(intList);

    }
}
