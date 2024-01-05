package com.microservicesUserService.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	@LoadBalanced // it is used to balance a load of instance mean its distribute the load in that case it use their sevice name in the url	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	//declare the bean of OAuthorizedClient manager
	@Bean
	public OAuth2AuthorizedClientManager  manager(
			ClientRegistrationRepository clientRegistrationRepository,
			OAuth2AuthorizedClientManager auth2AuthorizedClientManager
			
			
			){
		OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder().clientCredentials().build();
		
	DefaultOAuth2AuthorizedClientManager defaultOAuth2AuthorizedClientManager =	new DefaultOAuth2AuthorizedClientManager(clientRegistrationRepository, auth2AuthorizedClientManager);
	defaultOAuth2AuthorizedClientManager.setAuthorizedClientProvider(provider);
	return defaultOAuth2AuthorizedClientManager;
	}
}
