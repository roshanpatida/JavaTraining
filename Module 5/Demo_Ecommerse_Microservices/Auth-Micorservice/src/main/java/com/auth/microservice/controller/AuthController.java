package com.auth.microservice.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.auth.microservice.Entity.UserAuth;
import com.auth.microservice.Exception.UserException;
import com.auth.microservice.Request.LoginRequest;
import com.auth.microservice.config.JwtProvider;
import com.auth.microservice.repository.UserAuthRepository;
import com.auth.microservice.response.AuthResponse;
import com.auth.microservice.service.UserAuthService;
import com.auth.microservice.service.impl.CustomUserServiceImplemetation;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/auth")
public class AuthController {

//	private CartService cartService;
//	
//	 public AuthController(CartService cartService) {
//		this.cartService=cartService;
//	}
//	 
	 
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private UserAuthRepository userRepository;
	
	@Autowired
	private UserAuthService userAuthService;
	@Autowired
	private JwtProvider jwtProvider;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private CustomUserServiceImplemetation customUserServiceImplemetation;

	@PostMapping("/signUp")
	public ResponseEntity<AuthResponse> createUserHandler(@RequestBody UserAuth user)throws UserException{
		
		
		String email = user.getEmail();
		String password = user.getPassword();
		String firstString = user.getFirstName();
		String lastString = user.getLastName();
		String role = user.getRole();
		String  mobile =user.getMobile();
		
		logger.info("+++++++++++gettng user details");
		UserAuth isEmailExist = userRepository.findByEmail(email);
		
		if(isEmailExist !=null) {
			throw new UserException("Email is already used with another account ");
			
		}
		
		UserAuth createdUser = new UserAuth();
		createdUser.setEmail(email);
//		createdUser.setPassword(password); //  before saved user we hash the password using password encoder 
		
		createdUser.setPassword(passwordEncoder.encode(password)); //  before saved user we hash the password using password encoder  // it will getting error beacause encoder password  size will be large so it will not be saved in our created fields.
		createdUser.setFirstName(firstString);
		createdUser.setLastName(lastString);
		createdUser.setRole(role);
		createdUser.setMobile(mobile);
		
				
		 UserAuth savedUser = userRepository.save(createdUser);
		  logger.info("+++++++++++ saved user details for creating token ");
     	

 
//         Cart cart = cartService.createCart(savedUser);// this is feign client based 
         
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
	
	@GetMapping("/profile")
	public ResponseEntity<UserAuth> getUserProfileHandler(@RequestHeader("Authorization")String jwt)throws UserException{
		UserAuth user = userAuthService.findUserProfileByJwt(jwt);
		return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
	}
	// this is user for rest template 
	@GetMapping("/user")
	public ResponseEntity<UserAuth> findUserProfileByJwt(@RequestHeader("Authorization")String jwt) throws UserException {
		logger.info("jwt token accessing......");
		return ResponseEntity.ok(userAuthService.findUserProfileByJwt(jwt));	
	}
	
	// this is user for rest template 
	@GetMapping("/user/{userId}")	
	public ResponseEntity<UserAuth> findUserById(@PathVariable Long userId) throws UserException{
		logger.info("find user by userId is running successfully..........");
		return ResponseEntity.ok(userAuthService.findUserById(userId));
	}
}



