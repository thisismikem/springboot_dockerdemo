package com.example.docker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {
	
	@GetMapping("/getDocker")
	public String sayHello() {
		return "Hello Spring Boot Docker";
	}
	
	@GetMapping("/getName")
	public String getName() {
		return "Hello Michael";
	}
	
	@GetMapping("/getSomething")
	public String getSomething() {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	
}
