package com.example.demo.design.pattern.structural.adepter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items=new ArrayList<>();
        //items.add(new FoodItem());
        //Adepter grocery which was incompatible with food.
        items.add(new GroceryAdepter(new GroceryProduct()));

        items.forEach(item -> {
            System.out.println(item.getItemName());
            System.out.println(item.getRestaurantsName());
            System.out.println(item.getPrice());
        });

    }
}
