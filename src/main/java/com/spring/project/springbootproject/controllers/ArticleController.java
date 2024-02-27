package com.spring.project.springbootproject.controllers;

import com.spring.project.springbootproject.dtos.ArticleDTO;

import com.spring.project.springbootproject.services.IArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final IArticleService articleService;

    public ArticleController(IArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping()
    public List<ArticleDTO> getAll(){
        return articleService.getAll();
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<ArticleDTO> get(@PathVariable String uuid){
        return ResponseEntity.ok().body(articleService.getArticle(uuid));
    }

    @PostMapping()
    public ResponseEntity<ArticleDTO> save(@RequestBody ArticleDTO articleDTO){

        return ResponseEntity.ok().body(articleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> update(@PathVariable Integer id,@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
    }
}
