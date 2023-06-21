package com.dakr.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.Blog;

public interface BlogRepositary extends JpaRepository<Blog,Integer>{

}
