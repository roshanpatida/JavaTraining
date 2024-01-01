package com.microservicesUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class MicroservicesApplication {

	@Bean
	@LoadBalanced // it is used to balance a load of instance mean its distribute the load in that case it use their sevice name 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

}
