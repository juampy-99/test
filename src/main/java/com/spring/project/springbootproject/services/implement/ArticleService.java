package com.spring.project.springbootproject.services.implement;

import com.spring.project.springbootproject.dtos.ArticleDTO;
import com.spring.project.springbootproject.services.IArticleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArticleService implements IArticleService {
    @Override
    public List<ArticleDTO> getAll() {
        ArticleDTO articleDTO1= new ArticleDTO("1a2b3c","Ciencia","Estrategia");
        ArticleDTO articleDTO2= new ArticleDTO("1a2b3d","Tecnologia","BaseQ");
        List<ArticleDTO> articleDTOList = new ArrayList<>();
        articleDTOList.add(articleDTO1);
        articleDTOList.add(articleDTO2);
        return articleDTOList;
    }

    @Override
    public ArticleDTO getArticle(String uuid) {
        return new ArticleDTO("1a2b3c","Ciencia","Estrategia");
    }

    @Override
    public ArticleDTO deleteArticle(String uuid) {
        return null;
    }

    @Override
    public ArticleDTO createArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        return null;
    }
}
