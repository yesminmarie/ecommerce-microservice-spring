package io.github.yesminmarie.orderservice.repository;

import io.github.yesminmarie.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
