package com.company.tuda.abstractfactory;

public class PlasticChair implements Chair {

  @Override
  public void create() {
    System.out.println("Create plastic chair");
  }
}
