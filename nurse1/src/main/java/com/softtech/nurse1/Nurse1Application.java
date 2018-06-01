package com.softtech.nurse1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Nurse1Application {

	@RequestMapping("/")
    public String home() {
        return "Hello Nurse World";
    } 
	
	public static void main(String[] args) {
		SpringApplication.run(Nurse1Application.class, args);		
	}
}