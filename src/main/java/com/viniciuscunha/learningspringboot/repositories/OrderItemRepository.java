package com.viniciuscunha.learningspringboot.repositories;

import com.viniciuscunha.learningspringboot.entitites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
