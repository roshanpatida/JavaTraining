package com.in28minutes.spring.learnspringframework;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.MyWebController;


//@ComponentScan("com.in28minutes.spring.learnspringframework")
		
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperConrtaGame game = new SuperConrtaGame();
		
		
//		GamingConsole game = new MarioGame();//1 step 
//		GameRunner runner  = new GameRunner(game);//2 step
	GameRunner  runner = context.getBean(GameRunner.class);
		 runner.run();
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessServce());
	}

}
