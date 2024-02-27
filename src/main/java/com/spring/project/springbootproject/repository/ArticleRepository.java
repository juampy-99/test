package com.spring.project.springbootproject.repository;

import com.spring.project.springbootproject.models.Article;
import com.spring.project.springbootproject.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
