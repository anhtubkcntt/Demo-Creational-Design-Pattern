package com.company.tuda.singleton.multithread;

public class WorkingThread extends Thread {

  public void run() {
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton);
  }
}
