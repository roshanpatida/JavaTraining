package com.redisGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisGradleApplication.class, args);
	}

}
