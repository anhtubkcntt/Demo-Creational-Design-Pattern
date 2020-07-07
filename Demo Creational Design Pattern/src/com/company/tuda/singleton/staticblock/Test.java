package com.company.tuda.singleton.staticblock;

public class Test {

  public static void main(String[] args) {
    DatabaseManager databaseManager1 = DatabaseManager.getInstance();
    System.out.println(databaseManager1);
    DatabaseManager databaseManager2 = DatabaseManager.getInstance();
    System.out.println(databaseManager2);
  }
}
