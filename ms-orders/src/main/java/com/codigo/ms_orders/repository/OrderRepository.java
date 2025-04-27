package com.codigo.ms_orders.repository;

import com.codigo.ms_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
