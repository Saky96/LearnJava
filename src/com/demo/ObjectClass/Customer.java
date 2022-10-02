package com.demo.ObjectClass;

public class Customer {
    private int customerId;
    private String name;
    private String phone;

    public Customer(int id, String name, String phone) {
        //code here
        this.customerId = id;
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        //Output should be in given format
        return "Customer "+this.name+" with ID-"+this.customerId;
    }
    // code equals and hashCode here
    @Override
    public boolean equals(Object obj) {
        Customer custObj = (Customer) obj;
        return custObj.customerId == this.customerId && custObj.name.equals(this.name);
    }

    @Override
    public int hashCode(){
        return this.customerId;
    }
}

class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(105, "Max", "8574637281");
        Customer c2 = new Customer(109, "Nick", "9453281756");
        Customer c3 = new Customer(109, "Nick", "9453281756");
        System.out.println(c1);

        if(c2.equals(c3)){
            System.out.printf("Objects %s and %s are same!", c2, c3);
        }
        else {
            System.out.printf("Objects  %s and %s are different", c2, c3);
        }
    }
}
