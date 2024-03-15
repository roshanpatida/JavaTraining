package com.auth.cart.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.auth.cart.dto.Product;


@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductService {

	
	@GetMapping("/products/id/{productId}")
	public Product findProductByIdHandler(@PathVariable Long productId);
	
}
