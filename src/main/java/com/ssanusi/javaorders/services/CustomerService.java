package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(UUID customerCode);

    Customer save(Customer customer);

    Customer update(Customer customer, UUID customerCode);

    void delete(UUID customerCode);
}
