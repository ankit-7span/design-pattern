package com.example.demo.design.pattern.creational.singleton;

public class LazySingletone {
    // private instance, so that it can be
    // accessed by only by getInstance() method
  private static LazySingletone instance;

  private LazySingletone() {
        // private constructor
    }

  private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    //method to return instance of class
    public static LazySingletone getInstance() {
        if (instance == null) {
            // if instance is null, initialize
            instance = new LazySingletone();
        }
        return instance;
    }
}