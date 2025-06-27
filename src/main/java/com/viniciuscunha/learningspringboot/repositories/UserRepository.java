package com.viniciuscunha.learningspringboot.repositories;

import com.viniciuscunha.learningspringboot.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
