package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService{

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day random";
	}
}
