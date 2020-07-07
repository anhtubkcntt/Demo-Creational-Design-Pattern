package com.company.tuda.singleton.eager;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

  public static void main(String[] args) {
    DatabaseManager instanceOne = DatabaseManager.getInstance();
    DatabaseManager instanceTwo = null;
    try {
      Constructor[] constructors = DatabaseManager.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        //Below code will destroy the singleton pattern
        constructor.setAccessible(true);
        instanceTwo = (DatabaseManager) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(instanceOne.hashCode());
    System.out.println(instanceTwo.hashCode());
  }
}
