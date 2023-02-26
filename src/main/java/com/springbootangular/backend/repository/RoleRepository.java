
  package com.springbootangular.backend.repository;
 
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.springbootangular.backend.model.Role;
  
 public interface RoleRepository extends JpaRepository<Role, Integer> {
  
  }
 