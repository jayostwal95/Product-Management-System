package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return service.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody Product products){
		return service.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getproducts();
	}
	
	@GetMapping("/product/{id}")
	public Product findProductbyId(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public Product findProductbyName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	

	@PostMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return service.deleteproduct(id);
	}


}
