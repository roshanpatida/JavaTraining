//package feign_client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.auth.microservice.Entity.UserAuth;
//import com.auth.microservice.dto.Cart;
//
//@FeignClient(name ="CART-SERVICE")
//public interface CartService {
//
//	@PostMapping("/create")
//	public Cart createCart(@RequestBody UserAuth user);
//	
//	}
