package com.cachingMeven.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cachingMeven.dto.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {
	
//	
//    @Query("update Book u set u.name=?2 where u.id=?1")
//    int updateAddress(long id, String name);
}

