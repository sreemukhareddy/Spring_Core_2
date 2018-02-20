package com.luv2code.springdemoWithAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	
	@Value("${team}")
	private String team;
	
	
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		//super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		
		return "i'm not swimming today";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
