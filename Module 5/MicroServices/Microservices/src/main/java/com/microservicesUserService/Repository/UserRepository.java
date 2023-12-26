package com.microservicesUserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesUserService.Entity.User;

public interface UserRepository  extends JpaRepository<User, String>{

}
