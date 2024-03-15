package com.auth.product.service.Impl;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.auth.product.exception.ProductException;
import com.auth.product.model.Category;
import com.auth.product.model.CreateProductRequest;
import com.auth.product.model.Product;
import com.auth.product.repository.CategoryRepository;
import com.auth.product.repository.ProductRepository;
import com.auth.product.service.ProductService;

import ch.qos.logback.classic.Logger;



@Service
public class ProductServiceImplementaion implements ProductService {

	Logger logger = (Logger) LoggerFactory.getLogger(ProductServiceImplementaion.class);
	@Autowired
	private ProductRepository productRepository;

	@Autowired
    private CategoryRepository categoryRepository;
    
	
	@Override
	public Product createProduct(CreateProductRequest req) {
		Category topLevel = categoryRepository.findByName(req.getTopcategory());
		logger.info("category..{}",topLevel);
		if(topLevel == null) {
		
			String name= req.getTopcategory();
			logger.info("top : {}",name);
			String name1 = req.getSecondLevelCategory();
			logger.info("second : {}",name1);
			String name2 = req.getThirdLeveCategory();
			logger.info("third : {} ",name2);
			Category topLevelCategory = new Category();
			logger.info("topLevelCategory{}",topLevelCategory);
			topLevelCategory.setName(req.getTopcategory());
			logger.info("name - {}",topLevelCategory.getName());
			topLevelCategory.setLevel(1);
			logger.info("level - {}",topLevelCategory.getLevel());
			topLevel=categoryRepository.save(topLevelCategory);
			logger.info("final save data - {}",topLevel);
			logger.info("finally saved data for toplevel category......");
		}
		
	
		Category secondLevel = categoryRepository.findByNameAndParent(req.getSecondLevelCategory(), topLevel.getName());
		logger.info("second category {}",secondLevel);
		if(secondLevel ==null) {
logger.info("second level is null : {}",secondLevel);			
			Category secondLevelCategory = new Category();
		secondLevelCategory.setName(req.getSecondLevelCategory());
		logger.info("second level name : {}",secondLevelCategory.getName());
		secondLevelCategory.setParentCategory(topLevel);
		logger.info("parent category : {}",secondLevelCategory.getParentCategory());
		secondLevelCategory.setLevel(2);
		logger.info("second level {}",secondLevelCategory.getLevel());
		
		secondLevel = categoryRepository.save(secondLevelCategory);
		logger.info("final saved second level data : {}",secondLevel);
		}
		
		Category thirdLevel = categoryRepository.findByNameAndParent(req.getThirdLeveCategory(), secondLevel.getName());
		logger.info("third level category : {}", thirdLevel);
		if(thirdLevel == null) {
			logger.info("check thirdlevel is null {}",thirdLevel);
			Category thirdLevelCategory = new Category();
			logger.info("create object third level category {}",thirdLevelCategory);
		thirdLevelCategory.setName(req.getThirdLeveCategory());
		logger.info("third level name : {}",thirdLevelCategory.getName());
		thirdLevelCategory.setParentCategory(secondLevel);
		logger.info("parent category : {}",thirdLevelCategory.getParentCategory());
		thirdLevelCategory.setLevel(3);
		logger.info("third level : {}",thirdLevelCategory.getLevel());
		thirdLevel = categoryRepository.save(thirdLevelCategory);
		logger.info("final save third level category : {}",thirdLevel.toString());
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
		logger.info("thirdlevel : {}",thirdLevel);
		product.setCategory(thirdLevel);
		logger.info("final category  : {}",product);
		product.setCreatedAt(LocalDateTime.now());
		logger.info("save Poduct succefully.");
		Product savedProduct = productRepository.save(product);
		logger.info(" final saved product {}",savedProduct);

		return savedProduct;
	     	
		
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
		logger.info("....");
		List<Product> product = productRepository.findAll();
		logger.info("product ... : {}",product);
		return product;
	}

}
