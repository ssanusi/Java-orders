package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
