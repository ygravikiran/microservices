package com.boa.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.vault.config.SecretBackendConfigurer;
import org.springframework.cloud.vault.config.VaultConfigurer;
import org.springframework.context.annotation.Bean;
@RefreshScope
@SpringBootApplication
@EnableAutoConfiguration(exclude =DataSourceAutoConfiguration.class)
@EnableEurekaClient
public class CustomerApplication {

	// To deploy
	//1) To start this program from eclipse
	//2) build the jar , right click on the project
	// Run As -> Maven build , pass argument (clean install -DskipTests -> Apply -> Run = This provides the customer-0.0.1-SNAPSHOT.jar under "E:\ygravikiran githubrepo\rpsboamsjuly2020\customer\customer\target"
	// To run this jar, go to cmd to this folder E:\ygravikiran githubrepo\rpsboamsjuly2020\customer\customer\target
	// And run the below command 
	//java -jar customer-0.0.1-SNAPSHOT.jar
	//-Dserver.port=7072 -Dspring.profiles.active=qa
	//To test the Application:
	//http://localhost:7070/swagger-ui.html
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
