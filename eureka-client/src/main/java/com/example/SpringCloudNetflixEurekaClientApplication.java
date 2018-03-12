package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudNetflixEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaClientApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "Eureka Client";
	}
}
