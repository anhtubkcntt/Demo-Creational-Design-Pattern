package com.company.tuda.singleton.billpugh;

public class Test {

  public static void main(String[] args) {
    BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
    System.out.println(billPughSingleton1);
    BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
    System.out.println(billPughSingleton2);
  }
}
