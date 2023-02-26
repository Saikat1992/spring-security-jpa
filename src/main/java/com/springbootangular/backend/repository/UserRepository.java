package com.springbootangular.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootangular.backend.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
