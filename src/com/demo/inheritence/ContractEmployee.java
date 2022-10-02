package com.demo.inheritence;

public class ContractEmployee extends Employee{
    double wage;
    int hours;

    ContractEmployee(int empId, String name, double wage, int hours){
        super(empId, name);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public int getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary(){
            this.salary = this.hours * this.wage;

    }
}
