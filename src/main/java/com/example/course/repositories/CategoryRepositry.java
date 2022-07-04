package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entites.Category;

public interface CategoryRepositry  extends JpaRepository<Category, Long>{

}
