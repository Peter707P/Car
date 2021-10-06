package com.company;

public class Car {

    private boolean engine;
    private String name;
    private int cylinder;
    private int wheels;

    public Car( String name, int cylinder) {
        this.engine = true;
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
    }
    public void starEngine(){
        System.out.println("Car.startEngine(). --> engine starting in car class");
    }
    public void accelerate(){
        System.out.println("Car.accelerate(). --> accelerating in car class");
    }
    public void brake(){
        System.out.println("Car.brake(). --> braking in car class");
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
}
