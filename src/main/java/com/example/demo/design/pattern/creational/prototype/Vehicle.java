package com.example.demo.design.pattern.creational.prototype;

public class Vehicle implements Cloneable {
    String colour;
    int tyres;
    double milage;
    int seats;

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        this.colour = vehicle.getColour();
        this.tyres = vehicle.getTyres();
        this.milage = vehicle.getMilage();
        this.seats = vehicle.getSeats();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "colour='" + colour + '\'' +
                ", tyres=" + tyres +
                ", milage=" + milage +
                ", seats=" + seats +
                '}';
    }
}
