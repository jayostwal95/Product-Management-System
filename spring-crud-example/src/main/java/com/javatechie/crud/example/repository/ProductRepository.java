package com.javatechie.crud.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> saveAll(List<Product> products);

	Product findByName(String name);

	
}

