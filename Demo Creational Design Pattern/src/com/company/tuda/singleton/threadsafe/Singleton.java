package com.company.tuda.singleton.threadsafe;

public class Singleton {

  private static Singleton uniqueInstance;

  private static boolean firstThread = true;

  private Singleton() {
  }

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      simulateRandomActivity();
      uniqueInstance = new Singleton();
      System.out.println("Creating unique instance of Singleton");
    }
    System.out.println("Returning instance of Singleton");
    return uniqueInstance;
  }

  private static void simulateRandomActivity() {
    try {
      if (firstThread) {
        firstThread = false;
        System.out.println("sleeping...");
        // This nap should give the second thread enough time
        // to get by the first thread.
        Thread.currentThread().sleep(50);
      }
    } catch (InterruptedException ex) {
      System.out.println("Sleep interrupted");
    }
  }
}
