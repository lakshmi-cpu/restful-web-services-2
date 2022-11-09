package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestfullWebServices2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext run= SpringApplication.run(RestfullWebServices2Application.class, args);
		
		run.close();
	}

}
