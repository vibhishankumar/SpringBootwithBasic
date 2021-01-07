package com.luv2codespringdemo;

public class BaseballCoach implements Coach {
	//define private field for dependency
	private FortuneService fortuneservice;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneservice=theFortuneService;
	}
	@Override
	public String DialyworkOut()
	{
		return "Spend minimum 30 minutes on coding ";
	}
	@Override
	public String getDailyFortune() {//dependency helper
		//use my fortuneService to get fortune
		
		return fortuneservice.getFortune();
	}

}
