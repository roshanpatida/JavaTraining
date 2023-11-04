package com.springnewfeatures.postgres.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springnewfeatures.postgres.Entity.Product;
import com.springnewfeatures.postgres.Repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	public ProductRepository productRepository;
	
	
	@PostMapping("/addProduct")
	public Product addproduct(@RequestBody Product product) {
		return this.productRepository.save(product);
		
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return this.productRepository.findAll();
	}
	

}
