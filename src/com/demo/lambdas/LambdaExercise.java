package com.demo.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

class LambdaExercise {
    public static void main(String[] args) {

        Emp e1 = new Emp(1069001, "John", 100000, 1.0, "Manager", "M");
        Emp e2 = new Emp(1069002, "Mike", 50000, 1.7, "Systems Engineer", "M");
        Emp e3 = new Emp(1069003, "Harvey", 75000, 6.9, "Manager", "M");
        Emp e4 = new Emp(1069004, "Jessica", 25000, 3.1, "Trainee", "F");
        Emp e5 = new Emp(1069005, "Rachel", 53000, 2.0, "Support", "F");

        ArrayList<Emp> empArr = new ArrayList<>();
        empArr.add(e1);
        empArr.add(e2);
        empArr.add(e3);
        empArr.add(e4);
        empArr.add(e5);

        // Write your code here
        Consumer<Emp> displayEmp = emp -> System.out.println("Emp name: "+ emp.getName()+" Emp gender "+ emp.getGender());
//        displayEmp.accept(e1);
        for(Emp emp : empArr){
            displayEmp.accept(emp);
        }
    }
}

class Emp {
    public int id;
    public String name;
    public int salary;
    public double yearsInOrg;
    public String role;
    public String gender;

    public Emp(int id, String name, int salary, double years, String role, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.yearsInOrg = years;
        this.role = role;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(double yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
