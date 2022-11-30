package com.example.demo.design.pattern.structural.adepter;

public class FoodItem implements Item{
    @Override
    public String getItemName() {
        return "Burger";
    }

    @Override
    public String getPrice() {
        return "120Rs";
    }

    @Override
    public String getRestaurantsName() {
        return "Mcdonald's";
    }

}
