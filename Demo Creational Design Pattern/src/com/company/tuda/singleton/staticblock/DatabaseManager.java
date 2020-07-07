package com.company.tuda.singleton.staticblock;

public class DatabaseManager {

  private static DatabaseManager instance;

  private DatabaseManager() {
  }

  //static block initialization for exception handling
  static {
    try {
      instance = new DatabaseManager();
    } catch (Exception e) {
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  public static DatabaseManager getInstance() {
    return instance;
  }
}
