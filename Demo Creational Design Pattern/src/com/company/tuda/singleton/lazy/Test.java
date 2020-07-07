package com.company.tuda.singleton.lazy;

public class Test {

  public static void main(String[] args) {
    DatabaseManager databaseManager1 = DatabaseManager.getInstance();
    databaseManager1.getData();
    System.out.println(databaseManager1);
    DatabaseManager databaseManager2 = DatabaseManager.getInstance();
    databaseManager2.postData();
    System.out.println(databaseManager2);

//    DatabaseManager databaseManager1 = new DatabaseManager();
//    databaseManager1.getData();
//    DatabaseManager databaseManager2 = new DatabaseManager();
//    databaseManager2.postData();
  }
}
