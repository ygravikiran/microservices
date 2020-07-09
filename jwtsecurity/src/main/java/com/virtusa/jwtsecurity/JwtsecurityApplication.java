package com.virtusa.jwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtsecurityApplication.class, args);
	}
	
}
/*
http://localhost:9093/signup

{
    "userName":"admin",
    "password":"admin",
    "roles":[
        {"roleName":"ROLE_USER"},
        {"roleName":"ROLE_ADMIN"}
    
    ]
}


http://localhost:9093/signin

{
  "userName":"admin",
  "userPwd":"admin"
}
*/