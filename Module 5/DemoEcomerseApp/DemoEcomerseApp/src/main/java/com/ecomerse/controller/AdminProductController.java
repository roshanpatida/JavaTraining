package com.ecomerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Product;
import com.ecomerse.payload.ApiResponse;
import com.ecomerse.repository.ProductRepository;
import com.ecomerse.request.CreateProductRequest;
import com.ecomerse.service.ProductService;

@RestController

public class AdminProductController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public ResponseEntity<Product> createProduct(@RequestBody CreateProductRequest req){
		
		Product product = productService.createProduct(req);
		
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{productId}/delete")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Long productId) throws ProductException{
		productService.deleteProduct(productId);
		ApiResponse res = new ApiResponse();
		res.setMessage("Product deleted successfully");
		res.setSuccess(true);
		
		return new ResponseEntity<ApiResponse>(res,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> products = productService.findAllProducts();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	}
	
	@PutMapping("{productId}/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product req,@PathVariable Long productId) throws ProductException{
		Product product = productService.updateProduct(productId, req);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ApiResponse> createMultipleProduct(@RequestBody CreateProductRequest[] req){
		for(CreateProductRequest product:req) {
			productService.createProduct(product);
		}
		ApiResponse res = new ApiResponse();
		res.setMessage("Product created Successfully...");
		res.setSuccess(true);
		return new ResponseEntity<ApiResponse>(res,HttpStatus.CREATED); 
	}
	
	
	
}
