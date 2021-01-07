package com.luv2codespringdemo;

public class TrackCoach implements Coach {
	//default constructor
	public TrackCoach()
	{
		
	}
	private FortuneService fortuneservice;
	
    //constructor
	public TrackCoach(FortuneService fortuneservice) {
		//super();
		this.fortuneservice = fortuneservice;
	}
	@Override
	public String DialyworkOut() {
		// TODO Auto-generated method stub
		return "Run 5k daily not too late";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do It " + fortuneservice.getFortune();
	}

}
