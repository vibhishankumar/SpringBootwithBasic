package com.luv2codespringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Load spring configuration file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach thecoach=context.getBean("myCoach", Coach.class);
		
		//call methods on the beans
		System.out.println(thecoach.DialyworkOut());
		//Let's call new method for our fortune service
		System.out.println(thecoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
