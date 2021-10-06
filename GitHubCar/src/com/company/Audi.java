package com.company;

public class Audi extends Car {

    public Audi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void starEngine() {
        System.out.println("Audi.startEngine(). --> engine starting in Audi class");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi.accelerate(). --> accelerating in Audi class");
    }

    @Override
    public void brake() {
        System.out.println("Audi.brake(). --> braking in Audi class");
    }

}
