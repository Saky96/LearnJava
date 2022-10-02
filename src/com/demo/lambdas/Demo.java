package com.demo.lambdas;

@FunctionalInterface
interface Printer{
    String printName(String name);
}

public class Demo {

    static void displayName(Printer nameFunc){
        System.out.println(nameFunc.printName("Anthony Gonzarvis"));
    }

    public static void main(String[] args) {
        String myName = "Saksham";
        Printer sayName = (name) -> "My name is "+ name;

//        System.out.println(sayName.printName(myName));
        displayName(sayName);
    }



}
