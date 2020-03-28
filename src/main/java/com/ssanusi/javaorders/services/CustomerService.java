package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(long customerCode);

    Customer save(Customer customer);

    Customer update(Customer customer, long customerCode);

    void delete(long customerCode);

    List<Customer> findCustomerByName(String customer);
}
