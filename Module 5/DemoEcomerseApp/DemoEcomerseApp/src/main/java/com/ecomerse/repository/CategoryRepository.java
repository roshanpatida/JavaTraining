package com.ecomerse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomerse.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	public Category findByName(String name);
	
	@Query("Select c from Category c where c.name =:name And c.parentCategory = :parentCategory")
	public Category findByNameAndParent(@Param("name")String name,@Param("parentCategory") String parentCategory);
	
	
}
