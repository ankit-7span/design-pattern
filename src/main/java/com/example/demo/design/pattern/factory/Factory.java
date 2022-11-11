package com.example.demo.design.pattern.factory;

public class Factory {
    public static void main(String args[]) {
        String country = "India";
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}