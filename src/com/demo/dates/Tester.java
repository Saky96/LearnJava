package com.demo.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) {
        AgeCalculaltor ac = new AgeCalculaltor("21/05/1992");
        System.out.println(ac.calculateAge());

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy");
//        LocalDate parsedDate = LocalDate.parse("2/11/1991", df);
//        System.out.println(parsedDate);
    }
}
