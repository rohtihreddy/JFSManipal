package com.telstra.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtProjectApplication.class, args);
	}

	@Bean
	public PasswordEncoder PasswordEncoder(){
		return NoOpPasswordEncoder.getInstance();

	}
}
