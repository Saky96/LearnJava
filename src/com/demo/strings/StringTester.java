package com.demo.strings;

import java.util.Locale;

public class StringTester {
    public static void main(String[] args) {
        String sen = "My name is Saksham Saigal!";
        System.out.println(sen.lastIndexOf("Saksham"));
        System.out.println(sen.substring(11, 18));
        System.out.println(sen.toUpperCase());
        System.out.println(sen.replace("Saksham", "Shaurya"));
        System.out.println(sen.endsWith("My dam"));

    }
}
