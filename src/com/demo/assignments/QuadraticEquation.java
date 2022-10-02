package com.demo.assignments;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double discriminant, root1, root2;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Note that the inputs are now declared as doubles.
    public void quadraticEquationRoots(){
        discriminant = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        root1 = (-b + discriminant) / (2*a);
        root2 = (-b - discriminant) / (2*a);
    }

    public void printResults(){
        if (this.discriminant == 0){
            System.out.println("Equal roots root1: " +root1+ " root2: "+ root2);
        } else if (this.discriminant > 0) {
            System.out.println("the roots are real and distinct root1: " +root1+ " root2: "+ root2);
        }
        else{
            System.out.println("no real roots root1: " +root1+ " root2: "+ root2);
        }
    }

}
