package com.james.springbootrevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRevisionApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}

}
