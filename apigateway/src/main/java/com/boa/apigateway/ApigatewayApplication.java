package com.boa.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApigatewayApplication {

	//http://localhost:8765/api/customer/customers?userName=admin&userPwd=admin
	//http://localhost:8765/api/customer?userName=admin&userPwd=admin
		
	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
