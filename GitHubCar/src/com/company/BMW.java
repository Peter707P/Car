package com.company;

public class BMW extends Car {

    public BMW(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void starEngine() {
        System.out.println("BMW.startEngine(). --> engine starting in BMW class");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW.accelerate(). --> accelerating in BMW class");
    }

    @Override
    public void brake() {
        System.out.println("BMW.brake(). --> braking in BMW class");
    }

}
