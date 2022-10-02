package com.demo.inheritence;

public class PermanentEmployee extends Employee {
    public double basicPay;
    public double hra;
    public int experience;

    PermanentEmployee(int empId, String name, double basicPay, double hra, int experience){
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public double getHra() {
        return hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary(){
//        double salary;
        double variableComponent;
        double percentageOfBasicPay = 0;
        if (this.experience >= 3 && this.experience < 5) {
            percentageOfBasicPay = 5;
        } else if (this.experience >= 5 && this.experience < 10) {
            percentageOfBasicPay = 7;
        } else if (this.experience >= 10) {
            percentageOfBasicPay = 12;
        }

        variableComponent = (percentageOfBasicPay * this.basicPay) / 100;
        this.salary = variableComponent + this.basicPay + this.hra;
    }


}
