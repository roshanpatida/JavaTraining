package com.microservicesUserService.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesUserService.Entity.User;
import com.microservicesUserService.Service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);


	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1 = userService.saveUser(user); 
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	//single user get
	@GetMapping("/{userId}")
//	@CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback") //  create fake method for handle the down microservice.
//	@Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback") // this annotation is used to  retry.
	@RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		logger.info("get single use handler : UserController");
		
			User user1 = userService.getUser(userId);
			return ResponseEntity.ok(user1);
	}
	
	
	int retryCount = 1; // this is created for count the retries.
	
	
	// creating fallback method for circuitBreaker
	public ResponseEntity<User> ratingHotelFallback(String userId,Exception ex){
		logger.info("retry count: {}", retryCount);
		retryCount++;
		User user = User.builder()
				.email("patidarroshan@gmail.com")
				.name("Dummy")
				.about("This user is created dummy because some service is down")
				.userId("12345")
				.build();
		
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	
	// get all users
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> user = userService.getAllUser();
		return ResponseEntity.ok(user);
	}}
