package com.demo.tester;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamTester {
    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three","four", "two");
        var map = strings.stream()
                .collect(groupingBy(String::length, counting()));
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        var list = strings.stream()
                .map(String::length)
                .toList();
        System.out.println(list);
//        list.forEach(System.out::println);

        IntSummaryStatistics stats = strings.stream()
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println(stats);


//        var count = strings.stream()
//                .peek(s -> System.out.println("Starting with = " + s))
//                .map(String::length)
//                .peek(s -> System.out.println("Mapped = " + s))
//                .filter(len -> len == 3)
//                .peek(s -> System.out.println("Filtered = " + s))
//                .count();
//        System.out.println(count);

        var distinct = strings.stream().distinct().toList();
        System.out.println(distinct);

        var sortedStrings = strings.stream().distinct().sorted((str1, str2) -> str1.length() > str2.length() ? 1 : -1).toList();
        System.out.println(sortedStrings);

        List<Integer> list0 = List.of(1, 2, 3);
        List<Integer> list1 = List.of(4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9);

// 1st pattern: concat
        List<Integer> concat =
                Stream.concat(list0.stream(), list1.stream())
                        .collect(Collectors.toList());

// 2nd pattern: flatMap
        List<Integer> flatMap =
                Stream.of(list0.stream(), list1.stream(), list2.stream())
                        .flatMap(Function.identity())
                        .collect(Collectors.toList());

        System.out.println("concat  = " + concat);
        System.out.println("flatMap = " + flatMap);

        var listOfNum = List.of(6, 2, 4, 3);
        int sum = listOfNum.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
