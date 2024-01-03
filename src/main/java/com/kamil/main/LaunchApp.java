package com.kamil.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kamil.beans.Greetings;
import com.kamil.config.ConfigTest;

import org.springframework.context.ApplicationContext;

public class LaunchApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
		Greetings greetings = context.getBean("hello", Greetings.class);
		greetings.testOrder();
		greetings.greet("Kamil");
		
		
		
	}

}
