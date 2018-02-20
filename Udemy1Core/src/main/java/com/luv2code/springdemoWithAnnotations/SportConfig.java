package com.luv2code.springdemoWithAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemoWithAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define a bean for our fortune service
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	// define a bean for our coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
