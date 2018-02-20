package com.luv2code.springdemoWithAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fort) {
//		fortuneService=fort;
//	}
	
	public TennisCoach() {
		System.out.println("i'm in the constructor");
	}
	
	public String getDailyWorkout() {
		
		return "tennis coach is executed";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("i'm in the setter");
		this.fortuneService = fortuneService;
	}
*/
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("start-init method");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("destroy method");
	}
	

}
