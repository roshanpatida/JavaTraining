	package com.ecomerse.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.Config.JwtProvider;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.User;
import com.ecomerse.repository.UserRepository;
import com.ecomerse.request.LoginRequest;
import com.ecomerse.response.AuthResponse;
import com.ecomerse.service.CartService;
import com.ecomerse.service.CustomUserServiceImplemetation;



@RestController
@RequestMapping("/auth")
public class AuthController {

	
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtProvider jwtProvider;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private CustomUserServiceImplemetation customUserServiceImplemetation;
	
	@Autowired
	private CartService cartService;
	
//	public AuthController(UserRepository userRepository,CustomUserServiceImplemetation customUserServiceImplemetation) {
//		this.userRepository = userRepository;
//		this.customUserServiceImplemetation = customUserServiceImplemetation;
//	}
	@PostMapping("/signUp")
	public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user)throws UserException{
		
		
		String email = user.getEmail();
		String password = user.getPassword();
		String firstString = user.getFirstName();
		String lastString = user.getLastName();
		String role = user.getRole();
		String  mobile =user.getMobile();
		
		logger.info("+++++++++++gettng user details");
		User isEmailExist = userRepository.findByEmail(email);
		
		if(isEmailExist !=null) {
			throw new UserException("Email is already used with another account ");
			
		}
		
		User createdUser = new User();
		createdUser.setEmail(email);
//		createdUser.setPassword(password); //  before saved user we hash the password using password encoder 
		
		createdUser.setPassword(passwordEncoder.encode(password)); //  before saved user we hash the password using password encoder  // it will getting error beacause encoder password  size will be large so it will not be saved in our created fields.
		createdUser.setFirstName(firstString);
		createdUser.setLastName(lastString);
		createdUser.setRole(role);
		createdUser.setMobile(mobile);
		
				
		 User savedUser = userRepository.save(createdUser);
		  logger.info("+++++++++++ saved user details for creating token ");
		  Cart cart = cartService.createCart(savedUser);
     		
		Authentication  authentication = new UsernamePasswordAuthenticationToken(savedUser.getEmail(), savedUser.getPassword());
		
		SecurityContextHolder.getContext().setAuthentication(authentication); // store username and password in context holder 
		
		String  token = jwtProvider.generateToken(authentication); // jenerate token
		
		AuthResponse authResponse  = new AuthResponse();
		authResponse.setJwt(token);
		authResponse.setMessage("SingUp Successfully");
		
		
		logger.info("++++ singUp successfully");
		return new ResponseEntity<>(authResponse,HttpStatus.CREATED);
	
	    
	}
	
	@PostMapping("/signIn")
	public ResponseEntity<AuthResponse> loginUserHandler(@RequestBody LoginRequest loginRequest){
		
		
		String username = loginRequest.getEmail();
		String password = loginRequest.getPassword();
		
		Authentication authentication = authenticate(username,password);
		
		
		
SecurityContextHolder.getContext().setAuthentication(authentication); // store username and password in context holder 
		
		String  token = jwtProvider.generateToken(authentication); // jenerate token
		
		AuthResponse authResponse  = new AuthResponse();
		authResponse.setJwt(token);
		authResponse.setMessage("SingIn successfully");
		logger.info("+++++++++++++successfully signIn");
		return new ResponseEntity<>(authResponse,HttpStatus.CREATED);
	
		
		
	}


	private Authentication authenticate(String username, String password) {
		UserDetails userDetails =  customUserServiceImplemetation.loadUserByUsername(username);
		
		
		if(userDetails == null) {
			
			throw new BadCredentialsException("invalid Username and password");
		}
		
		if(!passwordEncoder.matches(password, userDetails.getPassword())) {
			throw new BadCredentialsException("Invalid password.....");
		}
		return new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());
	}
	
	
}



