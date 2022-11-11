package com.example.demo.design.pattern.factory;

class CurrencyFactory {
    public static Currency createCurrency(String country) {
        if (country.equalsIgnoreCase("India")) {
            return new Rupee();
        } else if (country.equalsIgnoreCase("Singapore")) {
            return new SGDDoller();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDDoller();
        }
        throw new IllegalArgumentException("No such currency");
    }
}
