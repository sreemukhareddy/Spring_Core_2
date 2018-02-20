package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "get daily workout";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it"+fortuneService.getFortune();
	}
	
	// init method
	
	public void doMyStartUpStuff() {
		System.out.println("hey i'm inside the init method");
	}

	// destroy method
	
	public void doMyCleanUpStuff() {
		System.out.println("hey i'm inside the destroy method");
	}
}
