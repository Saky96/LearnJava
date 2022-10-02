package com.demo.overriding;

public class Tester {
    public static void main(String[] args) {
        Traveller t1 = new Traveller("Roger", "AQW1344321");
        t1.calculateFare();
        t1.displayDetails();

        Traveller t2 = new SeniorTraveller("Joey", "PJAMG7755TY", 50);
        t2.calculateFare();
        t2.displayDetails();

        Traveller t3 = new SeniorTraveller("Geeta", "PJAMG7755TY", 70);
        t3.calculateFare();
        t3.displayDetails();
    }
}
