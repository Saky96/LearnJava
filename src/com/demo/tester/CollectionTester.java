package com.demo.tester;

import java.util.*;
import java.util.function.Predicate;

public class CollectionTester {
    public static void main(String[] args) {
//        Collection<String> strings = new ArrayList<>();
//        strings.add("one");
//        strings.add("two");
//        System.out.println("strings = " + strings);
//        boolean isPresent = strings.contains("three");
//        System.out.println(isPresent);

//        Collection<String> strings = new ArrayList<>();
//        strings.add("one");
//        strings.add("two");
//        strings.add("three");
//
//        Collection<String> first = new ArrayList<>();
//        first.add("one");
//        first.add("four");
//
//        boolean hasChanged = strings.retainAll(first);
//
//        System.out.println("Has strings changed? " + hasChanged);
//        System.out.println("strings = " + strings);

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("one");
        strings.add("two");
        strings.add("");
        strings.add("three");
        strings.add(null);

        System.out.println(strings);
        strings.removeIf(isNullOrEmpty);
        System.out.println(strings);


//        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
            else {
                iterator.remove();
            }
        }
        System.out.println(strings);
    }
}
