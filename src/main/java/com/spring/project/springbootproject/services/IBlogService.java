package com.spring.project.springbootproject.services;

import com.spring.project.springbootproject.dtos.BlogDTO;
import com.spring.project.springbootproject.models.Blog;

import java.util.List;

public interface IBlogService {
    List<BlogDTO> getAll();
    BlogDTO getBlog(String uuid);
    BlogDTO deleteBlog(String uuid);
    BlogDTO createBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(BlogDTO blogDTO);
}
