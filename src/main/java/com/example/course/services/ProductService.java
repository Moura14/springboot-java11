package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entites.enums.Product;
import com.example.course.repositories.ProductRepositry;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepositry repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}	
	
	
	public Product findById(Long id) {
		Optional<Product>	obj=  repository.findById(id);
	return obj.get();
	}
}

