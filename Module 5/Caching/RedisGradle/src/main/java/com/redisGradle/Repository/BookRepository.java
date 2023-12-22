package com.redisGradle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.redisGradle.Entity.Book;

import io.lettuce.core.dynamic.annotation.Param;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query("{'id': ?0}")
	Book updateBookName(@Param("id") int id, @Param("name") String name);

	@Query("{'id':?0}")
	Book updateBookCategory(@Param("id") int id, @Param("category") String name);
}
