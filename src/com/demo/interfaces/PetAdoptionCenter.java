package com.demo.interfaces;

class Dog implements Pet {

    public String cuddle() {
        return "Purring sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical bones");

    }

    @Override
    public void poo() {
        Pet.super.poo();
    }

    public void sound(){
        Pet.sound();
    }

}

class Cat implements Pet {

    public String cuddle() {
        return "Yawning sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical fish");
    }

    @Override
    public void poo(){
        System.out.println("We take cat to poop in park!");
    }
}

interface Pet{
    String cuddle();
    void eat();

//    String setPetType(String type);

    default void poo(){
        System.out.println("Pet poop!");
    }

    static void sound(){
        System.out.println("Pet sound!");
    }
}

public class PetAdoptionCenter {

//    public static void adoptPet(Dog pet) {
//        System.out.println("You have successfully adopted the dog.");
//    }
//
//    public static void adoptPet(Cat pet) {
//        System.out.println("You have successfully adopted the cat.");
//    }

        public static void adoptPet(Pet pet) {
        System.out.println("You have successfully adopted the pet.");
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog();
        adoptPet(dog1);

        Cat cat1 = new Cat();
        adoptPet(cat1);
    }
}

// Try taking out either one of the methods in the PetAdoptionCenter class and observe what will happen.

