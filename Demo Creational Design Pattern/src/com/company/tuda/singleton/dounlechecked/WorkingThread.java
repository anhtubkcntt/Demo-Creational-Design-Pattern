package com.company.tuda.singleton.dounlechecked;

public class WorkingThread extends Thread {

  public void run() {
    long start = System.currentTimeMillis();
    // some time passes
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton);
    long end = System.currentTimeMillis();
    long elapsedTime = end - start;
    System.out.println("total time: " + elapsedTime);
  }

}
