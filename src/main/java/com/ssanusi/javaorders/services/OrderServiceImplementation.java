package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Order;
import com.ssanusi.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        orderRepo.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }

    @Override
    public Order findOne(long orderNumber) {
        return orderRepo.findById(orderNumber).orElseThrow(() -> new EntityNotFoundException("Not Found " + orderNumber));
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Order order, long orderNumber) {
        return null;
    }

    @Override
    public void delete(long orderNumber) {

    }
}
