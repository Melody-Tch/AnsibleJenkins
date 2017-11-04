package com.SB1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication

public class SpringBoot1Application {
	
	@RequestMapping("/")
	String Home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8181 );
		SpringApplication.run(SpringBoot1Application.class, args);
	}
}
