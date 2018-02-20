package com.luv2code.springdemoWithAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		
		return "u r lky";
	}

}
