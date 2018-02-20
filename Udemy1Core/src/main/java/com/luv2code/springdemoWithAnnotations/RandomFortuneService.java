package com.luv2code.springdemoWithAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] name= {"rewards","gifts","dhebbal"};
	
	Random random = new Random();

	public String getFortune() {
		// pick a random string from the array
		
		int index = random.nextInt(name.length);
		
		
		return name[index];
	}

}
