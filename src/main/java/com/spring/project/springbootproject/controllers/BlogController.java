package com.spring.project.springbootproject.controllers;

import com.spring.project.springbootproject.dtos.BlogDTO;
import com.spring.project.springbootproject.dtos.UserDTO;
import com.spring.project.springbootproject.services.IBlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/blogs")
public class BlogController {
    private IBlogService blogService;

    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }
    @GetMapping()
    public List<BlogDTO> getAll(){
        return blogService.getAll();
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<BlogDTO> get(@PathVariable String uuid){
        return ResponseEntity.ok().body(blogService.getBlog(uuid));
    }

    @PostMapping()
    public ResponseEntity<BlogDTO> save(@RequestBody BlogDTO blogDTO){

        return ResponseEntity.ok().body(blogDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> update(@PathVariable Integer id,@RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
    }
}
