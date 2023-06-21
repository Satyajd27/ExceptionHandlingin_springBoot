package com.dakr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Blog;
import com.dakr.exception.BlogAlreadyExistsException;
import com.dakr.exception.BlogNotFoundException;
import com.dakr.service.BlogService;
@RequestMapping("api/v1")
@RestController
public class BlogController {
	private BlogService blogService;
    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @PostMapping("/blog")
    public ResponseEntity saveBlog(@RequestBody Blog blog) throws BlogAlreadyExistsException {
        Blog savedBlog = blogService.saveBlog(blog);
        return new ResponseEntity<>(savedBlog, HttpStatus.CREATED);
    }
    @GetMapping("/blogs")
    public ResponseEntity<List> getAllBlogs() throws BlogNotFoundException {
        return new ResponseEntity<List>((List) blogService.getAllBlogs(), HttpStatus.OK);
    }
    @GetMapping("blog/{id}")
    public ResponseEntity getBlogById(@PathVariable("id") int id) throws BlogNotFoundException {
        return new ResponseEntity(blogService.getBlogById(id), HttpStatus.OK);
    }
}
