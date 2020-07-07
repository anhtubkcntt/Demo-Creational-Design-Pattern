package com.company.tuda.singleton.dounlechecked;

public class TestMultiThread {

  public static void main(String[] args) {
    Thread thread1 = new WorkingThread();
    Thread thread2 = new WorkingThread();
    thread1.start();
    thread2.start();
  }
}
