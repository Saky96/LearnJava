package com.demo.tester;

import java.util.*;

public class ListTester {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));
        List<String> str2 = new ArrayList<>(List.of("six, seven"));
        strings.add(3, "three");
        System.out.println(strings);
        System.out.println(strings.get(4));
        strings.set(6, "five");
        System.out.println(strings);
        strings.remove(4);
        System.out.println(strings);
        strings.addAll(6, str2);
        System.out.println(strings);
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext();) {
            String nextElement = iterator.next();
            if (Objects.equals(nextElement, "three")) {
                iterator.set("3");
            }
        }
//        strings.subList(2, 5).clear();
        System.out.println(strings);
        strings.sort(Comparator.reverseOrder());
        System.out.println(strings);
        Collections.shuffle(strings);
        System.out.println(strings);

    }
}
