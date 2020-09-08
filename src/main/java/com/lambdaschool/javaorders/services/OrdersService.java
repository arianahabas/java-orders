package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import org.aspectj.weaver.ast.Or;

public interface OrdersService {
  Order save (Order order);
}
