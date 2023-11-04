package com.springnewfeatures.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springnewfeatures.mysql.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
}
