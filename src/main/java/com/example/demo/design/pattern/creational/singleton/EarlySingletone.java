package com.example.demo.design.pattern.creational.singleton;

public class EarlySingletone
{
  // public instance initialized when loading the class
  private static final EarlySingletone instance = new EarlySingletone();
 
  private EarlySingletone()
  {
    // private constructor
  }
  public static EarlySingletone getInstance(){
        return instance;
    }
}