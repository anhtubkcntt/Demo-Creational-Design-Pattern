package com.company.tuda.singleton.lazy;

public class DatabaseManager {

  private static DatabaseManager uniqueDatabaseManager;

  public DatabaseManager() {
  }

  public static DatabaseManager getInstance() {
    if (uniqueDatabaseManager == null) {
      uniqueDatabaseManager = new DatabaseManager();
      System.out.println("Create databaseManager: " + uniqueDatabaseManager);
    }
    return uniqueDatabaseManager;
  }

  public void getData() {
    System.out.println("get data success");
  }

  public void postData() {
    System.out.println("Post data success");
  }
}
