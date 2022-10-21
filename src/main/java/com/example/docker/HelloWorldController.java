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
		System.out.println("Hello Spring Boot Docker");
		return "Hello Spring Boot Docker";
	}
	
	@GetMapping("/getName")
	public String getName() {
		System.out.println("Hello Michael");
		return "Hello Michael";
	}
	
	@GetMapping("/getSomething")
	public String getSomething() {
		System.out.println("Hello Something");
		//throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
		return "Hello Something";
	}
	
}
