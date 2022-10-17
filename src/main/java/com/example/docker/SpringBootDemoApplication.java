package com.example.docker;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDemoApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("... SpringBootDemoApplication Started ...");
	}
	
	public static void main(String[] args) {
		logger.info("... SpringBootDemoApplication Starting ...");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
