package com.example.demo.design.pattern.creational.prototype;

public class CarPrototype extends Vehicle{

    public CarPrototype() {
    }

    public CarPrototype(CarPrototype car) {
        super(car);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
