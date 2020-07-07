package com.company.tuda.singleton.eager;

public class DatabaseManager {

  private static final DatabaseManager instance = new DatabaseManager();

  //private constructor to avoid client applications to use constructor
  private DatabaseManager(){}

  public static DatabaseManager getInstance(){
    return instance;
  }
}
