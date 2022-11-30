package com.example.demo.design.pattern.structural.adepter;

public class GroceryProduct implements GroceryItem{



    @Override
    public String getGroceryName() {
        return "Broccoli";
    }

    @Override
    public String getPrice() {
        return "60rs/KG";
    }

    @Override
    public String getGroceryStore() {
        return "Reliance Fresh";
    }
}
