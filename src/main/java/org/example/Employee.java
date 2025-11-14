package org.example;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return this.salary * 0.10;
    }

    public void getInfo() {
        System.out.println("Namn: " + this.name + ", Löns: " + this.salary);
    }
}
