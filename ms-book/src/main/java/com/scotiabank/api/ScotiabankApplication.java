package com.scotiabank.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScotiabankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScotiabankApplication.class, args);
	}

}
