package com.kamil.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.kamil"})
public class ConfigTest {
	static {
		System.out.println("Loading of ConfigTest class");
	}
	
	public ConfigTest() {
		System.out.println("ConfigTest obj has been created");
	}
	
	
	@Bean
	public LocalDateTime getBeanFromConfig() {
		System.out.println("Object of LocalDateTime type created by me, but converted to be managed by Spring");
		return LocalDateTime.now();
		
	}
	
//	@Bean
//	public LocalDateTime getBeanFromConfig2() {
//		System.out.println("2 Object of LocalDateTime type created by me, but converted to be managed by Spring");
//		return LocalDateTime.now();
//	}

}
