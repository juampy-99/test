package com.spring.project.springbootproject.services.implement;

import com.spring.project.springbootproject.dtos.BlogDTO;
import com.spring.project.springbootproject.services.IBlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Override
    public List<BlogDTO> getAll() {
        BlogDTO blogDTO1 = new BlogDTO("1a2b3c","AGRICULTURA");
        BlogDTO blogDTO2 = new BlogDTO("1a2b3d","CIENCIA");
        List<BlogDTO> blogDTOList = new ArrayList<>();
        blogDTOList.add(blogDTO1);
        blogDTOList.add(blogDTO2);
        return blogDTOList;
    }

    @Override
    public BlogDTO getBlog(String uuid) {
        return new BlogDTO("1a2b3c","AGRICULTURA");
    }

    @Override
    public BlogDTO deleteBlog(String uuid) {
        return null;
    }

    @Override
    public BlogDTO createBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(BlogDTO blogDTO) {
        return null;
    }
}
