package com.spring.project.springbootproject.repository;

import com.spring.project.springbootproject.models.Rol;
import com.spring.project.springbootproject.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
