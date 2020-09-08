package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value ="ordersService")
public class OrdersServiceImplementation implements OrdersService {

  @Autowired
  OrdersRepository ordersrepos;

  @Override
  public Order save(Order order){
    return ordersrepos.save(order);
  }
}
