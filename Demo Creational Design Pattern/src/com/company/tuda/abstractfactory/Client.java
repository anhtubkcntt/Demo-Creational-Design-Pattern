package com.company.tuda.abstractfactory;

public class Client {

  public static void main(String[] args) {

    FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

    Chair chair = factory.createChair();
    chair.create(); // Create plastic chair

    Table table = factory.createTable();
    table.create(); // Create plastic table
  }
}
