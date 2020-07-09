package com.boa.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {
//http://localhost:8888/virtusa-banking.properties
	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}
