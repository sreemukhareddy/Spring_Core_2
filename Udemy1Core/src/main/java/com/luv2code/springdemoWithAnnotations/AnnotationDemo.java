package com.luv2code.springdemoWithAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
		
	}

}
