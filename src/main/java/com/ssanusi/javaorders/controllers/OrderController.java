package com.ssanusi.javaorders.controllers;

import com.ssanusi.javaorders.models.Order;
import com.ssanusi.javaorders.services.OrderServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderServices orderServices;

    @GetMapping(value = "", produces = {"application/json"})
    public ResponseEntity<?> getAllOrders() {
        List<Order> orderList = orderServices.findAll();
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<?> getOneOrder(@PathVariable long id) {
        Order order = orderServices.findOne(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping(value = "", consumes = {"application/json"})
    public ResponseEntity<?> addOrder(@Valid @RequestBody Order order) {
        orderServices.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
