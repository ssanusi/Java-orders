package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentRepository extends CrudRepository<Payment, UUID> {
}
