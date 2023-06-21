package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.Blog;
import com.dakr.exception.BlogAlreadyExistsException;
import com.dakr.exception.BlogNotFoundException;
import com.dakr.repositary.BlogRepositary;
@Service
public class BlogServiceImpl implements BlogService{
	 private BlogRepositary blogRepository;
	    @Autowired
	    public BlogServiceImpl( BlogRepositary blogRepository) {
	        this.blogRepository = blogRepository;
	    }
	    @Override
	    public Blog saveBlog(Blog blog) {
	        if (blogRepository.existsById(blog.getBlogId())) {
	            throw new BlogAlreadyExistsException();
	        }
	        Blog savedBlog = blogRepository.save(blog);
	        return savedBlog;
	    }
	    @Override
	    public List getAllBlogs() {
	        return (List) blogRepository.findAll();
	    }
	    @Override
	    public Blog getBlogById(int id) throws BlogNotFoundException {
	        Blog blog;
	        if (blogRepository.findById(id).isEmpty()) {
	            throw new BlogNotFoundException();
	        } else {
	            blog = blogRepository.findById(id).get();
	        }
	        return blog;
	    }

}
