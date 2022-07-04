package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entites.Category;
import com.example.course.repositories.CategoryRepositry;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepositry repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}	
	
	
	public Category findById(Long id) {
	Optional<Category>	obj=  repository.findById(id);
	return obj.get();
	}
}

