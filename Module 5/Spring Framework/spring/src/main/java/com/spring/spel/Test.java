package com.spring.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spel/stereotype.xml");
		Demo d = (Demo) context.getBean("demo");
		System.out.println(d);
//		SpelExpressionParser ss = new SpelExpressionParser();
//		Expression ss1= (Expression) ss.parseExpression("22+43");
//		System.out.println(ss1);
//		
	}
}
