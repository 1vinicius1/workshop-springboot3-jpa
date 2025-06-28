package com.viniciuscunha.learningspringboot.repositories;

import com.viniciuscunha.learningspringboot.entitites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
