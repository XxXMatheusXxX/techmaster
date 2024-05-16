package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class TechmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechmasterApplication.class, args);
	}

}
