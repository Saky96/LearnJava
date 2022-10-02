package com.demo.inheritence;

public class Tester {
    public static void main(String[] args) {

        PermanentEmployee emp1 = new PermanentEmployee(1001, "Anil", 10000, 1500, 3);
        emp1.calculateSalary();
        System.out.println("Permanent employee your salary is: "+ emp1.getSalary());
        ContractEmployee emp2 = new ContractEmployee(1002, "Ankit", 500, 10);
        emp2.calculateSalary();
        System.out.println("Contract employee your salary is: "+emp2.getSalary());
    }
}
