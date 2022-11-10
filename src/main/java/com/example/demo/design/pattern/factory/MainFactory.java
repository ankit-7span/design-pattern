package com.example.demo.design.pattern.factory;

public class MainFactory {
    public static void main(String[] args) {
        FactoryPattern.Person male = FactoryPattern.PersonFactory.getPerson("Robinhood", "M");
        System.out.println(male.getNameAndSalutation());

        FactoryPattern.Person female = FactoryPattern.PersonFactory.getPerson("Mary", "F");
        System.out.println(female.getNameAndSalutation());
    }
}
