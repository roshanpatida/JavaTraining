package com.ecomerse.impl;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Category;
import com.ecomerse.model.Product;
import com.ecomerse.repository.CategoryRepository;
import com.ecomerse.repository.ProductRepository;
import com.ecomerse.request.CreateProductRequest;
import com.ecomerse.service.ProductService;
import com.ecomerse.service.UserService;


@Service
public class ProductServiceImplementaion implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private CategoryRepository categoryRepository;
    
    
	@Override
	public Product createProduct(CreateProductRequest req) {
		Category topLevel = categoryRepository.findByName(req.getTopcategory());
		
		if(topLevel == null) {
			Category topLevelCategory = new Category();
			topLevelCategory.setName(req.getTopcategory());
			topLevelCategory.setLevel(1);
			
			topLevel=categoryRepository.save(topLevelCategory);
		}
		
	
		Category secondLevel = categoryRepository.findByNameAndParent(req.getSecondLevelCategory(), topLevel.getName());
		
		if(secondLevel ==null) {
			
			Category secondLevelCategory = new Category();
		secondLevelCategory.setName(req.getSecondLevelCategory());
		secondLevelCategory.setParentCategory(topLevel);
		secondLevelCategory.setLevel(2);
		
		secondLevel = categoryRepository.save(secondLevelCategory);
		}
		
		Category thirdLevel = categoryRepository.findByNameAndParent(req.getThirdLeveCategory(), secondLevel.getName());
		
		if(thirdLevel == null) {
			
			Category thirdLevelCategory = new Category();
		thirdLevelCategory.setName(req.getThirdLeveCategory());
		thirdLevelCategory.setParentCategory(secondLevel);
		thirdLevelCategory.setLevel(3);
		
		thirdLevel = categoryRepository.save(thirdLevelCategory);
		
		}
		
		Product product = new Product();
		
		product.setTitle(req.getTitle());
		product.setColor(req.getColor());
		product.setDiscription(req.getDescription());
		product.setDiscountPrice(req.getDiscountedPrice());
		product.setDiscountPersent(req.getDiscountPersent());
		product.setImageUrl(req.getImageUrl());
		product.setBrand(req.getBrand());
		product.setPrice(req.getPrice());
		product.setSizes(req.getSize());
		product.setQuantity(req.getQuantity());
		product.setCategory(thirdLevel);
		product.setCreateAt(LocalDateTime.now());
		
		return productRepository.save(product);
		
		
	}

	@Override
	public String deleteProduct(Long productId) throws ProductException {
		Product product = findProductById(productId);
		product.getSizes().clear();// it clear the sizes because at the time of delete product it will not face issues.
		productRepository.delete(product);
		return "Deleted product Successfully.......";
	}

	@Override
	public Product updateProduct(Long productId, Product product) throws ProductException {
		Product product1 = findProductById(productId);
		if(product.getQuantity()!= 0 ) {
			product.setQuantity(product.getQuantity());
		}
		
			return productRepository.save(product1);
	}

	@Override
	public Product findProductById(Long id) throws ProductException {
		Optional<Product> opt = productRepository.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new ProductException("Product not found with id "+id);
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
		
		
		Pageable pageable = PageRequest.of(pageNumber,pageSize);
		
		List<Product> products = productRepository.filterProducts(category, minPrice, maxPrice, minDiscount, sort);
		
		if(colors.isEmpty()) {
			
			products=products.stream().filter(p->colors.stream().anyMatch(c->c.equalsIgnoreCase(p.getColor())))
					.collect(Collectors.toList());
			
		}
		
		if(stock!= null) {
			if(stock.equals("in_stock")){
				products=products.stream().filter(p->p.getQuantity()>0).collect(Collectors.toList());	
			}
			else if(stock.equals("out_of_stock")) {
				products = products.stream().filter(p->p.getQuantity()<1).collect(Collectors.toList());
			}
		}
		
		int startIndex  = (int) pageable.getOffset();
		int endIndex= Math.min(startIndex + pageable.getPageSize(), products.size());
		
		List<Product> pageContent = products.subList(endIndex, endIndex);
		
		Page<Product> filteredProducts =  new PageImpl<>(pageContent,pageable,products.size());
		return filteredProducts;
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> product = productRepository.findAll();
		return product;
	}

}
