package com.ben.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(Application.class);
		
		sa.setBannerMode(Mode.OFF);
		
		sa.run(args);
	}
}
