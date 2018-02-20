package com.luv2code.springdemoWithAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		if(theCoach==alphaCoach) {
			System.out.println("yeah , we're referring to the same bean");
		}
		else {
			System.out.println("no dude , it'aint the same");
		}
		context.close();
	}
}
