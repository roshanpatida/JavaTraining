package com.microservicesUserService.Config.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;


@Configuration
@Component
public class FeignClientInterceptor implements RequestInterceptor {

	
	
 @Autowired
	private OAuth2AuthorizedClientManager manager;  // it is interface using this we get token value
		
		
	@Override
	public void apply(RequestTemplate template) {
String token =  manager.authorize(OAuth2AuthorizeRequest.withClientRegistrationId("my-internal-client").principal("internal").build()).getAccessToken().getTokenValue();


		template.header("Authorization", "Bearer "+token); // we need to get token value so from oauthAthprizedToken we get token value  and add header then send request.
	}
	
	
	

}
