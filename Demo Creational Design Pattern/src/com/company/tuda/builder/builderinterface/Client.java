package com.company.tuda.builder.builderinterface;

import com.company.tuda.builder.builderinterface.Order.BreadType;
import com.company.tuda.builder.builderinterface.Order.OrderType;
import com.company.tuda.builder.builderinterface.Order.SauceType;

public class Client {

  public static void main(String[] args) {
    Order order = new FastFoodOrderBuilder()
        .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
        .orderSauce(SauceType.SOY_SAUCE).build();
    System.out.println(order);
  }
}
