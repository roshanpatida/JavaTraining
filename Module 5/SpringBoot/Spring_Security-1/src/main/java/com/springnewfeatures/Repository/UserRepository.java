package com.springnewfeatures.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springnewfeatures.Entity.User;
import java.util.List;


@Repository
@EnableJpaRepositories
public interface UserRepository  extends JpaRepository<User,String>{
	
	 public User findByUserName(String username);

}
