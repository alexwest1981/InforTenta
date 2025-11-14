package org.example;

public class Car {
    private String model;
    private String make;
    private int year;

    public void getVehicle(){
        System.out.println("Model: " + model + ", make: " + make + ", year: " + year);
    }

    public Car(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
}
