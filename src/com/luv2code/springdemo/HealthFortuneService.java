package com.luv2code.springdemo;

public class HealthFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Eat lots of fruits and vegetables";
	}

}
