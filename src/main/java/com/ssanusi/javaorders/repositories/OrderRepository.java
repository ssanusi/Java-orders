package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}
