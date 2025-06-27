package com.viniciuscunha.learningspringboot.repositories;

import com.viniciuscunha.learningspringboot.entitites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
