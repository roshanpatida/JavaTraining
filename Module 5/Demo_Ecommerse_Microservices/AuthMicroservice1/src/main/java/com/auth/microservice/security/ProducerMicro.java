package com.auth.microservice.security;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProducerMicro {

    private final RestTemplate restTemplate;

//    @Value("${consumer.service.url}")
    private String consumerServiceUrl; // URL of the consumer microservice

    public ProducerMicro(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callConsumerService(String jwtToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + jwtToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
            consumerServiceUrl + "/consume",
            HttpMethod.GET,
            entity,
            String.class
        );

        return response.getBody();
    }
}
