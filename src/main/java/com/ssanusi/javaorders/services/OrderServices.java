package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Order;

import java.util.List;
import java.util.UUID;

public interface OrderServices {

    List<Order> findAll();

    Order findOne(UUID orderNumber);

    Order save(Order order);

    Order update(Order order, UUID orderNumber);

    void delete(UUID orderNumber);
}
