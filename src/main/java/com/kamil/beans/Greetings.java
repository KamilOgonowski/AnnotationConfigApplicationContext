package com.kamil.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="hello")
public class Greetings {
	
	static {
		System.out.println("Loading of Greetings class");
	}
	
	@Autowired
//	@Qualifier(value = "getBeanFromConfig2") // to avoid ambiguity and to enable setter injection - in case of more than one specyfic bean
	private LocalDateTime dateTime;
	
	public Greetings() {
		System.out.println("Greetings bean has been created!");
	}
	
	public void testOrder() {
		System.out.println("testOrder method");
	}
	
	public void greet(String name) {
		int hour = dateTime.getHour();
		
		if(hour>8) 
			System.out.println("Good morning " + name);
		else if(hour>12)
			System.out.println("Good afternoon " + name);

		else if(hour>20)
			System.out.println("Good evening " + name);
		else
			System.out.println("Time to go to get some sleep " + name + "!");
	}
	
	
	

}
