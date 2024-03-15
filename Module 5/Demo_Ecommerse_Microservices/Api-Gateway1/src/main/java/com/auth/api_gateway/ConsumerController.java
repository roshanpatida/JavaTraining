package com.auth.api_gateway;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.*;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//public class ConsumerController{
//
//    private final RestTemplate restTemplate;
//
//    @Value("${consumer.service.url}")
//    private String consumerServiceUrl; // URL of the consumer microservice
//
//    @Autowired
//    public ConsumerController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public String callConsumerService(String jwtToken) {
//        try {
//            HttpHeaders headers = new HttpHeaders();
//            headers.set("Authorization", "Bearer " + jwtToken);
//            HttpEntity<String> entity = new HttpEntity<>(headers);
//
//            ResponseEntity<String> response = restTemplate.exchange(
//                    consumerServiceUrl + "/consume",
//                    HttpMethod.GET,
//                    entity,
//                    String.class
//            );
//
//            if (response.getStatusCode() == HttpStatus.OK) {
//                return response.getBody();
//            } else {
//                throw new RuntimeException("Failed to call consumer service. Status code: " + response.getStatusCode());
//            }
//        } catch (Exception e) {
//            throw new RuntimeException("Error while calling consumer service: " + e.getMessage());
//        }
//    }
//}


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController{

    @GetMapping("/consume")
    public ResponseEntity<String> consumeEndpoint(@RequestHeader("Authorization") String authorizationHeader) {
        String jwtToken = authorizationHeader.replace("Bearer ", "");

        // Now you have the JWT token, you can use it for authentication or any other purposes
        
        return ResponseEntity.ok("Received JWT token: " + jwtToken);
    }
}

