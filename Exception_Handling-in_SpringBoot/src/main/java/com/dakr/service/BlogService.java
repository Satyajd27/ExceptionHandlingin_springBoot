package com.dakr.service;

import java.util.List;

import com.dakr.entity.Blog;
import com.dakr.exception.BlogAlreadyExistsException;
import com.dakr.exception.BlogNotFoundException;

public interface BlogService {

	Blog saveBlog(Blog blog) throws BlogAlreadyExistsException;

	List getAllBlogs()throws BlogNotFoundException;

	Blog getBlogById(int id) throws BlogNotFoundException;

}
