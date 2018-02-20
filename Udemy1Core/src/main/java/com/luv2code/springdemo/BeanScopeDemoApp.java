package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		if(coach==thecoach) {
			System.out.println("both are referring the same object " + coach + " " + " " + thecoach );
		}
		else {
			System.out.println("no they r not buddy " + coach + " " + " " + thecoach );
		}
		
		context.close();

	}

}
