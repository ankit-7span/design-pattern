package com.example.demo.design.pattern.creational.factory;

public class Factory {
    public static void main(String args[]) {
        String country = "US";
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}