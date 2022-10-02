package com.demo.assignments;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) {
//        QuadraticEquation qe = new QuadraticEquation(1, 4, 4);
//        qe.quadraticEquationRoots();
//        qe.printResults();

//        BookMyMovie bm = new BookMyMovie(103, 8);
//        bm.calculateDiscount();
//        System.out.println("Total amount for booking: "+bm.calculateTicketAmount());

        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(df.format(today));
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);



    }
}
