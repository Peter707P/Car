package com.company;

public class Toyota extends Car {

    public Toyota(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void starEngine() {
        System.out.println("Toyota.startEngine(). --> engine starting in Toyota class");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota.accelerate(). --> accelerating in Toyota class");
    }

    @Override
    public void brake() {
        System.out.println("Toyota.brake(). --> braking in Toyota class");
    }

}
