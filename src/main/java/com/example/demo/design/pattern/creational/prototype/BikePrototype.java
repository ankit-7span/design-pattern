package com.example.demo.design.pattern.creational.prototype;

public class BikePrototype extends Vehicle {

    public BikePrototype() {
    }

    public BikePrototype(BikePrototype bikeBluePrint){
        super(bikeBluePrint);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
