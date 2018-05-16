package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoloConfig {
	
	// define bean for Health fortune Service
	@Bean
	public FortuneService healthFortuneService() {
		return new HealthFortuneService(); 
	}
	
	// define bean from Polo Coach
	@Bean
	public Coach poloCoach() {
		return new PoloCoach(healthFortuneService());
	}

}
