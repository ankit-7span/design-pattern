package com.example.demo.design.pattern.singleton;

public class MainSingletone {
    public static void main(String[] args) {
        LazySingletone instance = LazySingletone.getInstance();
        LazySingletone instance2 = LazySingletone.getInstance();
        System.out.println("First Instance "+instance.hashCode()+" \nSecond Instance "+instance2.hashCode());

        System.out.println("-----------------------------------------------------------");
        ChocolateBoiler instance1 = ChocolateBoiler.getInstance();
        instance1.fill();
        instance1.boil();
        System.out.println("Is empty "+instance1.isEmpty()+" \nIs boil "+instance1.isBoiled());


    }
}
