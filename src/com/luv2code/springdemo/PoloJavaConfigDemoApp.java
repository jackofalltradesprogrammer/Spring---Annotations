package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PoloJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read Config java class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(PoloConfig.class);
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("poloCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());		
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
