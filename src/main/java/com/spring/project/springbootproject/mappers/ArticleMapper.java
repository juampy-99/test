package com.spring.project.springbootproject.mappers;

import com.spring.project.springbootproject.dtos.ArticleDTO;
import com.spring.project.springbootproject.models.Article;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {
    public ArticleDTO toDTO (Article article){
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setUuid(article.getUuid());
        articleDTO.setTitle(article.getTitle());
        articleDTO.setReference(article.getReference());
        return articleDTO;
    }
    public Article getArticle(ArticleDTO articleDTO){
        Article article= new Article();
        article.setUuid(articleDTO.getUuid());
        article.setReference(articleDTO.getReference());
        article.setTitle(articleDTO.getTitle());
        return article;
    }
}
