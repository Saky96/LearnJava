package com.demo.overriding;

public class SeniorTraveller extends Traveller {
    int age;


    public SeniorTraveller(String name, String id, int age) {
        super(name, id);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void calculateFare(){
        double baseFare = 2000;
        double serviceCharge = 11.36;
        double discountedFare = 0;
        if(this.age < 50){
            discountedFare = -1;
        }
        else if(this.age >= 50 && this.age <= 65){
            discountedFare = baseFare - (baseFare * 10) / 100;
        }
        else if(this.age > 65){
            discountedFare = baseFare - (baseFare * 15) / 100;
        }

//        if(this.fare == -1){
//        }
        this.fare = discountedFare + (discountedFare * serviceCharge) / 100;
    }

    @Override
    public void displayDetails(){
        System.out.println("Senior Traveller Details");
        System.out.println("*****************************");
        System.out.println("Traveller name  : "+ this.name);
        System.out.println("Traveller Id  : "+ this.id);
        System.out.println("Traveller age  : "+ this.age);
        System.out.println("Cost of travel  : "+ this.fare);
    }
}
