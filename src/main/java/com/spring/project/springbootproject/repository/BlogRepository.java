package com.spring.project.springbootproject.repository;

import com.spring.project.springbootproject.models.Blog;
import com.spring.project.springbootproject.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
