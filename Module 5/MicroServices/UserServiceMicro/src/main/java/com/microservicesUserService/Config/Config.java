package com.microservicesUserService.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	@LoadBalanced // it is used to balance a load of instance mean its distribute the load in that case it use their sevice name in the url	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
