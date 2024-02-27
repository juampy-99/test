package com.spring.project.springbootproject.mappers;

import com.spring.project.springbootproject.dtos.BlogDTO;
import com.spring.project.springbootproject.models.Blog;
import org.springframework.stereotype.Component;

@Component
public class BlogMapper {
    public BlogDTO toDTO(Blog blog){
        BlogDTO blogDTO = new BlogDTO();
        blogDTO.setUuid(blog.getUuid());
        blogDTO.setName(blog.getName());
        return blogDTO;
    }
    public Blog getBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setUuid(blogDTO.getUuid());
        blog.setName(blogDTO.getName());
        return blog;
    }
}
