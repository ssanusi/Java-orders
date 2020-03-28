package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
