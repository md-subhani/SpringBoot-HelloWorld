package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servcie.HelloWorldService;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/hi")
	public String sayHello() {
		return helloWorldService.getHelloMessage();
	}

}
