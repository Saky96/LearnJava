package com.demo.overriding;

public class Traveller {
    String name;
    String id;
    double fare;

    public String getName() {
        return name;
    }

    public Traveller(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void calculateFare(){
        double baseFare = 2000;
        double serviceCharge = 11.36;
        this.fare = baseFare + (baseFare * serviceCharge) / 100;
    }

    public void displayDetails(){
        System.out.println("Traveller Details");
        System.out.println("*****************************");
        System.out.println("Traveller name  : "+ this.name);
        System.out.println("Traveller Id  : "+ this.id);
        System.out.println("Cost of travel  : "+ this.fare);
    }
}
