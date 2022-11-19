package com.devops.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.devops.*")
public class DevopswebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopswebappApplication.class, args);
	}

}
