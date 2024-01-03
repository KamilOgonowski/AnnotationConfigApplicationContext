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
	
	 /* I do not have access to class LocalDateTime to use @Component or another tag to create a bean,
		therefore I used a method which returns an object of LocalDateTime which then will be converted into a bean
		and injected to Greetings class by setter injection performed as a result of @Autowire. */
	@Bean
	public LocalDateTime getBeanFromConfig() {
		System.out.println("Object of LocalDateTime type created by me, but converted to be managed by Spring");
		return LocalDateTime.now();
		
	}
	
//	@Bean  // another bean added for test reasons - it force me to use @Qualifier annotaiton in Greetings class -> instance field
//	public LocalDateTime getBeanFromConfig2() {
//		System.out.println("2 Object of LocalDateTime type created by me, but converted to be managed by Spring");
//		return LocalDateTime.now();
//	}

}
