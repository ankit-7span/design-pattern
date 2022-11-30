package com.example.demo.design.pattern.creational.prototype;

public class Showroom {

    public static void main(String[] args) throws CloneNotSupportedException {
        //car blueprint
        CarPrototype car=new CarPrototype();
        car.setColour("White");
        car.setMilage(20);
        car.setTyres(4);
        car.setSeats(4);

        //bike blueprint
        BikePrototype bike=new BikePrototype();
        bike.setColour("Red");
        bike.setMilage(55);
        bike.setTyres(2);
        bike.setSeats(2);

        Vehicle cloneable = new Vehicle(car);

        Vehicle cloneVehicle = (Vehicle) cloneable.clone();
        System.out.println("First "+cloneVehicle.toString());

    }
}
