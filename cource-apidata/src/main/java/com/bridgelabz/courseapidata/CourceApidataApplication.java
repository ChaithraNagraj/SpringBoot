package com.bridgelabz.courseapidata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CourceApidataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceApidataApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(CourceApidataApplication.class);
	  }



}
