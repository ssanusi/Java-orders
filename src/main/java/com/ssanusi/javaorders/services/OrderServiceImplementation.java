package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Order;
import com.ssanusi.javaorders.repositories.OrderRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderServiceImplementation implements OrderServices {

    private OrderRepository orderRepo;

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        orderRepo.findAll().iterator().forEachRemaining(orders::add);
        return null;
    }

    @Override
    public Order findOne(UUID orderNumber) {
        return orderRepo.findById(orderNumber).orElseThrow(() -> new EntityNotFoundException("Not Found " + orderNumber));
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Order order, UUID orderNumber) {
        return null;
    }

    @Override
    public void delete(UUID orderNumber) {

    }
}
