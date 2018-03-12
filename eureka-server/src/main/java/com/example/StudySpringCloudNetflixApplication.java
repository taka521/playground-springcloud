package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StudySpringCloudNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringCloudNetflixApplication.class, args);
	}
}
