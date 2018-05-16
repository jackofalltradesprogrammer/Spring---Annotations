package com.luv2code.springdemo;

public class PoloCoach implements Coach {

	private FortuneService fortuneService;
	
	public PoloCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ride your horse for 100 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
