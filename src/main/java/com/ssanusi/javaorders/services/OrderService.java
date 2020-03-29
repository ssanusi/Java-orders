package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Order;

import java.util.List;


public interface OrderService {

    List<Order> findAll();

    Order findOne(long orderNumber);

    Order save(Order order);

    Order update(Order order, long orderNumber);

    void delete(long orderNumber);
}
