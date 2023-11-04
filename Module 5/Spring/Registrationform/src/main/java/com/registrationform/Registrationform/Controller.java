package com.registrationform.Registrationform;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controller {

	 @RequestMapping("/register")
		public String contact() {
			System.out.println("this is contact");
			return "register";
		}
}
