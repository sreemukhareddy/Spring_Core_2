package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		
	}
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	public String getDailyWorkOut() {
		return "working";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
