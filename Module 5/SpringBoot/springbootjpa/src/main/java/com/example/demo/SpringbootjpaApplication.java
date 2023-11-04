package com.example.demo;

import java.util.List;
import java.util.function.Consumer;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		//create object of User 
//		User user1  = new User();
//		user1.setName("Roshan Patidar");
//		user1.setCity("Indore");
//		user1.setStatus("I am a Java Programer");
//		User user2  = new User();
//		user2.setName("Roshan Patidar");
//		user2.setCity("Indore");
//		user2.setStatus("I am a Java Programer");
//		//SAVE SINGLE USER
////		User  user = userRepository.save(user);
//		// SAVE MULTIPLE USERS AT A TIME
//		List<User> user = List.of(user1, user2);
////		System.out.println(user);
////		 Iterable<User> itr = userRepository.saveAll(user);
//		 
////		itr.forEach(User->{System.out.println()
////		});
//		
//	   Iterable<User> itr = userRepository.findAll();
//	   itr.forEach(new Consumer<User>(){
// 
//		@Override
//		public void accept(User t) {
//			// TODO Auto-generated me
//			System.out.println(t);
//			
//		}
//		   
//	   });
		
//		itr.forEach(User->{System.out.println(user);});
//	    
//		userRepository.deleteById(0);
//		System.out.println("Deleted...... ");
//		 
//		List<User> users = userRepository.findByNameAndCity("Roshan Patidar", "Indore");
//		users.forEach(e->System.out.println(e));
	   
	   //PRINT ALL USER
	   List<User> allUser = userRepository.getAllUser();
	   allUser.forEach(e->System.out.println(e));
	   
	   // PRINT USER  BY NAME
	   List<User> userByName  = userRepository.getUserByName("Roshan Patidar");
	   userByName.forEach(e->System.out.println(e));
	}

	
	
}
