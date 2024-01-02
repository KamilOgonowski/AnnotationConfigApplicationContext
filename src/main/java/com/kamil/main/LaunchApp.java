package com.kamil.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kamil.config.ConfigTest;

import org.springframework.context.ApplicationContext;

public class LaunchApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
	}

}
