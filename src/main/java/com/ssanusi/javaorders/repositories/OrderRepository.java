package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
