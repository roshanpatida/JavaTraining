package com.cachingMeven.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cachingMeven.dto.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {
	
	@Query("{'id': ?0}")
	Book updateBookName(@Param("id") int id, @Param("name") String name);
	
	@Query("{'id':?0}")
	Book updateBookCategory(@Param("id") int id, @Param("category") String name);
}

