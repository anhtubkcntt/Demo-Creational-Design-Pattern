package com.company.tuda.builder.builderinterface;

import com.company.tuda.builder.builderinterface.Order.BreadType;
import com.company.tuda.builder.builderinterface.Order.OrderType;
import com.company.tuda.builder.builderinterface.Order.SauceType;
import com.company.tuda.builder.builderinterface.Order.VegetableType;

public interface OrderBuilder {

  OrderBuilder orderType(OrderType orderType);

  OrderBuilder orderBread(BreadType breadType);

  OrderBuilder orderSauce(SauceType sauceType);

  OrderBuilder orderVegetable(VegetableType vegetableType);

  Order build();
}
