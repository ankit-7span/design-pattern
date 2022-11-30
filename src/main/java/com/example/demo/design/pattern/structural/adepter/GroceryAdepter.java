package com.example.demo.design.pattern.structural.adepter;

public class GroceryAdepter implements Item {
    private GroceryItem item;

    public GroceryAdepter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getGroceryName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantsName() {
        return item.getGroceryStore();
    }
}
