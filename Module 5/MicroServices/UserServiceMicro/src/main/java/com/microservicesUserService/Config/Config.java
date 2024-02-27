package com.microservicesUserService.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.web.client.RestTemplate;



@Configuration
public class Config {

	@Autowired
	private ClientRegistrationRepository clientRegistrationRepository;

	@Autowired
	private OAuth2AuthorizedClientRepository auth2AuthorizedClientRepository;

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		// make add Interceptor
		List<ClientHttpRequestInterceptor> httpRequestInterceptors = new ArrayList<>();
		httpRequestInterceptors.add(new RestTemplateInterceptor(
				auth2AuthorizedClientManager(clientRegistrationRepository, auth2AuthorizedClientRepository)));
		restTemplate.setInterceptors(httpRequestInterceptors);

		return restTemplate;
	}

	// Declare the bean of the OAuth2AuthorizedClientManager for the interceptor of
	// the adding header
	@Bean
	public OAuth2AuthorizedClientManager auth2AuthorizedClientManager(
			ClientRegistrationRepository clientRegistrationRepository,
			OAuth2AuthorizedClientRepository auth2AuthorizedClientRepository) {

		OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder().clientCredentials()
				.build();

		DefaultOAuth2AuthorizedClientManager defaultOAuth2AuthorizedClientManager = new DefaultOAuth2AuthorizedClientManager(
				clientRegistrationRepository, auth2AuthorizedClientRepository);
		defaultOAuth2AuthorizedClientManager.setAuthorizedClientProvider(provider);
		return defaultOAuth2AuthorizedClientManager;
	}
}