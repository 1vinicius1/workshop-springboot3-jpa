package com.viniciuscunha.learningspringboot.repositories;

import com.viniciuscunha.learningspringboot.entitites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
