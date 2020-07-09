package com.boa.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	//Eureka Server UI
	//http://localhost:8761/
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
