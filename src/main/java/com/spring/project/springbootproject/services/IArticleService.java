package com.spring.project.springbootproject.services;

import com.spring.project.springbootproject.dtos.ArticleDTO;


import java.util.List;

public interface IArticleService {
    List<ArticleDTO> getAll();
    ArticleDTO getArticle(String uuid);
    ArticleDTO deleteArticle(String uuid);
    ArticleDTO createArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(ArticleDTO articleDTO);
}
