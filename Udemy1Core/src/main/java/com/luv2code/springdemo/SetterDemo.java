package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach=context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getTeam());
		
		context.close();
	}

}
