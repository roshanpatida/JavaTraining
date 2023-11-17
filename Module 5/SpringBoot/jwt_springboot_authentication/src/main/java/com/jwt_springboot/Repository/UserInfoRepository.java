package com.jwt_springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt_springboot.Entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
public UserInfo findByUserName(String username);
}
